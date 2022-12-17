package zjazd4.wyk1.zad24;

import java.time.ZoneId;

public class GetTimeZone {

    public static ZoneId getTimeZone(String line){
        return ZoneId.of(line.split(",")[1]);
    }
}
