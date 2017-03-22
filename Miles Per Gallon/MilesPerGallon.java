/**
 * Created by hameed 함 on 3/22/2017.
 */


public class MilesPerGallon
{
    public static void main(String[] arg) {
        Miles myMiles = new Miles();

        while (myMiles.tripsOver == false)
        {
            myMiles.MakeATrip();
        }
    }
}
