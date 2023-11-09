package OOP.ControlWork2;


//В программе должен быть минимум один класс со следующими свойствами:
//id игрушки,
//текстовое название,
//количество
//частота выпадения игрушки (вес в % от 100)

public class Toy{
    private String name;
    private int priority;
    private static int qnt;

    private static int counter = 100;
    private final int id;

    {
        id = ++counter;
        qnt++;
    }

    public Toy(String name, int priority) throws PriorityException {
        if (priority < 1 || priority > 100) {
            throw new PriorityException(String.format("Сложность может быть от 1 до 3, а вы ввели %d", priority), priority);
        }
        this.name = name;
        this.priority = priority;
    }

    public static int getQnt() {
        return qnt;
    }
    public int getId() {
        return id;
    }
    public int getPriority() {
        return priority;
    }
    public String getName() {
        return name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return String.format("[id - %d] Игрушка называется %s, вероятность выпадения %d", this.id, this.name, this.priority);
    }
}
