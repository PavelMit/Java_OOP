package OOP.Seminar2.ex002;

public class Cat extends BaseCat implements Animal{

    @Override
    public void jump() {
        System.out.println("Кошка подпрыгнула");
    }

    @Override
    public void voice() {
        System.out.println("Кошка мяукнула");
    }
}
