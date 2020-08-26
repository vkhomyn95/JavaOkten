package homework3.part7;

public class First implements Creator{
    private int size;
    @Override
    public int[] creator() {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*200);
        }
        return array;
    }

    public First(int size) {
        this.size = size;
    }

    public First() {
    }

    @Override
    public String toString() {
        return "First{" +
                "size=" + size +
                '}';
    }
}
