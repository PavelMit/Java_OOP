package Seminar6.ex001.srp;

import java.util.ArrayList;
import java.util.List;

public class SquareDrawer{
    private int scale = 1;
    private final SquareV2 square;

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public SquareDrawer(SquareV2 square, int scale) {
        this.square = square;
        this.scale = scale;
    }
    public SquareDrawer(SquareV2 square){
        this.square = square;
    }

    public void draw(){
        for (int i = 0; i < square.getSide() * scale * 2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < square.getSide() * scale  - 2; i++){
            System.out.print("*");
            for (int j = 1; j < square.getSide()*2 * scale - 1; j++)
                System.out.print(" ");
            System.out.println("*");
        }
        for (int i = 0; i < square.getSide() * scale * 2; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
