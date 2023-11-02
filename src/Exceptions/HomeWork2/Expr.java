package Exceptions.HomeWork2;

public class Expr {

    public static double expr(int a, int b) {
        double res;
        if (b == 0){
            System.out.println("There is not possible to divide by b, cause it's equal 0");
            return 0;
        }
        else {
            res = (double)a / (double)b;
            printSum(a, b);
            return res;
        }
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки



