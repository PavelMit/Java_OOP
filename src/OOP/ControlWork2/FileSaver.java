package OOP.ControlWork2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileSaver {

    private String fileName;
    private Robot robot;

    public FileSaver(String fileName, Robot robot) {
        this.fileName = fileName;
        this.robot = robot;
    }

    public void getToy(int id) throws IOException, IdException {
        try (FileWriter writer = new FileWriter("Toys", true)) {
            Toy toy = this.robot.findToy(id);
            String text = String.format("Игрушка %s с id %d выдана\n\n", toy.getName(), toy.getId());
            writer.write(text);
            System.out.printf("Игрушка %s выдана по id %d\n\n", toy.getName(), toy.getId());
            robot.waitingList.remove(toy);
            writer.flush();
        }
        catch (IOException ex) {
            throw new IOException(ex.getMessage());
        }
        catch (IdException e){
            System.out.printf("%s, так как игрушка с Id [%d] в списке ожидания отсутствует\n\n", e.getMessage(), e.getId());
        }
        catch (NullPointerException e) {
            System.out.printf("%s\n", e.getMessage());
        }
    }
}
