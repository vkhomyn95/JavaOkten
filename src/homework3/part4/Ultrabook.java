package homework3.part4;

public class Ultrabook extends Laptop {
    private int memory;

    public Ultrabook() {
    }

    public Ultrabook(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "memory=" + memory +
                '}';
    }
}
