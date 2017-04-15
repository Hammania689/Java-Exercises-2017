import static java.lang.System.out;

/**
 * Created by hameed on 4/6/2017.
 */


public class Airplane
{

    public static Seats collectiveSeats[] = new Seats[10];
    boolean maxCapacity = false;

    int counter = 0;

    void showSeatingStatus()
    {
        for(int i = 0; i < 10; i++)
        {
            out.println(collectiveSeats[i].getSeatTaken());
        }
        out.println();
        out.println();
    }

    void ConstructSeats()
    {
        for(int i = 0; i < 10; i++)
        {
            collectiveSeats[i] = new Seats();
            collectiveSeats[i].setAirClass(i + 1);
        }
    }

    boolean isMaxCapacity()
    {

        for(int i = 0; i < 10; i++)
        {
            collectiveSeats[i].getSeatTaken();

            if(collectiveSeats[i].getSeatTaken() == false)
                maxCapacity = false;

        }

        return maxCapacity;
    }

    public void seatAirplane(int section)
    {
        boolean seated = false;

        ConstructSeats();

        while (maxCapacity = false)
        {
            if(section == 1)
            {
                for(counter = 0; counter < 5; counter++)
                {
                    if(collectiveSeats[counter].getSeatTaken() == false)
                    {
                        // if the seat isn't taken
                        collectiveSeats[counter].setSeatTaken(true);
                        out.println("You've been seated at seat " + (counter + 1));
                        counter = 5;
                    }
                        // if the seat is taken go to the next seat
                    showSeatingStatus();
                }
            }
            else if(section == 2)
            {
                for(counter = 6; counter < 10; counter++)
                {
                    if(collectiveSeats[counter].getSeatTaken() == false)
                    {
                        // if the seat isn't taken
                        collectiveSeats[counter].setSeatTaken(true);
                        out.println("You've been seated at seat " + (counter + 1));
                        counter = 5;
                    }
                    // if the seat is taken go to the next seat
                    showSeatingStatus();
                }
            }
            else
            {
                out.println("\n"+"Terribly sorry but we are out of seats. \n" +
                "Next flight leaves in 3 hours \n");
            }
        }
    }
}

