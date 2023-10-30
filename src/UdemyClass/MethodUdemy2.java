package UdemyClass;

public class MethodUdemy2
{
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;



        caculateScore(true, 800, levelCompleted, bonus);
    }

    public static void caculateScore(boolean gameOver, int score, int levelCompleted,int bonus)
    {
        int finalScore = score;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver)
        {
            finalScore += (levelCompleted * bonus);
            System.out.println(" Your final score was " + finalScore);
        }
    }
}
