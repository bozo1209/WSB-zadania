package zjazd3.zadaniaDodatkowe.zad13;

import java.util.*;
import java.util.stream.Collectors;

public class Zad13 {

    public static void main(String[] args) {
//        Airport airport1 = new Airport("1", "Wrocek");
//        Airport airport2 = new Airport("2", "Wawa");
//        Airport airport3 = new Airport("3", "Kato");
//        Airport airport4 = new Airport("4", "Berlin");
//        Airport airport5 = new Airport("5", "Londyn");
//        Airport airport6 = new Airport("6", "Paryż");

        Airport airport1 = new Airport("1");
        Airport airport2 = new Airport("2");
        Airport airport3 = new Airport("3");
        Airport airport4 = new Airport("4");
        Airport airport5 = new Airport("5");
        Airport airport6 = new Airport("6");

        Set<Route> routes = new HashSet<>();
        routes.add(new Route(airport1, airport2));
        routes.add(new Route(airport2, airport3));
        routes.add(new Route(airport3, airport4));
        routes.add(new Route(airport4, airport5));
        routes.add(new Route(airport5, airport6));
        routes.add(new Route(airport6, airport1));
        routes.add(new Route(airport1, airport3));


        Map<Airport, List<Route>> collect = routes.stream()
                .collect(Collectors.groupingBy(Route::getDeparture));

        System.out.println(collect);
        System.out.println("--------------------------");

        Map<Airport, List<Airport>> collect1 = collect.entrySet().stream()
                .map(e -> Map.entry(e.getKey(), e.getValue().stream()
                        .map(r -> r.getArrival())
                        .collect(Collectors.toList())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(collect1);

    }
}
