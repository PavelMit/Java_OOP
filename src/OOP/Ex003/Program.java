package OOP.Ex003;

public class Program {

    static double distance (Point a, Point b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    public static void main(String[] args) {
        Point a = new Point(10,5);
        System.out.println(a.toString());
        Point b = new Point(7);
        System.out.println(b.getInfo());
    }
}
