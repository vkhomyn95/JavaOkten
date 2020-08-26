package homework3.part5;

public class Divide implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }

    public Divide() {
    }

    @Override
    public String toString() {
        return "Divide{}";
    }
}
