package Seminar5.ex001.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {


    private static int counter;
    private int num;

    private final Collection<Reservation> reservations = new ArrayList<>();

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public int getNum() {
        return num;
    }

    {
        num = ++counter;
    }
    @Override
    public String toString() {
        return String.format("Столик #%d", num);
    }

}
