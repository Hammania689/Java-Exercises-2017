import java.io.IOException;

/**
 * Created by hameed 함 on 3/9/2017.
 */

public class Main {

    public static void main(String[] args) throws IOException
    {
        Encryption work = new Encryption();

        work.SetEncryptNum();

        Decryption unWork = new Decryption();
        unWork.OriginalOrder(Integer.toString(work.GetEncryptedNum()));
    }
}
