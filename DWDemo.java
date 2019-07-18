// Demonstrate the do-while loop.
class DWDemo {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char)System.in.read();
            System.out.println("you entered " + ch);
        } while (ch != 'q');
    }
}

