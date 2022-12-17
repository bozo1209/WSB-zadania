package zjazd4.wyk1.zad24;

import zjazd4.wyk1.zad24.exceptions.NoTimezoneForCityException;
import zjazd4.wyk1.zad24.exceptions.ValidationException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.zone.ZoneRulesException;
import java.util.Map;
import java.util.Scanner;

public class Zad24 {
    public static void main(String[] args)  {
//        System.out.println(GetDataFromFile
//                .getTimeZone("src\\zjazd4\\wyk1\\zad24\\timezones.txt", "WarsZawa"));
//
//        System.out.println("-------------------------");
//        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
//        System.out.println("-------------------------");
//
//        System.out.println(ZoneId.of("Asia/Tokyo"));
//        Map<String, String> pathAndCity = GetDataFromUser.getPathAndCity();
//        System.out.println(GetDataFromFile.getTimeZone(pathAndCity.get("path"), pathAndCity.get("city")));

        run();

//        try {
//            Files.lines(Paths.get("src\\zjazd4\\wyk1\\zad24"))
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        while (true){

            time();

            System.out.println("if you want to exit pres \"Q\"");
            String exit = scanner.nextLine();
            if (exit.equalsIgnoreCase("Q")){
                break;
            }
        }
    }

    public static void time(){
        Map<String, String> pathAndCity = GetDataFromUser.getPathAndCity();
        try {
            System.out.println(LocalDateTime.now(GetTimeZone.getTimeZone(GetDataFromFile.getTimeZone(pathAndCity.get("path"), pathAndCity.get("city")))));
        } catch (IOException | NoTimezoneForCityException | ZoneRulesException e) {
            System.out.println(e.getMessage());
        }
    }
}
