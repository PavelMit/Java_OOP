package OOP.Seminar4.ex002;

public class Entity implements PersonalData{
    private final String name;
    private final String inn;

    public String getName() {
        return name;
    }


    @Override
    public String getInn() {
        return null;
    }

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}

