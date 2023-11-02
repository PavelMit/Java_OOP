package OOP.ex001.lsp;

public class Bird  {
    private int flySpeed = 10;
    private boolean canFly;

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public Bird(){
    }

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
        this.canFly = true;
    }

    public int getFlySpeed() {
        return flySpeed;
    }
    public void fly() {
        System.out.printf("Птица летит со скоростью %d км/ч\n", flySpeed);
    }
}
