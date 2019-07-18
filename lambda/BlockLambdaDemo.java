// A block lambda that finds the smalleds positive factor
// of an int value

interface NumbericFunc {
    int func(int n);
}

class BlockLambdaDemo {
    public static void main(String[] args)
    {
        NumericFunc smallestF = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;

            for (int i = 2; i <= n/i; i++) {
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };
        System.out.println("Smalles factor of 12 is " + smallesF.func(12));
        System.out.println("Smalles factor of 11 is " + smallesF.func(11));
    }
}


