package Exceptions.HomeWork3;

import java.text.*;
import java.util.ArrayList;
import java.util.Date;

public class BirthDate {
    String birthDate;


    public String getBirthDate() {
        return birthDate;
    }


    /**
     * 
     * @param date Пришедшая дата в виде строки
     * @return возвращает объект типа Date
     * @throws DateException Ошибка даты. Данные введены не корректно.
     */
    public BirthDate addBirthDate (String date) throws DateException {
        String[] dateSeparated = date.split("/");
        if (dateSeparated.length != 3) {
            throw new DateException("Ошибка в количестве введенных параметров дате dd.mm.yyyy");
        }
        else if (Integer.parseInt(dateSeparated[0]) > 31 || Integer.parseInt(dateSeparated[0]) < 1) {
            throw new DateException("Ошибка в дате типа dd.mm.yyyy. В параметре дни.");
        }
        else if (Integer.parseInt(dateSeparated[1]) > 12) {
            throw new DateException("Ошибка в дате типа dd.mm.yyyy. В параметре месяцы.");
        }
        else if (Integer.parseInt(dateSeparated[2]) < 1900 || Integer.parseInt(dateSeparated[2]) > 2023) {
            throw new DateException("Ошибка в дате типа dd.mm.yyyy. В параметре годы.");
        }
        this.birthDate = date;
        return this;
    }
}
