import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadStringBufferedReader {
    public static void main(String[] args) throws IOException{
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Your name: ");
        String name = rdr.readLine();
        System.out.println("Hello " + name);

        System.out.print("Enter you Roll No: ");
        String rollNo = rdr.readLine();

        String exceptionMsg = "";
        try {
            Integer.parseInt(rollNo);
            System.out.println("Your Roll No. is " + rollNo + exceptionMsg);
        } catch (NumberFormatException e) {
            exceptionMsg = " and it contains some non-integer elements.";
        } finally {
            System.out.println("Thanks for using this program that takes input through BufferedReader");
        }

    }
}
