/**
 * Created by Jakob on 15-09-2016.
 */
public class ITJPchapter12exercise10 {

    public static void main(String[] args) {

        int length = 1200000000;

        try {
            byte[] array = new byte[length];
        }
        catch (OutOfMemoryError ex) { // Handle OutOfMemoryError
            System.out.println(ex.getMessage());
        }

        System.out.println("Error handled program continues... ");
    }

}
