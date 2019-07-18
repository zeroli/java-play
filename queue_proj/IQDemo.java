// A fixed-size queue class for characters.
class FixedQueue implements ICharQ {
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // construct an empty queue given its size
    public FixedQueue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // get a character from the queue
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char)0;
        }

        return q[getloc++];
    }

}

// A circular queue.
class CircularQueue implements ICharQ {
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // construct an empty queue given its size
    public CircularQueue(int size) {
        q = new char[size+1]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    public void put(char ch) {
        if (putloc+1 == getloc || ((putloc==q.length-1) && (getloc==0))) {
            System.out.println(" - Queue is full.");
            return; 
        }
        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0;
    }

    // get character from the queue
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char)0;
        }

        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0;
        return ch;
    }
}

// A dynamic queue.
class DynQueue implements ICharQ {
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // construct an empty queue given its size
    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length) {
            char t[] = new char[q.length*2];
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        q[putloc++] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char)0;
        }
        return q[getloc++];
    }
}

class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;
        char ch;
        int i;
        iQ = q1;
        for (i = 0; i < 10; i++)
            iQ.put((char)('A' + i));

        // show the queue
        System.out.print("Contents of fixed queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        for (i = 0; i < 10; i++) 
            iQ.put((char)('Z' - i));

        // show the queue
        System.out.print("Contents of dynamic queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        for (i = 0; i < 10; i++)
            iQ.put((char)('A' + i));

        // show the queue
        System.out.print("Contents of circular queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        for (i = 10; i < 20; i++)
            iQ.put((char)('A' + i));

        System.out.print("Contents of circular queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nStore and consume from" + " circular queue.");
        for (i = 0; i < 20; i++) {
            iQ.put((char)('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}

