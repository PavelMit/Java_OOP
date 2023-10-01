package Seminar2.ex001;

public class Cat extends Animal{
    private String color;

    public Cat(String name){
        super(name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.println("Котик мяукнул");
    }

    @Override
    public void jump() {
        System.out.println("Котик подпрыгнул");
    }
}

