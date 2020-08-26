package homework3.part4;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                '}';
    }

}
