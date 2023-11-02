package OOP.HomeWork5;



import OOP.HomeWork5.models.TableModel;
import OOP.HomeWork5.presenters.BookingPresenter;
import OOP.HomeWork5.presenters.Model;
import OOP.HomeWork5.presenters.View;
import OOP.HomeWork5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowTables();
        bookingView.reservationTable(new Date(), 2, "Станислав");

        bookingView.changeReservationTable(1001, new Date(), 3, "Станислав");
    }

}

