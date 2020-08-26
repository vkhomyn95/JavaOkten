package homework2.part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Department> departments = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(0, new Employee("Kaka", "Bora", 20, "Cleaner"));
        departments.add(0, new Department("Saturn", employees));
        departments.add(1, new Department("Neptun", employees));
        Company company = new Company("soft", departments);
        System.out.println(company);
    }
}
