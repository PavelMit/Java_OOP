package HomeWork4;

import HomeWork3.Employee;
import HomeWork3.SortType;

import java.util.Comparator;

public class Apple extends Fruit{


    public Apple() {
        super(1f);
    }

    @Override
    protected String getType() {
        return "Apple";
    }
}
