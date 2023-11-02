package OOP.Seminar3.ex001;

public class Cat extends Animal{

    private static int counter;

    {
        counter++;
    }
    public static int getCounter(){
        return counter;
    }
    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Котики плавать не умеют");
    }


}
