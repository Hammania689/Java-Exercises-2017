import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

/**
 * Created by hameed 함 on 3/9/2017.
 */
public class Encryption
{
    int encryptedNum;

    public void SetEncryptNum() throws IOException {
        Scanner scanner = new Scanner(System.in);
        out.print("\n" + "Enter in a 4 digit whole number you want to encrypt." +
                "Then press Enter. \n");

        int numToEncrypt;
        numToEncrypt = scanner.nextInt();

        if(numToEncrypt > 999)
        {
            EncryptedNumber(numToEncrypt);
        }
        else
        {
            Runtime.getRuntime().exec("cls");
            out.print("\n" + "Number must be 4 digits and greater than 999. + " +
                    "Try Again \n");
            SetEncryptNum();
        }

    }

    int EncryptedNumber(int numToEncrypt)
    {

        String number = String.valueOf(numToEncrypt);
        for(int i = 0; i < number.length(); i++)
        {
            int j = Character.digit(number.charAt(i), 10);
            System.out.println("digit: " + j);
            j += 7;
            j %= 10;
            System.out.println("digit: " + j);
        }

        char firstToThirdSwap;
        firstToThirdSwap = number.charAt(3);
        number.replace(number.charAt(1),number.charAt(3));
        number.replace(firstToThirdSwap,number.charAt(1));

        out.print(encryptedNum);
        encryptedNum = Integer.parseInt(number);
        System.out.println( encryptedNum);
        return encryptedNum;
    }

}

