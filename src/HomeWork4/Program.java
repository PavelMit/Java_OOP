package HomeWork4;

import java.util.ArrayList;

//a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
//поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//c. Для хранения фруктов внутри коробки можно использовать ArrayList;
//d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
//вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
//подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
//Можно сравнивать коробки с яблоками и апельсинами;
//f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
//g. Не забываем про метод добавления фрукта в коробку.
public class Program {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();
        Orange orange7 = new Orange();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        // Кладем фрукты в коробку
        box1.addFruit(apple1); box1.addFruit(apple2); box1.addFruit(apple3); box1.addFruit(orange1);
        box2.addFruit(apple4); box2.addFruit(orange2);box2.addFruit(orange3); box2.addFruit(orange4);
        box3.addFruit(orange5); box3.addFruit(orange6); box3.addFruit(apple5); box3.addFruit(apple6);

        // Смотрим текущий вес коробок
        System.out.println(box1.getBoxInfo());
        System.out.println(box2.getBoxInfo());
        System.out.println(box3.getBoxInfo());

        // Сравниваем равные коробки
        System.out.println(box1.compare(box3));

        // Перекладываем фрукты  неудачно и удачно
        box1.putFromOneBoxToAnother(box3);
        box1.putFromOneBoxToAnother(box2);

        // Смотрим текущий вес коробок
        System.out.println(box1.getBoxInfo());
        System.out.println(box2.getBoxInfo());
        System.out.println(box3.getBoxInfo());

        // Сравниваем не равные коробки
        System.out.println(box1.compare(box3));
    }
}
