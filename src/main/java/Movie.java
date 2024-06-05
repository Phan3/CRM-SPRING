import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Movie implements Comparable<Movie> {
    int id;
    String name;

    public Movie(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Movie o) {
        return o.id - this.id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
