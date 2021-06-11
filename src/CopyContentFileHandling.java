import java.util.Scanner;
import java.io.*;

public class CopyContentFileHandling {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Not enough Arguments (Filename)\nClosing Program...");
            System.exit(101);
        }
        try {
            File fin = new File(args[0]);
            FileWriter fout = new FileWriter(args[1]);
            Scanner sc = new Scanner(fin);

            while (sc.hasNextLine()) {
                System.out.println("Reading Content of Source File\n.\n.\n.");
                fout.write(sc.nextLine());
                System.out.println("Completed Reading text of Source File");
            }
            fout.close();

        } catch (FileNotFoundException e) {
            System.out.println("Not able to open the File!" + e);
        } catch (IOException e) {
            System.out.println("Not able to Read/Write the File(s)!" + e);
        }
    }
}
