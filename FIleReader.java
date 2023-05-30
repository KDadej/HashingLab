import java.util.Scanner;
import java.io.File;

public class FIleReader {
    private File file;

    public FIleReader(File file) {
        this.file = file;
    }
    public ArrayList<String> read() {
        ArrayList<String> array = new ArrayList<String>();
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            array.add(scan);
        }
        return array;
    }



}
