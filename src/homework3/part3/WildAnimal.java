package homework3.part3;

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

    public void live (){
        System.out.println(this.getName() + "lives in forest");
    }
}
