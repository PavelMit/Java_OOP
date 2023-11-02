package Exceptions.HomeWork3;

public class PhoneNumber {
    private String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param data получаем строку с номером
     * @return возвращаем объект типа готовый PhoneNumber
     * @throws PhoneNumberException  исключаем склишком малое или слишком большое кол-во цифр
     */
    public PhoneNumber addPhoneNumber (String data) throws PhoneNumberException {
        if (data.length() > 11 || data.length() < 5)
            throw new PhoneNumberException("Максимальное количество цифр в номере - 10, минимальное - 5, введено %d", data.length());
        else {
            this.phoneNumber = data;
            return this;
        }
    }
}
