package zjazd4.examples;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterMovie {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(new Movie("Parasite", "Dramat"),
                new Movie("Kac Vegas", "Komedia"),
                new Movie("Bękarty wojny", null),
                new Movie("Zielona mila", "Dramat"),
                new Movie("Chłopaki nie płaczą", "Komedia"),
                new Movie("American Pie", null));

        System.out.println("Movies with type:");
        movies.stream()
                .filter(movie -> movie.getType().isPresent())
                .forEach(System.out::println);

        System.out.println("Movies without type:");
        movies.stream()
                .filter(movie -> movie.getType().isEmpty()) //isEmpty
                .forEach(System.out::println);

        System.out.println("Unique genres:");
        movies.stream()
                .map(Movie::getType)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .distinct()
                .forEach(System.out::println);

        //TODO modify examples so that "" was handled
    }
}
