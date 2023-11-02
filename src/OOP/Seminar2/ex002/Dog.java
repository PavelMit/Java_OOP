package OOP.Seminar2.ex002;

public class Dog extends BaseDog implements Animal{
    @Override
    public void jump() {
        System.out.println("Собака подпрыгнула");
    }

    @Override
    public void voice() {
        System.out.println("Собака лает");
    }
}
