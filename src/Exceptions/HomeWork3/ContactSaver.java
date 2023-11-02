package Exceptions.HomeWork3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ContactSaver {
    Contact contact;

    public ContactSaver(Contact contact) {
        this.contact = contact;
    }

    /**
     *
     * @param contact полученный готовый контакт для записи
     * @throws IOException не удалось записать файл инф-ию в файл
     */
    public void saveContact(Contact contact) throws IOException {
        String fileName = contact.getFio().getSurname();
        File file = new File(fileName);
        try (FileWriter writer = new FileWriter(fileName, true)){
            if (file.exists()) {
                writer.write("\n");
            }
            writer.write(contact.toString());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
