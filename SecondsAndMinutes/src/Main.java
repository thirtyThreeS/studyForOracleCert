public class Main {
    public static void main(String[] args) {
        getDurationString(5, 0);
        getDurationString(300);

        getDurationString(5, 5);
        getDurationString(305);

        getDurationString(500, 0);
        getDurationString(30000);
    }

    public static void getDurationString(int minutes, int seconds)
    {
        if (minutes < 0 || seconds < 0 || seconds > 59) System.out.println("Invalid Value");

        int hours = minutes / 60;
        minutes = minutes % 60;

        // Append 0 before any number that is less than 10
        String hourString = hours + "h ";
        if (hours < 10) hourString = "0" + hourString;
        String minuteString = minutes + "m ";
        if (minutes < 10) minuteString = "0" + minuteString;
        String secondsString = seconds + "s";
        if (seconds < 10) secondsString = "0" + secondsString;

        System.out.println("Minutes and Seconds calculated into hours and minutes: " + hourString + minuteString + secondsString);
    }

    public static void getDurationString(int seconds)
    {
        if (seconds < 0) System.out.println("Invalid Value");

        int minutes = seconds / 60;
        seconds = seconds % 60;
        int hours = minutes / 60;

        // No overload for hours so the method call is before minutes % 60 for hours.
        getDurationString(minutes, seconds);

        minutes = minutes % 60;
        System.out.println("Seconds calculated into minutes and hours: " + hours + "h " + minutes + "m " + seconds + "s");
    }
}