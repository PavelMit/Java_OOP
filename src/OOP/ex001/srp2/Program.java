package OOP.ex001.srp2;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        order.inputFromConsole();
        order.saveToJson();
        System.out.println("Заказ успешно сохранен");
    }
}
