/**
 * Created by hameed on 4/6/2017.
 */
public class Seat
{
    private boolean seatTaken = false;
    private String airClass = "";
    private String ownerName = "";

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

    void setOwnerName(String name)
    {
        ownerName = name;
    }


    String getAirClass()
    {
        return  airClass;
    }
    String getOwnerName(){ return  ownerName;}
    boolean getSeatTaken()
    {
        return  seatTaken;
    }
}
