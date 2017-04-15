/**
 * Created by hameed on 4/6/2017.
 */
public class Seats
{
    private boolean seatTaken = false;
    private String airClass = "";

    void setAirClass(int seatPosition)
    {
        if(seatPosition <= 5)
            airClass = "First Class";
        else
            airClass = "Economy";
    }

    void setSeatTaken(boolean seatOccupied)
    {
        if(seatOccupied)
            seatTaken = true;
        else
            seatTaken = false;
    }

    String getAirClass()
    {
        return  airClass;
    }
    boolean getSeatTaken()
    {
        return  seatTaken;
    }
}
