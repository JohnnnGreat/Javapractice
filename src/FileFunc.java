import java.io.File;

public class FileFunc {

    boolean fileExists = false;
    String info;

    public String ReadFile(String fileName) {
        // import the file class
        File file = new File(fileName);

        // Check if file exists
        if (file.exists()) {
            fileExists = true;
        }
        if (fileExists) {
            info= "Absolute Path: " + file.getAbsolutePath() + ' ' + file.getName() + file.lastModified() + file.isFile() + file.toString()+file.getParent()+file.mkdir();
        }
        return info;
    }
}
