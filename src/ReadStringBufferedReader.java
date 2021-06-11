import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadStringBufferedReader {
    public static void main(String[] args) throws IOException{
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Your name: ");
        String name = rdr.readLine();
        System.out.printf("Hello %s, Thanks for using this program that takes input through BufferedReader\n", name);
    }
}
