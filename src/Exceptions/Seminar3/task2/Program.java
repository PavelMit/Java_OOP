package Exceptions.Seminar3.task2;

import java.util.Random;

public class Program {

    /**
     Задача 2:
     =========
     Создайте класс Счетчик, у которого есть метод add(), увеличивающий
     значение внутренней int переменной на 1. Сделайте так, чтобы с объектом
     такого типа можно было работать в блоке try-with-resources. Подумайте, что
     должно происходить при закрытии этого ресурса? Напишите метод для
     проверки, закрыт ли ресурс. При попытке вызвать add() у закрытого
     ресурса, должен выброситься IOException.
     */


    static Random random = new Random();
    public static void main(String[] args) {
        try (Counter counter = new Counter(100)) {
            counter.add();
            counter.add();
            counter.add();

            if(random.nextInt(2) == 0) //50%
            {
                throw new Exception("Что-то пошло не так");
            }

            counter.add();
        }
        catch (CloseCounterException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
