package homework2.part3;

public class Customer {
    private String fName;
    private String lName;
    private int bDate;
    private Passport passport;

    public Customer() {
    }

    public Customer(String fName, String lName, int bDate, Passport passport) {
        this.fName = fName;
        this.lName = lName;
        this.bDate = bDate;
        this.passport = passport;
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

    public int getbDate() {
        return bDate;
    }

    public void setbDate(int bDate) {
        this.bDate = bDate;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", bDate=" + bDate +
                ", passport=" + passport +
                '}';
    }
}
