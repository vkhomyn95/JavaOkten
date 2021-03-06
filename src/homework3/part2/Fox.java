package homework3.part2;

public class Fox extends WildAnimal {
    private String color;

    public Fox() {
    }

    public Fox(String color) {
        this.color = color;
    }

    public Fox(int age, String color) {
        super(age);
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
        return "Fox{" +
                "color='" + color + '\'' +
                '}';
    }
}
