package homework3.part3;

public class Pet extends Animal {
    private int height;

    public Pet() {
    }

    public Pet(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "height=" + height +
                '}';
    }

    public void friendly(){
        System.out.println(this.getName() + "is friendly");
    }
}
