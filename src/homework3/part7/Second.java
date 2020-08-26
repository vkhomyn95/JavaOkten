package homework3.part7;

public class Second implements Creator {
    private int size;
    private int x;

    public Second() {
    }

    public Second(int size, int x) {
        this.size = size;
        this.x = x;
    }

    public Second(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int[] creator() {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*x);

        }
        return array;
    }
}
