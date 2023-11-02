package OOP.Seminar5.ex001.presenters;

import OOP.Seminar5.ex001.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
    private Model model;
    private View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setViewObserver(this);
    }
//  получение всех столиков
    private Collection<Table> loadTables(){
        return model.loadTables();
    }
    // отобразить все столики
    public void updateUIShowtables(){
        view.showTables(loadTables());

    }

    public void updateUIShowReservationResult(int reservationId){
        view.showReservationTableResult(reservationId);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNum, String name) {
        try{
            int reservationNo = model.reservationTable(orderDate, tableNum, name);
            updateUIShowReservationResult((reservationNo));
        }
        catch (RuntimeException e){
            updateUIShowReservationResult( - 1);
        }
    }
}
