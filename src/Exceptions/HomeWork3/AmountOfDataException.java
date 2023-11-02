package Exceptions.HomeWork3;

public class AmountOfDataException extends ContactException {
    int amount;

    public int getAmount() {
        return amount;
    }

    public AmountOfDataException(String message, int amount) {
        super(message);
        this.amount = amount;
    }

}
