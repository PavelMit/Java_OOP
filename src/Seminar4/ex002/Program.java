package Seminar4.ex002;

public class Program {
    public static void main(String[] args) {
//        Account<Person> account1 = new Account<>(new Person("AA", "123"), 20000);
        Entity entity = new Entity("Рога и копыта", "20123");
        Person person = new Person("Клиент1", "24142");
        DebitAccount<Entity> debitAccount = new DebitAccount<>(entity, 15000000);
        CreditAccount<Person> creditAccount = new CreditAccount<>(person, 300);

    }
}
