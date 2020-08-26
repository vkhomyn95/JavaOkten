package homework3.part3;

public class Cat extends Pet {
    private int age;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(int height, int age) {
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
        return "Cat{" +
                "age=" + age +
                '}';
    }
    public void sayMjau(){
        System.out.println("Mjau");
    }
}
