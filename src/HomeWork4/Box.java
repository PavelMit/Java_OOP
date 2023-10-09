package HomeWork4;


import java.text.Format;
import java.util.ArrayList;
import java.util.Comparator;

public  class Box<T extends Fruit> {
    private int idBox;
    private static int counter;
    private ArrayList<T> fruits = new ArrayList<T>();

    {
        idBox = ++counter;
    }
    private SortType sortType;
    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public Box() {
    }

    public float getWeightBox (){
        if (sortType == SortType.Orange) return (fruits.size() * 1.5f);
        else return (fruits.size() * 1f);
    }
    public void addFruit(T fruit){
        if (fruit instanceof Apple && sortType == SortType.Apple || fruit instanceof Orange && sortType == SortType.Orange) {
            fruits.add(fruit);
        }
        else if (fruits.isEmpty()){
            fruits.add(fruit);
            if (fruit instanceof Apple) sortType = SortType.Apple;
            else sortType = SortType.Orange;
        }
        else System.out.printf("Извините, мы не можем добавить фрукт типа %s в коробку с фруктами типа %s\n", fruit.getType(), sortType);
    }
    public void putFromOneBoxToAnother(Box box){
        if (box.sortType == this.sortType){
            while (this.fruits.size() != 0){
                box.fruits.add(this.fruits.get(0));
                this.fruits.remove(0);
            }
        }
        else System.out.printf("Мы не можем переложить фрукты из коробки %s в коробку %s, так как в них находятся фрукты разных типов\n", this.idBox, box.idBox);
    }
    public boolean compare(Box o) {
        if (o.getWeightBox() == this.getWeightBox()) return true;
        else return false;
    }

    public String getBoxInfo() {
       return String.format("В коробке под номером %d лежат %s общим весом %f", idBox, sortType, getWeightBox());
    }
}
