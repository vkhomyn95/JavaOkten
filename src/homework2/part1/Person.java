package homework2.part1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private Animal animal;
    private Poshta poshta;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String email, Animal animal, Poshta poshta) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.animal = animal;
        this.poshta = poshta;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Poshta getPoshta() {
        return poshta;
    }

    public void setPoshta(Poshta poshta) {
        this.poshta = poshta;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", animal=" + animal +
                ", poshta=" + poshta +
                '}';
    }
}
