package Lesson1.Ex003;

import java.awt.geom.Point2D;

public class Point {
    int x;
    int y;

    public Point (int valueX, int valueY){
        x = valueX;
        y = valueY;
    }
    public Point (int value){
        this(value, value);
    }

    public Point (){
        this(0);
    }
    public String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
