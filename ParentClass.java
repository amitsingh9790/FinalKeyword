package FinalKeyword;

public class ParentClass {
    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

class ChildClass extends ParentClass {
    // Cannot override the finalMethod from ParentClass
    // void finalMethod() {
    //     System.out.println("Attempting to override final method.");
    // }
}

class FinalMethodExample {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.finalMethod();
    }
}

