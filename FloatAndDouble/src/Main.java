public class Main {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

        // Challenge

        // 1. Create a var wih the appropriate type to store the number of pounds to be converted to kilograms
        // 2. Calculate the result ie the number of kgs based on the contents of the var above and store the result in a 2nd appropriate var.
        // 3. sout

        double pounds = 55;

        double convertPoundsToKilograms = pounds * 0.45359237;

        double kilograms = convertPoundsToKilograms;

        System.out.println(convertPoundsToKilograms);
    }
}