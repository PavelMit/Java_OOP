package OOP.ex001.lsp;

public class Penguin extends Bird{
    @Override
    public void fly() {
        System.out.println("Пингвин не умеет летать");
        //throw new RuntimeException("Пингвин летать не умеет");
    }
}
