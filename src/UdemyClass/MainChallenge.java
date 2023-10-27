package UdemyClass;

public class MainChallenge
{
    public static void main(String[] args)
    {


        boolean gameOver = true;
        int Score = 10000;
        int levelCompleted = 8;
        int bonus = 200;


        int finalScore = Score;

        if (gameOver)
        {
            finalScore += (levelCompleted * bonus);

            System.out.println("Your final score was: " + finalScore);

        }
    }
}
