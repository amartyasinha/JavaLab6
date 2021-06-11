import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadCharBufferedReader {
    public static void main(String[] args) throws IOException{
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first letter of your name: ");
        char letter = (char)rdr.read();

        System.out.println("Your name begins with the letter \"" + letter + "\"");
        System.out.println("Thanks for using this program that takes char input through BufferedReader");
    }
}
