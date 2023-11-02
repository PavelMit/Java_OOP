package Exceptions.Seminar1.ex001;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        System.out.printf("Кол-во элементов массива: %d\n", task1(new int[] {}));
//        task2();
//        task3();
//        task4();
        task5();
    }

    static int task1(int[] array){
         if (array == null){
             return -2;
         }
         if (array.length < 1){
             return -1;
         }
         return array.length;
    }

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static void task2(){
        while (true){
            System.out.print("Укажите значение для поиска: ");
            int searchNumber = Integer.parseInt(scanner.nextLine());
            int[] array = new int[random.nextInt(5) + 1];
            if (random.nextInt(2) == 0){
                array = null;
            }
            if (array != null){
                for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(10);
                    System.out.printf("%d ", array[i]);
                }
                System.out.println();
            }
            int codeResult = processArray(array, searchNumber);
            switch (codeResult){
                case -1 -> System.out.println("Длина массива менее трех символов");
                case -2 -> System.out.println("Элемент не найден");
                case -3 -> System.out.println("массив некорректно проинициализирован");
                default -> {
                    System.out.println("Массив успешно обработан. Завершение работы приложения");
                    System.out.printf("Элемент найден по индексу: %d\n", codeResult);
                    return;
                }
            }
        }
    }

    static void task3(){
        for (int i = 0; i < 5; i++){
            processArray(generateArray());
        }
    }

    static void task4(){
        for (int i = 0; i < 5; i++){
            int errCode = processArrayV2(generateArray());
            switch (errCode){
                case -1 -> System.out.println("Некорректный размер массива");
                case -2 -> System.out.println("Некорректное значение массива");
                default -> {
                    System.out.printf("Сумма элементов массива равна: %d\n", errCode);
                }
            }
        }
    }

    static void task5(){
        try{
            int[] res = getSumArray(new int[]{1, -2, 3, 16}, new int[]{-5, 9, 8, 1});
            for (int i = 0; i < res.length; i++){
                System.out.printf("%d ", res[i]);
            }
        }
        catch (NullPointerException e){
            System.out.println("Оба массива должны существовать");
        }
        catch (CustomArraySizeException e){
            System.out.println(e.getMessage());
            System.out.println("Длина первого масива: " + e.getLength1());
            System.out.println("Длина второго масива: " + e.getLength2());
        }
    }

    static int processArray(int[] array, int searchArray){
        if (array == null)
            return -3; // Массив некорректно проинициирован
        if (array.length < 3){
            return -1; // Длина массива менее трех символов
        }
        Arrays.sort(array);
        for (int e: array)
            System.out.printf("%d ", e);
        System.out.println();
        int searchResult = Arrays.binarySearch(array, searchArray);
        if (searchResult < 0)
            return  -2; // Элемент не найден
        return searchResult;
    }

    static void processArray(int[][] array){
        if (array.length != array[0].length)
            throw new RuntimeException(String.format("Некорректная размерность массива [%d][%d]", array.length, array[0].length));
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] != 0 && array[i][j] != 1)
                    throw new RuntimeException(String.format("Некорректное значение элемента массива по индексу [%d][%d]",
                            i, j));
                else sum += array[i][j];
            }
        }
        System.out.printf("Сумма элементов массива: %d\n", sum);
    }
    static int[][] generateArray(){
        int[][] array = new int [random.nextInt(4, 6)][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = random.nextInt(0,2);
            }
        }
        if (random.nextInt(2) == 0){
            array[random.nextInt(array.length)][random.nextInt(array[0].length)] = 2;
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
        return array;
    }

    static int processArrayV2(int[][] array){
        if (array.length != array[0].length)
            return -1; //throw new RuntimeException(String.format("Некорректная размерность массива [%d][%d]", array.length, array[0].length));
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j] != 0 && array[i][j] != 1)
                    return - 2; //throw new RuntimeException(String.format("Некорректное значение элемента массива по индексу [%d][%d]",
                          //  i, j));
                else sum += array[i][j];
            }
        }
        return sum;//System.out.printf("Сумма элементов массива: %d\n", sum);
    }

    static int[] getSumArray(int[] array1, int[] array2){
        if (array1 == null || array2 == null){
            throw new NullPointerException("Оба массива должны существовать");
        }
        if (array1.length != array2.length){
            throw new CustomArraySizeException("Кол-во элементов массива должно быть одинаковым", array1.length, array2.length);
        }
        int[] res = new int[array1.length];
        for (int i = 0; i < array1.length; i++){
            res[i] = array1[i] + array2[i];
        }
        return res;
    }
}
