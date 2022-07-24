public class Main {
    public static void main(String[] args) {
        getEvenNumber(1, 10);
        getEvenNumber(6, 20);
    }

    public static boolean isEvenNumber(int number)
    {
        return number % 2 == 0;
    }

    public static void getEvenNumber(int start, int finish)
    {
        int totalEvenNumbers = 0;

        while (start <= finish)
        {
            start++;

            if (!isEvenNumber(start)) continue;

            System.out.println("Even number " + start);

            totalEvenNumbers++;

            if (totalEvenNumbers == 5)
            {
                System.out.println("Total amount of even numbers = " + totalEvenNumbers);
                break;
            }
        }
    }
}