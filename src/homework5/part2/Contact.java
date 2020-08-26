package homework5.part2;

import java.util.Objects;

public class Contact {
    private int id;
    private String name;
    private Company company;
    private String surname;
    private String email;
    private String phone;
    private Department departmnet;

    public Contact() {
    }

    public Contact(int id, String  name, Company company, String surname, String email, String phone, Department departmnet) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.departmnet = departmnet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Department getDepartmnet() {
        return departmnet;
    }

    public void setDepartmnet(Department departmnet) {
        this.departmnet = departmnet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id &&
                name == contact.name &&
                company == contact.company &&
                Objects.equals(surname, contact.surname) &&
                Objects.equals(email, contact.email) &&
                Objects.equals(phone, contact.phone) &&
                departmnet == contact.departmnet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, company, surname, email, phone, departmnet);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name=" + name +
                ", company=" + company +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", departmnet=" + departmnet +
                '}';
    }
}
