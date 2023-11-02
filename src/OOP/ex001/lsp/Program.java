package OOP.ex001.lsp;

import java.util.ArrayList;
import java.util.List;

public class Program {
    //
    public static void main(String[] args) {
        Bird bird1 = new Bird(); //oT
        Bird bird2 = new Bird(); //oT
        Bird bird3 = new Bird(); //oT
        Duck duck1 = new Duck(); //oS
        Penguin penguin1 = new Penguin();

        ArrayList<Bird> list = new ArrayList<>();
        list.add(bird1);
        list.add(bird2);
        list.add(bird3);
        list.add(duck1);
        list.add(penguin1);

        processFly(list);

    }


    public static void processFly(List<Bird> birds){
        for (Bird bird: birds){
            bird.fly();
        }
    }
}
