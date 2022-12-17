package zjazd4.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Album {

    String artist;
    String name;

    Integer year;
    List<Track> tracks;

    public Album(String artist, String name, Integer year, List<Track> tracks) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.tracks = tracks;
    }


    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public List<Track> getTracks() {
        return tracks;
    }


}

class Track {
    String name;
    Integer rating;

    public Track(String name, Integer rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Integer getRating() {
        return rating;
    }
}

public class HitList {

    public static void main(String[] args) {
        List<Album> albums = List.of(
                new Album("Nirvana", "Nevermind", 1983,
                        List.of(new Track("someTrack1", 2),
                                new Track("someTrack2", 5),
                                new Track("someTrack3", 1))),
                new Album("Bob Dylan", "Rough and Rowdy Ways", 2020,
                        List.of(new Track("someTrack1", 7),
                                new Track("someTrack2", 7),
                                new Track("someTrack3", 4))),
                new Album("The Rolling Stones", "Some Girls", 1997,
                        List.of(new Track("someTrack1", 1),
                                new Track("someTrack2", 1),
                                new Track("someTrack3", 1))),
                new Album("Whitney Houston", "Whitney Houston", 1986,
                        List.of(new Track("someTrack1", 2),
                                new Track("someTrack3", 1))));

        // Przepisz ponizszy kod uzywajac stream i lambd.
        // Skorzystaj z operacji filter i foreach
        for (Album a : albums) {
            if (a.getYear() > 2000) {
                System.out.println(a.getName());
            }
        }

        System.out.println("-------------------");
        albums.stream().filter(a -> a.getYear() > 2000).forEach(a -> System.out.println(a.getName()));
        System.out.println("-------------------");

        // Przepisz ponizszy kod uzywajac stream i lambd.
        // Skorzystaj z operacji filter i collect
        List<Album> hits = new ArrayList<>();
        for (Album a : albums) {
            boolean hasFavorite = false;
            for (Track t : a.tracks) {
                if (t.rating >= 4) {
                    hasFavorite = true;
                    break;
                }
            }
            if (hasFavorite)
                hits.add(a);
        }

        hits.forEach(a -> System.out.println(a.getName()));
        System.out.println("-------------------");
        List<Album> collect = albums.stream().filter(a -> a.getTracks().stream().anyMatch(t -> t.getRating() >= 4)).collect(Collectors.toList());
        collect.forEach(a -> System.out.println(a.getName()));
        System.out.println("-------------------");
        List<Album> collect2 = albums.stream().filter(a -> a.getTracks().stream().filter(t -> t.getRating() >= 4).findFirst().isPresent()).collect(Collectors.toList());
        collect2.forEach(a -> System.out.println(a.getName()));

    }
}
