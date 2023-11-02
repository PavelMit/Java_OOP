package OOP.Seminar5.ex001.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNum, String name);

}
