package Exceptions.HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class Fio {
    private List<String> fio;

    public List<String> getFio() {
        return fio;
    }

    public String getSurname() {
        return fio.get(0);
    }

    public String getName() {
        return fio.get(1);
    }

    public String getSecondname() {
        return fio.get(2);
    }

    /**
     *
     * @param fio полученный список строк с ФИО
     * @return заполненный объект типа FIO
     * @throws FioException не корректное количество данных (должно быть 3 строки)
     */
    public Fio addFio(ArrayList<String> fio) throws FioException {
        if (fio.size() != 3)
            throw new FioException("Не достаточное количество параметров ФИО. Нужно 3, а вы ввели: %d", fio.size());
        else {
            this.fio = fio;
            return this;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.getSurname(), this.getName(), this.getSecondname());
    }
}
