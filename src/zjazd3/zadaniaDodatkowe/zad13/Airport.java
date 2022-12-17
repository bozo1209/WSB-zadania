package zjazd3.zadaniaDodatkowe.zad13;

public class Airport {
    private final String code;
//    private final String cityName;


    public Airport(String code) {
        this.code = code;
    }

//    public Airport(String code, String cityName) {
//        this.code = code;
//        this.cityName = cityName;
//    }

    public String getCode() {
        return code;
    }

//    public String getCityName() {
//        return cityName;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Airport airport = (Airport) o;
//        return Objects.equals(code, airport.code) && Objects.equals(cityName, airport.cityName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(code, cityName);
//    }
//
//    @Override
//    public String toString() {
//        return "Airport{" +
//                "code='" + code + '\'' +
//                ", cityName='" + cityName + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Airport{" +
                "code='" + code + '\'' +
                '}';
    }
}