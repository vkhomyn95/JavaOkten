package homework2.part2;

public class Employee {
    private String fName;
    private String lName;
    private int exp;
    private String proff;

    public Employee() {
    }

    public Employee(String fName, String lName, int exp, String proff) {
        this.fName = fName;
        this.lName = lName;
        this.exp = exp;
        this.proff = proff;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getProff() {
        return proff;
    }

    public void setProff(String proff) {
        this.proff = proff;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", exp=" + exp +
                ", proff='" + proff + '\'' +
                '}';
    }
}
