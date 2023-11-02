package Exceptions.Seminar1.ex001;

public class CustomArraySizeException extends RuntimeException{
    private int length1;
    private int lenght2;

    public int getLength1() {
        return length1;
    }

    public int getLength2() {
        return lenght2;
    }

    public CustomArraySizeException(String message, int lenght1, int lenght2){
        super(message);
        this.length1 = lenght1;
        this.lenght2 = lenght2;
    }

}
