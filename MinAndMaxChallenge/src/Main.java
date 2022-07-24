import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int lowest = Integer.MAX_VALUE, highest = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter A Number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt)
            {
                int number = scanner.nextInt();

                if (number < lowest) lowest = number;
                if (number > highest) highest = number;
            }
            else
            {
                break;
            }
        }

        System.out.println("Your highest number entered was: " + highest + "\nYour lowest number entered was: " + lowest);
    }
}