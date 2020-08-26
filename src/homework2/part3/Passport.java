package homework2.part3;

public class Passport {
    private int seria;
    private int num;
    private String passedBy;

    public Passport() {
    }

    public Passport(int seria, int num, String passedBy) {
        this.seria = seria;
        this.num = num;
        this.passedBy = passedBy;
    }

    public int getSeria() {
        return seria;
    }

    public void setSeria(int seria) {
        this.seria = seria;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPassedBy() {
        return passedBy;
    }

    public void setPassedBy(String passedBy) {
        this.passedBy = passedBy;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "seria=" + seria +
                ", num=" + num +
                ", passedBy='" + passedBy + '\'' +
                '}';
    }
}
