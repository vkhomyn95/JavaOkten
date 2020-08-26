package homework2.part3;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, 30, Type.DELIVERED, new Customer("Tom", "Barbie", 2000,
                new Passport(123344, 00002, "Lviv")));
        System.out.println(order);
    }
}
