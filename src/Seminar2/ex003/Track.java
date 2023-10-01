package Seminar2.ex003;

public class Track extends Obstacle{
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    int getLength() {
        return length;
    }

    @Override
    int getHeigth() {
        return 0;
    }
}
