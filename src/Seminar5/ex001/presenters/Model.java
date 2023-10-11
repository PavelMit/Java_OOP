package Seminar5.ex001.presenters;

import Seminar5.ex001.models.Table;

import javax.xml.crypto.Data;
import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNum, String name);
}
