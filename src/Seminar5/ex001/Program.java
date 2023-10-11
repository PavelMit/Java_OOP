package Seminar5.ex001;

import Seminar5.ex001.models.TableModel;
import Seminar5.ex001.presenters.BookingPresenter;
import Seminar5.ex001.presenters.Model;
import Seminar5.ex001.presenters.View;
import Seminar5.ex001.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args){
        Model tableModel = new TableModel();
        View bookingView = new BookingView();

        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowtables();
//        reservationTable(new Date(), 2, "Станислав");

    }
}
