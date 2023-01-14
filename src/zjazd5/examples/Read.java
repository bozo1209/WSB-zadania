package zjazd5.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Read {
    public static List<String> read(Path path){
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
