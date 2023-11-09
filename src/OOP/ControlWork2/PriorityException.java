package OOP.ControlWork2;

public class PriorityException extends Exception{

    int priority;
    public PriorityException(String message, int heaviness) {
        super(message);
        this.priority = heaviness;
    }
}
