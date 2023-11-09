package OOP.ControlWork2;

public class IdException extends Exception{
    int id;

    public int getId() {
        return id;
    }

    public IdException(String message, int id) {
        super(message);
        this.id = id;
    }
}
