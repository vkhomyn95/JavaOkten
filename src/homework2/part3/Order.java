package homework2.part3;

public class Order {
    private int number;
    private int date;
    private Type type;
    private Customer customer;

    public Order() {
    }

    public Order(int number, int date, Type type, Customer customer) {
        this.number = number;
        this.date = date;
        this.type = type;
        this.customer = customer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", date=" + date +
                ", type=" + type +
                ", customer=" + customer +
                '}';
    }
}
