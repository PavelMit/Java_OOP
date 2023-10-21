package Seminar7.ex002_builder;

public class Program {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("AAAA");
        stringBuilder1
                .append("BBB")
                .append("CCC")
                .append("EEE")
                .delete(1, 3)
                .append("DDD")
                .toString();

        Order order = new OrderBuilder()
                .setProductId(4564)
                .setPrice(1)
                .setQnt(20)
                .setProductName("Product #1")
                .build();
    }


}
