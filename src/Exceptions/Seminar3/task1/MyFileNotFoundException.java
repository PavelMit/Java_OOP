package Exceptions.Seminar3.task1;

public class MyFileNotFoundException extends Exception{

    private final String fileName;

    public String getFileName() {
        return fileName;
    }

    public MyFileNotFoundException(String message, String fileName) {
        super(message);
        this.fileName = fileName;
    }
}
