public class Main {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(38));
        System.out.println(calcFeetAndInchesToCentimeters(3, 2));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches)
    {
        if (feet < 0 || inches < 0 || inches > 12) return -1;

        // Not needed but makes logical sense to a Human.
        if (inches == 12)
        {
            feet++;
            inches = 0;
        }

        return (feet * 12 + inches) / 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches)
    {
        if (inches < 0) return -1;

        int feet = inches / 12;
        inches = inches % 12;

        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}