package delete;

import java.io.File;

public class Delete {
    public static void main(String[] args) {
        File file = new File("src/delete/file.txt");
        file.delete();
    }
}
