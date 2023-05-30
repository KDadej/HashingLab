import java.io.FileWriter;
import java.io.File;

public class FileSaver {

    private String name;
    private File file = null;

    public FileSaver(String name) {
        this.name = name;
    }

    public void makeFile() {
        if (file == null) {
            File newFile = new File(name);
            newFile.createNewFile();

        }

    }

    public void saveArray(ArrayList<String> array) {
        makeFile();
        FileWriter myWriter = new FileWriter(name);
        for (int i = 0; i<array.size(); i++) {
            myWriter.write(array.get(i));
        }
        myWriter.close();

    }

    public void saveWord(String word) {
        makeFile();
        FileWriter myWriter = new FileWriter(name);
        myWriter.write(word);
        myWriter.close();

    }




}
