package homework3.part6;

public class Main {
    public static void main(String[] args) {
        printMessage(new First());
        printMessage(new Second());
//        First first = new First("aaaaaaa!");
//        first.scream();
//        Second second = new Second("yyyyyy!");
//        second.scream();
    }
    public static void printMessage(MyInterface message){
        message.scream();
    }
}
