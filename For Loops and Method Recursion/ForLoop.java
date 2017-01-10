package com.company;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ForLoop {

    public static void main(String[] args) {
        out.println("This program will calculate the annual simple interest received on the principal(intial investment). With the interest rate increasing every year up to 10%");
        out.println("\n" + "What is your investment principle?");
        out.print("$");

        Scanner scanner = new Scanner(in);
        double principle = scanner.nextDouble();

        for(int i = 0; i <= 10; i++)
        {
            out.println("\n" + "Year " + i + ". Adjusting interest accordingly");
            out.println( "$" + principle + " at " + i + "% interest = " + String.format("%.2f", calculateInterest(principle, i)));
        }

        out.println();
        out.println("Just for kicks here are the first 10 prime numbers, Enjoy \n");

        int counter = 0;

        for(int i = 0; i <21 ; i++)
        {
            isPrime(i);
            if(isPrime(i)){
                if(counter == 10)
                    break;
                out.println(i + " is a prime number");
                counter += 1;
            }
        }
    }

    public static boolean isPrime(int n)
    {
        if(n==1)
            return false;
        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return  true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
