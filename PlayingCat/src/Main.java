public class Main {
    public static void main(String[] args) {
        // Switch
        char yourChar = 'A';

        switch(yourChar)
        {
            case 'A':
                System.out.println("Character A was selected");
                break;
            case 'B':
                System.out.println("Character B was selected");
                break;
            case 'C':
                System.out.println("Character C was selected");
                break;
            case 'D':
                System.out.println("Character D was selected");
                break;
            case 'E':
                System.out.println("Character E was selected");
                break;
            default:
                System.out.println("No valid characters selected");
                break;
        }

        // Refactor a Switch Statement
        yourChar = 'D';

        switch(yourChar)
        {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Character " + yourChar + " was selected");
                break;
            default:
                System.out.println("No valid characters selected");
                break;
        }
    }
}