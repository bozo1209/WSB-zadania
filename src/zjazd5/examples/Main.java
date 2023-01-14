package zjazd5.examples;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("src\\zjazd5\\examples\\file.txt");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("[s]ave, [w]rite, [q]uit");
            String whatToDo = scanner.nextLine();
            if (whatToDo.equalsIgnoreCase("s")){
                System.out.println("what to save");
                String toSave = scanner.nextLine();
                Save.save(path, toSave);
            }else if (whatToDo.equalsIgnoreCase("w")){
                Read.read(path).forEach(System.out::println);
            }else if (whatToDo.equalsIgnoreCase("q")){
                break;
            }
        }
    }
}
