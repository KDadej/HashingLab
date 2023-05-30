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
        ArrayList<String> tablica = inputFile.read();
        System.out.println("m - Morse, c - Cesar");
        String mode = myObj.nextLine();

        System.out.println("Give output file");
        String outputFileName = myObj.nextLine();
        FileSaver outputFile = new FileSaver(outputFileName);
        if (mode.equals("m")) {
            Mors morse = new Mors();

            for (int i = 0; i<tablica.size(); i++) {
                tablica.set(i,  morse.szyfr(tablica.get(i)));
            }
            outputFile.saveArray(tablica);
        }  else if (mode.equals("c")) {
            Ceasar cezar = new Ceasar();

            for (int i = 0; i<tablica.size(); i++) {
                tablica.set(i,  cezar.encrypt(tablica.get(i)));
            }
            outputFile.saveArray(tablica);
        } else {
            System.out.println("error");
        }









    }
}
