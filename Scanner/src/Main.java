import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int sum = 0, count = 1;
        Scanner scanner = new Scanner(System.in);

        while (count < 11)
        {
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt)
            {
                int number = scanner.nextInt();
                sum += number;
                count++;
            }
            else
            {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }
        System.out.println("The sum of your numbers is: " + sum);

        scanner.close();
    }
}