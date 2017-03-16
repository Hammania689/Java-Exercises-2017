import static java.lang.System.out;

/**
 * Created by hameed 함 on 3/9/2017.
 */

public class Decryption
{
    int encryptedNum;

    int DecryptNum(int numToEncrypt) {
        String num = Integer.toString(numToEncrypt);
        for (int i = 0; i < num.length(); i++) {
            int j = Character.digit(num.charAt(i), 10);
            j -= 3;
            j %= 10;

            String hld = Integer.toString(j);

            num = changeCharInPosition(i, hld.charAt(0), num);
            out.println("digit: " + j);
        }
        out.println(num);

        return encryptedNum;
    }

    void OriginalOrder(String num)
    {
        char firstToThird;
        char thirdToFirst;
        char secondToFourth;
        char fourthToSecond;

        firstToThird = num.charAt(0);
        secondToFourth = num.charAt(1);
        thirdToFirst = num.charAt(2);
        fourthToSecond = num.charAt(3);

        num = changeCharInPosition(0, firstToThird, num);
        num = changeCharInPosition(1, secondToFourth, num);
        num = changeCharInPosition(2, firstToThird, num);
        num = changeCharInPosition(3, secondToFourth, num);

        out.println();
        out.println(num);

        encryptedNum = Integer.parseInt(num);
        DecryptNum(encryptedNum);
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

    int GetNumber()
    {
        return encryptedNum;
    }
}

