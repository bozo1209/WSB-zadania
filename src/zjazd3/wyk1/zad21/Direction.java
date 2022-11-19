package zjazd3.wyk1.zad21;


public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public static Direction safeValueOf(String value){
        return switch (value.toUpperCase()){
            case "NORTH" -> NORTH;
            case "SOUTH" -> SOUTH;
            case "EAST" -> EAST;
            case "WEST" -> WEST;
            default -> null;
        };
    }
}
