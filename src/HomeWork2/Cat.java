package HomeWork2;

public class Cat {
    private String name;
    private int appetite;
    public boolean fullness = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(int food) {
        if (appetite <= food){
            fullness = true;
            System.out.printf("%s хватило еды, он съел %d\n", name, appetite);
        }
        else System.out.printf("%s не хватило еды, он не поел\n", name);
    }

    public boolean isFullness() {
        return fullness;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
