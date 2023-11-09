package Exceptions.Seminar2.ex001;

import java.util.Random;

public class Program {

    public static void main(String[] args) {
        try{
            System.out.printf("Сумма всех элементов массива: %d\n", processArrayInternal(generateArray()));
        }
        catch (MyArrayDataException e){
            System.out.printf("%s по индексу [%d][%d]\n", e.getMessage(), e.getX(), e.getY());
        }
        catch (MyArraySizeException e){
            System.out.printf("%s Требовалось 4х4, получили %dx%d\n", e.getMessage(), e.getX(), e.getY());
        }

        catch (NullPointerException e){
            e.printStackTrace();
        }

    }

    /**
     * Преобразование строки к числу типа int
     * @param s строка
     * @param x координата элемента в массиве
     * @param y координата элемента в массиве
     * @return число
     * @throws MyArrayDataException ошибка преобразования строки к числу
     */

    static int parceElement(String s, int x, int y) throws MyArrayDataException{
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            throw new MyArrayDataException("Некорректный формат данных", x, y);
        }

    }

     /**
     * Получить сумм всех элементов двумерного массива
     * @param array массив
     * @return сумма элементов типа int
     * @throws MyArraySizeException некорректная размерность
     * @throws MyArrayDataException ошибка преобразования строки к числу
     * @throws NullPointerException массив должен существовать
     */
    static int processArrayInternal(String[][] array) throws MyArraySizeException, MyArrayDataException, NullPointerException{
        if (array == null){
            throw new NullPointerException("Массив должен существовать");
        }

        if (array.length != 4 || array[0].length != 4){
            throw new MyArraySizeException("Некорректный размер массива", array.length, array[0].length);
        }

        int[] a = new int[4];
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                sum += parceElement(array[i][j], i, j);
            }
        }
        return sum;
    }
    static Random random = new Random();

    static String[][] generateArray(){
        int add = random.nextInt(2);
        String[][] array = new String[4+add][4+add];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = Integer.toString(random.nextInt(10, 100));
            }
        }

        if (random.nextInt(3) == 0){
            array[random.nextInt(array.length)][random.nextInt(array[0].length)] = "abc";
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.printf("%s\t", array[i][j]);
            }
            System.out.println();
        }
        return array;
    }

}
