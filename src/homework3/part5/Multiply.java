package homework3.part5;

public class Multiply implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a*b;
    }

    public Multiply() {
    }

    @Override
    public String toString() {
        return "Multiply{}";
    }
}
