package homework3.part2;

public class Wolf extends WildAnimal {
    private String color;

    public Wolf() {
    }

    public Wolf(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "color='" + color + '\'' +
                '}';
    }
}
