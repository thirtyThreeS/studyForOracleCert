public class Main {
    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++)
        {
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("");
        System.out.println("---");
        System.out.println("Now in Reverse");
        System.out.println("---");
        System.out.println("");

        for (int i = 8; i > 1; i--)
        {
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("");
        System.out.println("---");
        System.out.println("Three Prime Numbers");
        System.out.println("---");
        System.out.println("");

        for (int j = 2; j < 10000; j++)
        {
            if (count == 10) break;

            if (isPrime(j))
            {
                System.out.println(j + " is a Prime Number.");
                count++;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n)
    {
        if (n == 1) return false;

        for(int i = 2; i <= (long)Math.sqrt(n); i++)
        {
            System.out.println("Looping " + i);
            if (n % i == 0) return false;
        }

        return true;
    }
}