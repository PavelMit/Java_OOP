package Exceptions.HomeWork3;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Contact {
    private BirthDate birthDate;

    private Fio fio;
    private PhoneNumber phoneNumber;
    private Sex sex;

//    public Contact() {
//    }

    public Fio getFio() {
        return fio;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
    public Contact createContact(String data) throws ContactException {
        return analizeData(data);
    }

    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     *
     * @param data получаем строку
     * @return готовый контакт типа Сontact
     * @throws ContactException искючение по количеству данных в полученной строке (должно быть 6)
     */

    public Contact analizeData (String data) throws ContactException {
        String[] words = data.split(" "); // сплитуем строку на массив строк без проблелов
        ArrayList<String> fioTemp = new ArrayList<>(); // этот массив нужен для записи строк в массив будущего ФИО
        Fio newFioResult = new Fio(); // это пустой объект типа ФИО, который мы будем заполнять
        BirthDate newBirthDate = new BirthDate(); // это пустой объект типа BirthDate, который мы будем заполнять
        PhoneNumber newPhoneNumber = new PhoneNumber(); // это пустой объект типа PhoneNumber, который мы будем заполнять
        Sex newSex = new Sex(); // это пустой объект типа Sex, который мы будем заполнять

        if (words.length != 6){
            throw new AmountOfDataException(String.format("Количество введенных данных не соответствует правилам. Должно быть 6, а у вас %d", words.length), words.length);
        }
        else {
            for (String word : words) {
                if (word.contains("/")) { // проверка на дату
                    this.birthDate = newBirthDate.addBirthDate(word); // добавления даты рождения в контакт
                    continue;
                }
                if (word.equals("f") || word.equals("m")) { // проверка на пол
                   this.sex = newSex.addSex(word);
                   System.out.println(this.sex.getSex());
                   continue;
                }
                if (isNumeric(word)) { // проверка на телефон
                    this.phoneNumber = newPhoneNumber.addPhoneNumber(word); // добавление телеофна в контакт
                    continue;
                }
                fioTemp.add(word); // запись не прошедших строк в общий Array List временного ФИО
            }
            this.fio = newFioResult.addFio(fioTemp); // добавление ФИО в контакт
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", this.fio.getSurname(), this.fio.getName(), this.fio.getSecondname(), this.birthDate.getBirthDate(), this.phoneNumber.getPhoneNumber(), this.sex.toString());
    }
}
