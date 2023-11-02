package OOP.HomeWork4;

public abstract class Fruit {
    protected abstract String getType();
    private final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }
}
