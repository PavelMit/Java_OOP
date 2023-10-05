package Seminar3.ex002;

import java.util.Arrays;
import java.util.Random;

public class Program {
    private static Random random = new Random();
    static Worker generateWorker(){
        String[] names = new String[] {"Анатолий", "Иван", "Константин", "Сергей", "Алексей", "Павел", "Григорий", "Никита", "Дмитрий", "Александр"};
        String[] surnames = new String[] {"Иванов", "Митрофанов", "Сергеев", "Сазонов", "Постников", "Иванов", "Никифоров", "Баженов", "Шляпников", "Цыпленов"};
        int salary = random.nextInt(50000, 120000);
        Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary);
        return worker;
    }

    static  Worker[] generateEmployees(int count){
        Worker[] array = new Worker[count];
        for (int i = 0; i < array.length; i++){
            array[i] = generateWorker();
        }
        return array;
    }
    public static void main(String[] args) {
        Worker[] employees = generateEmployees(15);

        Arrays.sort(employees);

        for (Worker worker: employees) {
            System.out.println(worker);
        }
    }
}
