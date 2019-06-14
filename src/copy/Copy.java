package copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {
    public static void main(String[] args) {
        try{
            Path sourcePath = Paths.get("src/copy/textForCopy.txt"), destinationPath = Paths.get("src/copy/copyFile.txt");
            Files.copy(sourcePath, destinationPath);
        }
        catch (IOException exception){
            System.out.println("Input / Output Error");
        }
    }
}