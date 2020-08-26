package homework2.part1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tom",
                "Ferrari",
                30,
                "email@goo",
                new Animal("Do", 3),
                new Poshta("google.com", "zxzxz22", "qwerty"));
        System.out.println(person);
        person.getAnimal().toilet();
        person.getAnimal().bark();
        person.getPoshta().login();
    }
}

