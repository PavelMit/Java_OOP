package Seminar4.ex002;

import java.util.Arrays;

public class Transaction <T extends Account> {
    private final T from;
    private final T to;
    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute(){
        if (from.getAmount() >= amount){
            System.out.printf("Операция проведена успешно между счетами\n");
        }
        else {
            System.out.println("Операция не возможна, недостаточно срадств");
        }
    }
}
