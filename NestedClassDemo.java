// java program to demonstrate how to implement static and non-static nested classes t in java program

class OuterClass {
    private static String msg = "GeeksForGeeks";

    // static nested class
    public static class NestedStaticClass {
        // only static member of outer class is directly accessible in nested static class
        public void printMessage() {
            System.out.println("Message from nested static class");
        }
    }

    // non static nested class - also called Inner class
    public class InnerClass {
        public void display() {
            System.out.println("Message from non-static nested class");
        }
    }
}

class NestedClassDemo {
    public static void main(String[] args) {
        OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
        printer.printMessage();

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
        innerObject.display();
    }
}

