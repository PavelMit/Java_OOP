package Seminar3.ex001;

public abstract class Animal {
    private static int counter;
    private static int idCounter = 1000;
    private String name;
    private int maxRun;
    private int maxSwim;
    private int id;

    public static int getCounter(){
        return counter;
    }

    {
//        System.out.println("Initializer");
        id = ++idCounter;
        counter++;
    }

    static {
//        System.out.println("Initializer Static");
        idCounter = 1000;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public int getId() {
        return id;
    }

    public void run(int distance){
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        }
        else System.out.printf("%s не смог пробежать %d метров\n", name, distance);
    }

    public void swim(int distance){
        if (distance <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        }
        else System.out.printf("%s не смог проплыть %d метров\n", name, distance);
    }

    @Override
    public String toString() {
        return String.format("[%d] - %s", id, name);
    }
}
