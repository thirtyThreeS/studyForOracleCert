public class Main {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tony", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Craig", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Sally", position);
    }

    public static void displayHighScorePosition(String name, int position)
    {
        System.out.println(name + " managed to get into position " + position + " on the high score table! Well done!");
    }

    public static int calculateHighScorePosition(int playerScore)
    {
        if (playerScore >= 1000) return 1;
        else if (playerScore >= 500) return 2;
        else if (playerScore >= 100) return 3;
        return 4;
    }
}