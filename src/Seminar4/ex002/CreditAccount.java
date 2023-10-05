package Seminar4.ex002;

public class CreditAccount<T extends PersonalData> extends Account<T>{
    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
