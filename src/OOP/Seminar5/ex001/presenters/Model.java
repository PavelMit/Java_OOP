package OOP.Seminar5.ex001.presenters;

import OOP.Seminar5.ex001.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNum, String name);
}
