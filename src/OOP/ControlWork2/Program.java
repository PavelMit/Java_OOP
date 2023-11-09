package OOP.ControlWork2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) throws PriorityException, IOException, IdException {
        Toy toy1 = new Toy("Мишка", 12); // добавляем игрушки с именем и вероятностью
        Toy toy2 = new Toy("Зайка", 41);
        Toy toy3 = new Toy("Хагиваги", 22);
        Toy toy4 = new Toy("Пистолетик", 33);
        Toy toy5 = new Toy("Самолетик", 14);
        Toy toy6 = new Toy("Машинка", 29);

        ArrayList<Toy> list_of_toys = new ArrayList<Toy>(Arrays.asList(toy1, toy2, toy3, toy4, toy5, toy6)); //добавили все игрушки в список

        System.out.println();
        Robot robot1 = new Robot(list_of_toys); //добавили список в наш робот для розыгрыша. В нем первыми пробуют разыграться игрушки с наивысшей вероятностью выигрыша.
        Scanner sc = new Scanner(System.in);

        System.out.print("[show] - показать оставшиеся для розыгрыша игрушки\n[win] - разыграть игрушку\n[wait] - посмотреть список выигранных игрушек\n[get] - получить игрушку по id\n[end] - закрыть программу\nВыберите команду: ");
        String command = sc.nextLine();
        while (command != "end"){
            if (command.equals("show")){
                System.out.println("Список всех игрушек для розыгрыша: ");
                for (Toy toy: list_of_toys){ // вывели построчно весь список игрушек
                    System.out.println(toy.toString());
                }
                System.out.println();
            }
            else if (command.equals("win")){
                Toy winToy = robot1.winToy();
                System.out.printf("Вы выиграли: %s. Получите выигрыш по id игрушки - %d\n", winToy.toString(), winToy.getId()); // Вывели разыгранную игрушку
                System.out.println();
            }
            else if (command.equals("get")){
                FileSaver fs = new FileSaver("toy", robot1); // создали объект типа FileSaver
                System.out.print("Введите id игрушки для выдачи: ");
                int idToFind = Integer.parseInt(sc.nextLine()); // запросили Id искомой игрушки
                fs.getToy(idToFind); //выдали игрушку, вывели при успехе информацию об этом, записали информацию в файл "Toys"
            }
            else if (command.equals("wait")){
                if (robot1.getWaitingList() == null || robot1.getWaitingList().size() == 0)
                    System.out.println("Лист ожидания для выдачи разыгранных игрушек пуст");
                else {
                    System.out.println("Игрушки, ожидающие выдачи:");
                    for (Toy toy: robot1.getWaitingList()){ // показали построчно лист ожидания выигранных игрушек
                        System.out.println(toy.toString());
                    }
                }
                System.out.println();
            }
            else System.out.print("Вы ввели не корректную команду, попробуйте еще раз:");
            System.out.print("Введите новую команду: "); //заходим на новый цикл
            command = sc.nextLine();
        }
         // еще раз вывели весь список игрушек

    }
}
