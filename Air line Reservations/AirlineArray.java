import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by hameed on 4/6/2017.
 */




public class AirlineArray
{
    public static void main(String[] args)
    {
        int userRespone = 0;
        Scanner scanner = new Scanner(System.in);

        Airplane currentFlight = new Airplane();

        for(int i = 0; i < 10; i++)
        {
            out.println("Welcome to the Object Oriented Airlines \n"
            + "Please select the Air Class you wish to fly. \n" +
            "1 : First Class \n" + "2 : Economy \n");
            userRespone = scanner.nextInt();
            currentFlight.seatAirplane(userRespone);
        }
    }
}
