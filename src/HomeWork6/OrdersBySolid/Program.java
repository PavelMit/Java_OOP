package HomeWork6.OrdersBySolid;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order();
        Input input = new Input();
        SaveToJson saverJson1 = new SaveToJson();
        input.inputFromConsole(order);
        saverJson1.SaveTo(order);
    }
}
