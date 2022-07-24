public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(55));
        System.out.println(sumDigits(555));

        System.out.println(sumDigitsRecursion(55));
        System.out.println(sumDigitsRecursion(555));
    }

    public static int sumDigits(int number)
    {
        int digit, sum = 0;

        if (number < 10) return -1;

        while (number > 0)
        {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static int sumDigitsRecursion(int number)
    {
        return number == 0 ? 0 : number % 10 + sumDigitsRecursion(number/10);
    }
}