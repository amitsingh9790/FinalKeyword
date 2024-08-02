package FinalKeyword;

final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}
// Cannot Child class of final class
// class Child extends FinalClass {
//     void display() {
//         System.out.println("Attempting to subclass final class.");
//     }
// }

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display();
    }
}

