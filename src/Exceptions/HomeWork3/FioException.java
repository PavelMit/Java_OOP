package Exceptions.HomeWork3;

public class FioException extends ContactException {
    private int amount;

    public FioException(String message, int amount) {
        super(message);
        this.amount = amount;
    }
}
