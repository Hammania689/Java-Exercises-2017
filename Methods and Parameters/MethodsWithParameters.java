import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by hameed on 11/20/2016.
 */
public class MethodsWithParameters {

    public static void  main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       /* int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        out.println("Your final score was " + highScore);*/
        calculateHighScorePoistion(1500);
        calculateHighScorePoistion(900);
        calculateHighScorePoistion(400);
        calculateHighScorePoistion(50);
    }


    static int calculateHighScorePoistion(int score)
    {
        out.print("Enter you Name: \t");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int pos;

        if(score >= 1000){
            pos = 1;
            out.println("Name: \t" + name + "\t Rank \t" + pos + "\n");
            return  pos;
        }
        if(score >= 500  && score < 1000) {
            pos = 2;
            out.println("Name: \t" + name + "\t Rank \t" + pos + "\n");
            return pos;
        }
        if(score > 100 && score < 500)
        {
            pos = 3;
            out.println("Name: \t" + name + "\t Rank \t" + pos + "\n");
            return  pos = 3;
        }
        else
        {   pos = 4;
            out.println("Name: \t" + name + "\t Rank \t" + pos + "\n");
            return  pos = 4;
        }
    }

    static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
