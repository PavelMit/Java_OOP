package OOP.Seminar4.ex001;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(true);
        arrayList.add(12);
        arrayList.add("123");

        MyArrayList<Object> arrayList1 = new MyArrayList(new Object[10]);
        arrayList1.add(12);
        arrayList1.add(true);
        arrayList1.add("17");

//        for (Object e: arrayList1){
//            System.out.println();
//        }

        System.out.println("Кол-во жлементов: " + arrayList1.size());
    }
}
