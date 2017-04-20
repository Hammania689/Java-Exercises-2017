import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by hameed on 4/6/2017.
 */


public class Airplane
{

    Scanner scanner = new Scanner(System.in);

    public static Seat collectiveSeats[] = new Seat[10];
    boolean maxCapacity = false;


    // Sets a value and instantiates each seat
    void ConstructSeats()
    {
        for(int i = 0; i < 10; i++)
        {
            collectiveSeats[i] = new Seat();
            collectiveSeats[i].setAirClass(i + 1);
        }
    }

    // Shows all seats and their current seating status
    void showCollectiveSeatStatus()
    {
        for(int i = 0; i < 10; i++)
        {
            out.println(collectiveSeats[i].getSeatTaken());
        }
        out.println();
        out.println();
    }

    // Checks each seat and returns whether or not the plane is full
    boolean isPlaneCapacityFull()
    {
        int fullseatCounter = 0;
        int seatsCounted = 0;

        while(seatsCounted < 10 && maxCapacity == false)
        {
            collectiveSeats[seatsCounted].getSeatTaken();

            // If at least one seat returns true
            // then the plane is not full
            // else if all seats return true then the plane is full

            if(collectiveSeats[seatsCounted].getSeatTaken() == true)
                fullseatCounter += 1;

            seatsCounted++;
        }
            if(fullseatCounter == 10)
            {
                maxCapacity = true;
                out.println("Plane is full \n");
            }
            else
                maxCapacity = false;

        return maxCapacity;
    }

    Seat sectionSeat(int section)
    {
        Seat mySeat = new Seat();
        boolean emptySeat = false;
        int i;

        switch (section)
        {
            case 1 :
                i = 0;
                while(i <= 4 && emptySeat == false)
                {
                    // Find the first empty seat
                    if(collectiveSeats[i].getSeatTaken() == false)
                    {
                        emptySeat = true;
                        collectiveSeats[i].setSeatTaken(true);
                        out.println("This seat now belongs to you!\n" +
                                "Type in your first name to finish Reserving it!");
                        String name = scanner.next();
                        collectiveSeats[i].setOwnerName(name);
                        mySeat = collectiveSeats[i];
                        out.println(mySeat.getOwnerName());
                    }
                    else
                    {
                        // Ask to switch Sections
                        out.println();
                        out.println("Seat : " + (i + 1) + " is already full");
                        mySeat = collectiveSeats[i];
                    }
                i++;
                }
                break;
            case 2 :
                i = 5;
                while(i <= collectiveSeats.length && emptySeat == false)
                {
                    // Find the first empty seat
                    if(collectiveSeats[i].getSeatTaken() == false)
                    {
                        emptySeat = true;
                        collectiveSeats[i].setSeatTaken(true);
                        out.println("This seat now belongs to you!\n" +
                                "Type in your first name to finish Reserving it!");
                        String name = scanner.next();
                        collectiveSeats[i].setOwnerName(name);
                        mySeat = collectiveSeats[i];
                        out.println(mySeat.getOwnerName());
                    }
                    else
                    {
                        // Ask to switch Sections
                        out.println();
                        out.println("Seat : " + (i + 1) + " is already full");
                        mySeat = collectiveSeats[i];
                    }
                i++;
                }
                break;
        }
        return mySeat;
    }

    boolean isSectionFull(int currentSection)
    {
        boolean sectionFull = false;
        int seatCounter = 0;
        int loopCounter = 0;

        // Goes through each seat in section 1 and sees if the section is full
        if (currentSection == 1)
            // Loop counter starts at 0(seat 1) and continues until 5(seat 6)
            while (loopCounter < 5)
            {
                // If a seat is full it is added to the number of full seats (seat counter)
                if (collectiveSeats[loopCounter].getSeatTaken() == true)
                    seatCounter++;
                // Increments the loop
                loopCounter++;
            }

        // Goes through each seat in section 2 and sees if the section is full
        if (currentSection == 2)
        {
            // Loop counter starts at 5 (seat 6)
            loopCounter = 5;
            // Loop counter starts at 5(seat 6) and continues until 9(seat 10)
            while(loopCounter <= collectiveSeats.length)
            {

                if(collectiveSeats[loopCounter].getSeatTaken() == true)
                    seatCounter++;
                loopCounter++;
            }
        }

        if(seatCounter == 5)
            sectionFull = true;

        return sectionFull;
    }


    public void seatAirplane(int section)
    {
        //Scanner scanner = new Scanner(System.in);
        boolean finalizeFlight = false;
        int counter = 0;
        int response = 0;

        // constructs the seats
        ConstructSeats();

        // while the plane is not full
        while (finalizeFlight == false)
        {
            // If the user wants to sit in First Class
            switch (section)
            {
                case 1 :
                        // Finds the first empty seat within section 1 and assigns it
                        if (0 <= counter && counter < 5)
                        {
                            // Ask name
                            // Log time
                            // Swap sections
                            collectiveSeats[counter] = sectionSeat(section);
                            out.println("Current seat : " + (counter + 1) + "\n");
                        }
                        else
                            out.print("Seats are full");
                        // Prompt to switch sections
                    break;
                case 2 :
                    counter = 5;
                    if ( 5 <= counter && counter < collectiveSeats.length)
                    {
                        // Ask name
                        // Log time
                        // Swap sections
                        collectiveSeats[counter] = sectionSeat(section);
                        out.println("Current seat : " + (counter + 1) + "\n");
                    }
                    else
                        out.print("Seats are full");
                    // Prompt to switch sections
            }


                out.print("Current counter : " + counter + "\n");

                // Prompt to exit the loop and Finalize Plane
                out.print("Would you like to finalize the airplane? Enter in 1 for yes and press enter. ");

                // Stores user's response in a variable
                response = scanner.nextInt();

                // Formatting of out put
                out.println();
                out.println();

                if (response == 1 || counter == collectiveSeats.length)
                    finalizeFlight = true;
                else
                {
                    finalizeFlight = false;
                    Prompt();
                }
                // check the section
                // if section is notFull counter ++
                // else switch sections
                //collectiveSeats[counter].setSeatTaken(true);
        }
            showCollectiveSeatStatus();
            out.println();
            out.println();
            out.println("You have finalized this flight." + "\n"+" Here is the schedule!");
    }

    void Prompt()
    {
        int userResponse;
        out.println("Welcome to the Object Oriented Airlines \n"
                + "Please select the Air Class you wish to fly. \n" +
                "1 : First Class \n" + "2 : Economy \n");
        userResponse = scanner.nextInt();

        seatAirplane(userResponse);
    }
}

