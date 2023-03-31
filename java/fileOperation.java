import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileOperation {
    public static void main(String[] args) {

        /*
         * File myFile = new File("aman.txt");
         * 
         * // myFile.delete(); //deleting the file
         * try {
         * myFile.createNewFile();
         * } catch (IOException e) {
         * System.out.println("Unable to create this file!");
         * e.printStackTrace();
         * }
         */

        /*
         * try {
         * FileWriter fileWriter = new FileWriter("aman.txt");
         * fileWriter.write("Hello world");
         * fileWriter.close();
         * } catch (IOException e) {
         * System.out.println(e.toString());
         * e.printStackTrace();
         * }
         */

        File myFile = new File("aman.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }
}
