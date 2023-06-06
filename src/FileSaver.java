import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileSaver {

    private String name;
    private File file = null;

    public FileSaver(String name) {
        this.name = name;
    }

    public void makeFile() throws IOException {
        if (file == null) {
            File newFile = new File(name);
            newFile.createNewFile();

        }

    }

    public void saveArray(ArrayList<String> array) throws IOException {
        makeFile();
        FileWriter myWriter = new FileWriter(name);
        for (int i = 0; i<array.size(); i++) {
            myWriter.write(array.get(i));
            myWriter.write("\n");
        }
        myWriter.close();

    }

    public void saveWord(String word) throws IOException {
        makeFile();
        FileWriter myWriter = new FileWriter(name);
        myWriter.write(word);
        myWriter.write("\n");
        myWriter.close();

    }




}
