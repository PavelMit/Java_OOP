package Seminar5.ex001.presenters;

import Seminar5.ex001.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {
    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationId);

    void reservationTable(Date orderDate, int tableNum, String name);

    void setViewObserver(BookingPresenter bookingPresenter);
}