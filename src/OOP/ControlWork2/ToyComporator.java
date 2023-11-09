package OOP.ControlWork2;

import java.util.Comparator;

public class ToyComporator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        if (o1 == o2){
            return 0;
        }
        if (o1 == null){
            return -1;
        }
        if (o2 == null){
            return 1;
        }
        int s = o2.getPriority() - o1.getPriority();
        if (s!=0){
            return s;
        }
        return o2.getName().compareTo(o1.getName());
    }
}
