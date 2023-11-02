package OOP.HomeWork4;

public class Orange extends Fruit{
    protected String name = "Orange";
    public Orange() {
        super(1.5f);
    }

    @Override
    protected String getType() {
        return "Orange";
    }
}
