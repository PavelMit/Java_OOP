package Exceptions.Seminar3.task3;

public class AnimalFabric {
    public static Animal create(AnimalType animalType, String name) throws AnimalNameException{
        if (name == null || name.length() < 3){
            throw new AnimalNameException("Некорректное имя котика", name);
        }
        switch (animalType){
            case Cat -> {
                return new Cat(name);
            }
            /*case Dog -> {
                return new Cat(name);
            }*/
            default -> {
                throw new RuntimeException();
            }

        }
    }
}
