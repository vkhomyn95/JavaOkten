package homework3.part2;

public class WildAnimal extends Animal {
    private int age;

    public WildAnimal() {
    }

    public WildAnimal(int age) {
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
        return "WildAnimal{" +
                "age=" + age +
                '}';
    }
}
