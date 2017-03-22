/**
 * Created by hameed 함 on 3/22/2017.
 */

import java.util.Scanner;

import static java.lang.System.out;


public class Miles
{
    public static boolean tripsOver = false;
    static double GasMileAge;
    static int TotalMiles;
    static int TotalGallonsUsed;

    public void MakeATrip()
   {
       int tripMiles;
       int tripGallons;
       Scanner promptResponse = new Scanner(System.in);

       out.println("Type in the number of miles driven. Then press Enter. \n" +
               "Enter in 0 at any time to see Average Gas Mileage.\n");
       tripMiles = promptResponse.nextInt();

       out.println("Type in the number of gallons used. Then press Enter.\n" +
               "Enter in 0 at any time to see Average Gas Mileage.\n");
       tripGallons = promptResponse.nextInt();

       this.TotalMiles += tripMiles;
       this.TotalGallonsUsed += tripGallons;

       if(tripGallons == 0 || tripMiles == 0)
       {
            tripsOver = true;
            out.print("You have ended the entry of collective miles and gallons used.\n");
            CollectiveTripResult();
       }
   }

   public void CollectiveTripResult()
   {
       out.print("Your Trips\n" +
               "========================\n" +
               "Total Miles : \t\t " + TotalMiles + " \n" +
               "Total Gallons : \t\t" + TotalGallonsUsed +" \n" +
               "Average Gas Mileage : \t" + getGasMileAge());
   }

   public double getGasMileAge()
   {
      GasMileAge = this.TotalMiles / this.TotalGallonsUsed;
      return (GasMileAge * 100.00) / 100.00;
   }
}
