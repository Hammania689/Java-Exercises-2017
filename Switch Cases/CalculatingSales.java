import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by hameed 함 on 3/22/2017.
 */
public class CalculatingSales
{
    public static void main(String[] args)
    {
        Prompt();
        for(int retailSelection = 1; retailSelection < 5; retailSelection++)
        {
            double itemPrice;
            int itemQuantity;

            itemPrice = ProductPrice(retailSelection);
            itemQuantity = DesiredProductQuantity(retailSelection);
            CalculateTotal(itemPrice,itemQuantity);
        }
    }

    static void Prompt()
    {
        out.print("HELLO AND WELCOME TO THE DIRT CHEAP EMPORIUM! \n" +
                "We have an extraordinary deal for you today! We have 5 Products on sale! \n"
                + "Let's get started! \n\n\n"
        );
    }


    static void  CalculateTotal(double price, int quantity)
    {
        double total;

        total = price * quantity;

        DisplayTotal(price,quantity,total);
    }


    static void DisplayTotal(double price, int quantity,double total)
    {
        out.println("\n" + "Reciept \n"
                    + "=================\n"
                    + "Item Price \t\t : \t$" + price + "\n"
                    + "Item Quantity \t : \t" + quantity + "\n"
                    + "Total \t\t\t : \t$" + Math.round(total * 100.00)/ 100.00 + "\n\n\n"
                    + "Refunds are subjected to the owner's biased opinion of court of law..... \n\n\n"
        );
    }

    static double ProductPrice(int itemNumber)
    {
        double productPrice = 0;

        switch (itemNumber)
        {
            case 1 : productPrice = 2.98;
                out.println("Current Deal : Product " + itemNumber + "\n");
                break;
            case 2 : productPrice = 4.50;
                out.println("Current Deal : Product " + itemNumber + "\n");
                break;
            case 3 : productPrice = 9.98;
                out.println("Current Deal : Product " + itemNumber + "\n");
                break;
            case 4 : productPrice = 4.49;
                out.println("Current Deal : Product " + itemNumber + "\n");
                break;
            case 5 : productPrice = 6.87;
                out.println("Current Deal : Product " + itemNumber + "\n");
                break;
        }
        return productPrice;
    }

    static int DesiredProductQuantity(int productNumber)
    {
        int numOfProduct;
        Scanner input;

        numOfProduct = 0;
        input = new Scanner(System.in);

        out.println("Enter in your desired quantity for Product " + productNumber + ". Then press enter. \n");
        numOfProduct = input.nextInt();

        return numOfProduct;
    }
}
