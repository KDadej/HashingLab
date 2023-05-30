import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ) throws IOException {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give file with data");
        String inputFileName = myObj.nextLine();
        FIleReader inputFile = new FIleReader(new File (inputFileName));

        System.out.println("m - Morse, c - Cesar");
        String mode = myObj.nextLine();

        System.out.println("Give output file");
        String outputFileName = myObj.nextLine();
        FileSaver outputFile = new FileSaver(outputFileName);
        ArrayList<String> tablica = inputFile.read();
        outputFile.saveArray(tablica);

        if (mode == "m") {

        }
        else if (mode == "c") {

        }
        else {
            System.out.println("error");
        }



    }
}
