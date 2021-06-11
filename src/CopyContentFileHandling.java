import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentFileHandling {
    public static void main(String[] args) {
        File file1 = new File(args[0]);

        try {
            FileWriter fileWrite = new FileWriter(args[1]);
            Scanner sc = new Scanner(file1);

            while (sc.hasNextLine()) {
                System.out.println("Reading Content of Source File");
                fileWrite.write(sc.nextLine());
                System.out.println("Completed Reading text of Source File");
            }

            fileWrite.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
