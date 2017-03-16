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

        if (numToEncrypt > 999) {
            EncryptedNumber(numToEncrypt);
        } else {
            Runtime.getRuntime().exec("cls");
            out.print("\n" + "Number must be 4 digits and greater than 999. + " +
                    "Try Again \n");
            SetEncryptNum();
        }
    }

    int EncryptedNumber(int numToEncrypt) {
        String num = Integer.toString(numToEncrypt);
        for (int i = 0; i < num.length(); i++) {
            int j = Character.digit(num.charAt(i), 10);
            j += 7;
            j %= 10;

            String hld = Integer.toString(j);

            num = changeCharInPosition(i, hld.charAt(0), num);
            out.println("digit: " + j);
        }
        out.println(num);

        SwitchOrder(num);
        return encryptedNum;
    }

    void SwitchOrder(String num)
    {
        char firstToThird;
        char thirdToFirst;
        char secondToFourth;
        char fourthToSecond;

        firstToThird = num.charAt(0);
        secondToFourth = num.charAt(1);
        thirdToFirst = num.charAt(2);
        fourthToSecond = num.charAt(3);

        num = changeCharInPosition(0, thirdToFirst, num);
        num = changeCharInPosition(1, fourthToSecond, num);
        num = changeCharInPosition(2, firstToThird, num);
        num = changeCharInPosition(3, secondToFourth, num);

        out.println();
        out.println();
        out.println(num);

        encryptedNum = Integer.parseInt(num);
    }

    public String changeCharInPosition(int position, char ch, String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

    public int GetEncryptedNum()
    {
        return encryptedNum;
    }
}

