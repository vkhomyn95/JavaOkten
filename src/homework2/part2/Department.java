package homework2.part2;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
