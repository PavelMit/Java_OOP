package OOP.Seminar3.ex001;

public class Program {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 100, 10);

        int b = 1;


        Animal[] animals = {
                cat1,
                new Cat("Персик", 400, 20),
                new Dog("Быстрый", 500,20),
                new Dog("Тузик", 1000,15),
                new Dog("Шарик", 800, 10),
                new Dog("Бима", 500,50)
        };

        for (Animal a: animals){
            System.out.println(a);
        }

        for (Animal a: animals){
            a.run(200);
            a.swim(10);
            a.run(500);
            a.swim(15);
            a.run(1000);
            a.swim(30);
        }

        System.out.println();
        System.out.println(("Было создано " + Animal.getCounter() + " животных"));
        System.out.println(("Было создано " + Cat.getCounter() + " котиков"));
        System.out.println(("Было создано " + Dog.getCounter() + " собак"));

    }
}
