package Seminar2.ex003;

public class Wall extends Obstacle{

    private int heigth;
    public Wall(int heigth) {

        this.heigth = heigth;
    }

    @Override
    int getLength() {
        return 0;
    }

    @Override
    int getHeigth() {
        return heigth;
    }
}
