package Seminar6.ex001.ocp1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new RightTriangle(2,3));
        shapes.add(new Square(4));
        shapes.add(new Circle(4));
        double sumArea = 0;
        for (Shape shape: shapes){
            if (shape instanceof RightTriangle){
                RightTriangle triangle = (RightTriangle) shape;
                sumArea += triangle.getKatet1() * triangle.getKatet2() / 2.0;
            }
            if (shape instanceof Square){
                Square square = (Square) shape;
                sumArea += square.getSide() * square.getSide();

            }
            if (shape instanceof Circle){
                Circle circle = (Circle) shape;
                sumArea += Math.pow(circle.getRadius(), 2) * Math.PI;
            }
        }
        System.out.println("Площадь всех фигур равна: " + sumArea);
    }
}
