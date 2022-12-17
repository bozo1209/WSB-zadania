package zjazd4.wyk1.zad24;

import zjazd4.wyk1.zad24.exceptions.NoTimezoneForCityException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GetDataFromFile {

    public static String getTimeZone(String path, String city) throws IOException, NoTimezoneForCityException {
        return Files.lines(Paths.get(path))
                .filter(l -> l.toUpperCase().matches(".*" + city.toUpperCase() + ",.*"))
                .findFirst()
                .orElseThrow(() -> new NoTimezoneForCityException("no timezone form a city " + city));
    }
}
