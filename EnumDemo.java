// An enumeration of transport variables
enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT,
}

class EnumDemo {
    public static void main(String[] args)
    {
        Transport tp;
        System.out.println("Here aer all transport constants");

        Transport allTransports[] = Transport.values();
        for (Transport t : allTransports)
            System.out.println(t);
    
        System.out.println();

        tp = Transport.valueOf("AIRPLANE1");
        System.out.println("tp contains " + tp);
    }
}

