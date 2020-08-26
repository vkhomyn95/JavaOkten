package homework2.part1;

public class Animal {
    private String alias;
    private int age;

    public Animal() {
    }

    public Animal(String alias, int age) {
        this.alias = alias;
        this.age = age;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "alias='" + alias + '\'' +
                ", age=" + age +
                '}';
    }
    public void bark () {
        System.out.println("Vofff!!");
    }
    public void toilet(){
        System.out.println("Pis-pis!!!");
    }

}
