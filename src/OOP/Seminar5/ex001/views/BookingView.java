package OOP.Seminar5.ex001.views;

import OOP.Seminar5.ex001.models.Table;
import OOP.Seminar5.ex001.presenters.BookingPresenter;
import OOP.Seminar5.ex001.presenters.View;
import OOP.Seminar5.ex001.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
    private ViewObserver observer;

    public void setViewObserver(ViewObserver viewObserver) {
        this.observer = viewObserver;
    }

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationId) {
        if (reservationId > 0){
            System.out.printf("Столик успешно забронирован, номер брони %d\n", reservationId);
        }
        else {
            System.out.println("Не удалось забронировать столик, попробуйте повторить позже");
        }
    }

    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo,name);
    }

    @Override
    public void setViewObserver(BookingPresenter bookingPresenter) {

    }
}

