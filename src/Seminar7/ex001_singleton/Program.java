package Seminar7.ex001_singleton;

public class Program {
    public static void main(String[] args) {
//        Settings setting1 = new Settings();
//        Settings setting2 = new Settings();

        Settings setting3 = Settings.getInstance();
        Settings setting4 = Settings.getInstance();


    }
}
