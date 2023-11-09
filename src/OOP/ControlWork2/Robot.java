package OOP.ControlWork2;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class Robot {
    private ArrayList<Toy> toys;

    protected ArrayList<Toy> waitingList;

    public Robot(ArrayList<Toy> toys) {
        this.toys = toys;
    }

    public ArrayList<Toy> getWaitingList() {
        return this.waitingList;
    }

    public void addWaitingList(Toy toy) {
        ArrayList<Toy> tempList = new ArrayList<Toy>();
        if (this.waitingList != null) {
            tempList = this.waitingList;
        }
        tempList.add(toy);
        this.waitingList = tempList;
    }
    public PriorityQueue<Toy> getPriorityList (){
        PriorityQueue priorityList = new PriorityQueue(new ToyComporator());
        for (Toy toy: this.toys){
            priorityList.add(toy);
        }
        priorityList.comparator();
        return priorityList;
    }

    public Toy winToy(){
        Random random = new Random();
        PriorityQueue<Toy> priorityList = getPriorityList();
        int counter = 1;
        while (true){
            int randomNum = random.nextInt(1, 101); // задание случайного числа от 1 до 100
            if (priorityList.size() == 0) priorityList = getPriorityList(); // перезапуск цикла с помощью переинициализации списка
            Toy currentToy = (Toy) priorityList.poll(); // текущая игрушка = первой в списке приоритетности
            System.out.printf("Попытка №%d. Достанется ли вам игрушка %s?\n", counter, currentToy.getName());
            if (currentToy.getPriority() >= randomNum){ // проверка на успех
                this.toys.remove(currentToy); //удаляем игрушку из списка всех игрушек
                this.addWaitingList(currentToy);
                return currentToy; // возврщаем текущую игрушку
            }
            System.out.println("Не повезло");
            counter++;
        }
    }

    public Toy findToy(int id) throws IdException {
        if (this.waitingList == null)
            throw new NullPointerException("Не можем выдать игрушку, так как лист ожидания пуст\n");
        for (Toy toy : this.waitingList) {
            if (toy.getId() == id) {
                return toy;
            }
        }
        throw new IdException("Не можем выдать игрушку", id);
    }
    @Override
    public String toString() {
        String result = "";
        Toy currentToy = null;
        PriorityQueue pq = this.getPriorityList();
        while ((currentToy = (Toy) pq.poll()) != null) { // Retrieves and removes
            result += currentToy.toString() + "\n";
        }
        return result;
    }
}
