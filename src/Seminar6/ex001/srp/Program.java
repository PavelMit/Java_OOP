package Seminar6.ex001.srp;

import java.awt.image.MemoryImageSource;

public class Program {
    public static void main(String[] args) {
//        Square square = new Square(new Point(1,1), 10);
//        System.out.println("Площадь фигруы: " + square.getArea());
//        square.draw();


        SquareV2 square2 = new SquareV2(new Point(1,1), 5);
        System.out.println("Площадь фигруы: " + square2.getArea());
        SquareDrawer squareDrawer = new SquareDrawer(square2, 2 );
        squareDrawer.draw();
        squareDrawer.setScale(5);
        squareDrawer.draw();
    }
}
