package homework3.part4;

public class PersonalComputer extends Computer {
    private int OZU;
    private int memory;

    public PersonalComputer() {
    }

    public PersonalComputer(String name, int OZU, int memory) {
        super(name);
        this.OZU = OZU;
        this.memory = memory;
    }

    public PersonalComputer(int OZU, int memory) {
        this.OZU = OZU;
        this.memory = memory;
    }

    public int getOZU() {
        return OZU;
    }

    public void setOZU(int OZU) {
        this.OZU = OZU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "OZU=" + OZU +
                ", memory=" + memory +
                '}';
    }
}
