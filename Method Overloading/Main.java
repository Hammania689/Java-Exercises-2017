import java.util.Scanner;
import static java.lang.System.out;

/**
 * Created by Hameed Abdul  함 on 1/9/2017.
 */
public class Main
{

    public static void main(String[] args)
    {
        out.print("Enter you Name: \t");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        int newScore = calculateScore(name, 500);
        out.println("New score is " + newScore + "\n");
        calculateScore(75);
        calculateScore();

        out.println("Enter in your height (American Standard)");
        out.print("Feet: \t");
        double f = scanner.nextDouble();
        out.print("Inches: \t");
        double i = scanner.nextDouble();
        calcFeetAndInchesToCentimeters(f,i);

        out.println("Enter in your height in only inches");
        double totalInches = scanner.nextDouble();
        calcFeetAndInchesToCentimeters(totalInches);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if(feet >= 0 && inches >= 0 && inches <= 12){
            double height = ((feet * 12) * 2.54);
            height += (inches * 2.54);
            out.println("\n" + "Your height is " + height + "cm");
            return ((feet * 12) * 2.54) + (inches * 2.54); // returns equivalent measurement in Cms
        }
        else
            out.print(("Try again. Units out of range"));
        return  -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches < 0){
            out.print(("Try again. Units out of range"));
            return -1;
        }

        double ft = (int) inches / 12;
        double in = (int) inches % 12;
        out.println("\n" + "Your height is " + ft + "' " + in);
        return calcFeetAndInchesToCentimeters(ft, in);
    }

    public static int calculateScore (String name, int i){
        out.println("Player " + name + " scored " + i + " points");
        return i * 1000;
    }

    public static int calculateScore(int i){
        out.println("Unnamed player scored " + i + " points");
        return 0;
    }

    public static int calculateScore() {
    out.println("No player name, no player score.");
    return 0;
}
}
