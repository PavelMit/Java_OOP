package OOP.HomeWork2;

public class Program {

    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Персик", 5);
        cats[2] = new Cat("Честер", 25);
        cats[3] = new Cat("Костя", 15);
        Plate plate = new Plate(45);
        plate.info();
        for (Cat cat: cats){
            if (!cat.isFullness()) {
                cat.eat(plate.getFood());
                plate.setFood(plate.getFood() - cat.getAppetite());
            }
            else System.out.printf("%s уже поел\n", cat.getName());
            plate.info();
        }

        // добавим нужное количество еды и покормим котов еще раз
        plate.addFood(55);
        plate.info();

        for (Cat cat: cats){
            if (!cat.isFullness()) {
                cat.eat(plate.getFood());
                plate.setFood(plate.getFood() - cat.getAppetite());
            }
            else System.out.printf("%s уже поел\n", cat.getName());
            plate.info();
        }

    }
}
