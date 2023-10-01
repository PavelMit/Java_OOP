package HomeWork2;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.printf("В тарелке %s еды\n", food);
    }

    public void addFood(int food){
        this.food = this.food + food;
        System.out.printf("В тареклу добавлено %d еды\n", food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food >= 0) this.food = food;
    }
}
