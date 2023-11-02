package OOP.ex001.ocp1;

public class RightTriangle implements Shape{
    private int katet1;
    private int katet2;
    private double gipotenuza;

    public int getKatet1() {
        return katet1;
    }

    public int getKatet2() {
        return katet2;
    }

    public RightTriangle(int katet1, int katet2) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotenuza = Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
    }
}
