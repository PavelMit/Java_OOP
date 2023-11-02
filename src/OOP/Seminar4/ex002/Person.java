package OOP.Seminar4.ex002;

public class Person implements PersonalData{
    private final String fio;
    private final String inn;

    public String getFio() {
        return fio;
    }

    @Override
    public String getInn() {
        return null;
    }
    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
