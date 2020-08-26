package homework3.part4;

public class Laptop {
    private String name;

    public Laptop() {
    }

    public Laptop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                '}';
    }
}
