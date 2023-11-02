package OOP.Seminar4.ex001;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<E> implements Iterable<E> {
    private  E[] array;
    private int currentIndex = -1;
    public MyArrayList(E[] array){
        this.array = array;
    }

    public int size(){
        return currentIndex + 1;
    }

    public void add (E value){
        if (currentIndex + 1 < array.length){
            array[++currentIndex] = value;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return Iterable.super.spliterator();
    }
}
