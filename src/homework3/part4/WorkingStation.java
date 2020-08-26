package homework3.part4;

public class WorkingStation extends Computer {
    private String type;

    public WorkingStation(String type) {
        this.type = type;
    }

    public WorkingStation() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "WorkingStation{" +
                "type='" + type + '\'' +
                '}';
    }
}
