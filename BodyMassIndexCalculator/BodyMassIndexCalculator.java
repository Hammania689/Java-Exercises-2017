import java.util.Scanner;
import static java.lang.System.out;

/**
 * Created by hameed 함 on 2/9/2017.
 */
public class BodyMassIndexCalculator
{
    public static void main(String[] args)
    {
        MassInputInKIloGrams();
    }

    public static void MassInputInKIloGrams()
    {
        boolean universalWeightStandard = true;
        Scanner scanner = new Scanner(System.in);

        out.print("Please enter your weight in Kilograms : \t");
        double massInKg = scanner.nextDouble();

        out.print("\n" + "Please enter your height in Centimeters : \t");
        double heightInMeters = scanner.nextDouble()/ 10;

        CalculateBMI(massInKg,heightInMeters,universalWeightStandard);
    }

    public static void CalculateBMI(double weight,double height,boolean universalWeightStandard)
    {
        double BodyMassIndex;
        BodyMassIndex = weight / Math.pow(height,2);
        out.print("\n" + BodyMassIndex);
    }
}
