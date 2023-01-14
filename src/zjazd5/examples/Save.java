package zjazd5.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Save {
    public static void save(Path path, String toSave){
        try {
            Files.write(path, toSave.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
