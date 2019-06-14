package move;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Move {
    public static void main(String[] args) {
        try{
            Path sourcePath = Paths.get("src/move/file.txt"), destinationPath = Paths.get("src/move/folder/file.txt");
            Files.move(sourcePath, destinationPath);
        }
        catch (IOException exception){
            System.out.println("Input / Output Error");
        }
    }
}
