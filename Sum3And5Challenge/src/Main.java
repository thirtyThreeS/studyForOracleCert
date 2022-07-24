public class Main
{
    private static int sum = 0;
    private static int count = 0;

    public static void main(String[] args)
    {
        for (int i = 1; i < 1001; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                sum += i;
                count++;
            }

            if (count == 5)
            {
                System.out.println("Sum = " + sum);
                break;
            }
        }
    }
}