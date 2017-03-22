import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by hameed 함 on 3/22/2017.
 */
public class Palindromes
{
    public static void main(String[] args)
    {
        Prompt();
    }

    static void Prompt()
    {
        String userResponse;
        Scanner input;

        input = new Scanner(System.in);

        out.print("Enter in a 5 digit number that can be read the same forwards and backwards.\n" +
        "EX: 01110 or 12321. Okay, now you try! \n\n");

        userResponse = input.next();
        CheckResponse(userResponse);
    }

    static void CheckResponse(String userResponse)
    {
        if((userResponse.length() == 5))
        {
                isPalindrome(userResponse);
                out.print("\n" + "Yes. This is exactly what I am looking for. Thank you!");
        }
        else
        {
            out.print("\n" + "No. No....This will never do. Try again.");
            Prompt();
        }
    }

    static boolean isPalindrome(String userResponse)
    {

        char[] number = userResponse.toCharArray();

        char first,second,fourth, last;

        first = number[0];
        second = number[1];
        fourth = number[3];
        last = number[number.length -1];

        if(first != last)
            if (second != fourth)
                return false;
        return true;
    }
}
