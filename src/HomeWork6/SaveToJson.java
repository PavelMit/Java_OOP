package HomeWork6;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson implements Saver {
    @Override
    public void SaveTo(Order order) {
        String fileName = order.getClientName() + "_" + "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
            System.out.println("Заказ успешно сохранен");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
