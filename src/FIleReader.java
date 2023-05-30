import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class FIleReader {
    private File file;

    public FIleReader(File file) {
        this.file = file;
    }
    public ArrayList<String> read() throws FileNotFoundException {
        ArrayList<String> array = new ArrayList<>();

        Scanner scan = new Scanner(file);
        String nextscan;
        while (scan.hasNext()) {
            nextscan = scan.next();
            array.add(String.valueOf(nextscan));

        }
        return array;
    }



}
