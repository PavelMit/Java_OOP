package OOP.Seminar5.ex001;

import OOP.Seminar5.ex001.models.TableModel;
import OOP.Seminar5.ex001.presenters.BookingPresenter;
import OOP.Seminar5.ex001.presenters.Model;
import OOP.Seminar5.ex001.presenters.View;
import OOP.Seminar5.ex001.views.BookingView;

public class Program {
    public static void main(String[] args){
        Model tableModel = new TableModel();
        View bookingView = new BookingView();

        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowtables();
//        reservationTable(new Date(), 2, "Станислав");

    }
}
