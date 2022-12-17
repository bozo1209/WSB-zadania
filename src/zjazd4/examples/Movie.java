package zjazd4.examples;

import java.util.Optional;

public class Movie {
        private String title;
        private String type;
        public Movie(String title, String type) {
            this.title = title;
            this.type = type;
        }
        public String getTitle() {
            return title;
        }
        public Optional<String> getType() {
            return Optional.ofNullable(type);
        }
}
