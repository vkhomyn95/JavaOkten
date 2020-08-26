package homework3.part2;

public class Dag extends Pet {
    private int age;

    public Dag() {
    }

    public Dag(int age) {
        this.age = age;
    }

    public Dag(int height, int age) {
        super(height);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dag{" +
                "age=" + age +
                '}';
    }
}
