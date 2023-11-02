package Exceptions.Seminar2.ex002;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Program {

    /**
     Задача 2
     ========
     Запишите в файл следующие строки:

     Анна=4
     Елена=5
     Марина=6
     Владимир=8
     Константин=10
     Иван=4

     * @param args
     */
    public static void main(String[] args) {
        prepareFile();
    }

    static Random random = new Random();

    static void prepareFile(){
        try (FileWriter fileWriter = new FileWriter("names.txt")) {
            fileWriter.write("Анна=4\n");
            fileWriter.write("Елена=5\n");
            fileWriter.write("Марина=6\n");
            if (random.nextInt(2) == 0){
                throw new Exception("Неожиданное исключение");
            }
            fileWriter.write("Владимир=8\n");
            fileWriter.write("Константин=10\n");
            fileWriter.write("Иван=4\n");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void prepareFile_old(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("names.txt");
            fileWriter.write("Анна=4\n");
            fileWriter.write("Елена=5\n");
            fileWriter.write("Марина=6\n");

            if (random.nextInt(2) == 0){
                throw new Exception("Неожиданное исключение");
            }

            fileWriter.write("Владимир=8\n");
            fileWriter.write("Константин=10\n");
            fileWriter.write("Иван=4\n");
           // fileWriter.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            try
            {
                fileWriter.close();
            }
            catch (IOException e){

            }

        }
    }

}
