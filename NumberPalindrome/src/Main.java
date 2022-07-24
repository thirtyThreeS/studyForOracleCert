public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-707));
        System.out.println(isPalindrome(13));
    }

    public static boolean isPalindrome(int number)
    {
        int digit, reverse = 0;
        int startingNumber = number;

        while (number != 0)
        {
            digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }

        return reverse == startingNumber;
    }
}