package Exceptions.HomeWork3;

public class PhoneNumberException extends ContactException {
    private int amountOfDigits;

    public PhoneNumberException(String message, int amountOfDigits) {
        super(message);
        this.amountOfDigits = amountOfDigits;
    }
}
