package homework5.part1;

import java.util.Objects;

public class Computer {
    private String model;
    private int year;
    private int memory;
    private int price;
    private HardDrive hardDrive;
    private Processor processor;

    public Computer() {
    }

    public Computer(String model, int year, int memory, int price, HardDrive hardDrive, Processor processor) {
        this.model = model;
        this.year = year;
        this.memory = memory;
        this.price = price;
        this.hardDrive = hardDrive;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", memory=" + memory +
                ", price=" + price +
                ", hardDrive=" + hardDrive +
                ", processor=" + processor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return year == computer.year &&
                memory == computer.memory &&
                price == computer.price &&
                Objects.equals(model, computer.model) &&
                Objects.equals(hardDrive, computer.hardDrive) &&
                Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, memory, price, hardDrive, processor);
    }
}
