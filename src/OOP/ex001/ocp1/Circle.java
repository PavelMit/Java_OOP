package OOP.ex001.ocp1;

public class Circle implements Shape{
    private final int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}