package homework3.part5;

public class Summa implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }

    public Summa() {
    }

    @Override
    public String toString() {
        return "Summa{}";
    }
}
