package homework3.part5;

public class Minus implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }

    public Minus() {
    }

    @Override
    public String toString() {
        return "Minus{}";
    }
}
