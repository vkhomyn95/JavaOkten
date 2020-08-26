package homework3.part6;

public class Second implements MyInterface{
    private String message;

    @Override
    public void scream() {
        System.out.println(this.message);

    }

    public Second() {
        this.message =" yyyyyy";
    }

    public Second(String message) {
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
        return "Second{" +
                "message='" + message + '\'' +
                '}';
    }
}
