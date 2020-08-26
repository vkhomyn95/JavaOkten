package homework3.part6;

public class First  implements  MyInterface{
    private String message;

    @Override
    public void scream() {
        System.out.println(this.message);
    }

    public First() {
        this.message = "aaaaaaa";
    }

    public First(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "First{" +
                "message='" + message + '\'' +
                '}';
    }
}
