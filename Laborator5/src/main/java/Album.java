import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Album implements Comparable<Album> {
    String nume;
    int anulPublicarii;
    int rating;

    public Album(String nume, int anulPublicarii, int rating) {
        this.nume = nume;
        this.anulPublicarii = anulPublicarii;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nume='" + nume + '\'' +
                ", anulPublicarii=" + anulPublicarii +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Album o) {
        if (this.nume.length() == o.nume.length()) {
            if (this.rating < o.rating) {
                return -1;
            } else if (this.rating == o.rating) {
                return 0;
            }
            return 1;
        } else if (this.nume.length() < o.nume.length()) {
            return -1;
        }
        return 1;
    }

    public static void main(String[] args) {
        List<Album> albumList = new ArrayList<Album>();
        albumList.add(new Album("album1", 1991, 4));
        albumList.add(new Album("album2", 1992, 2));
        albumList.add(new Album("album13", 1994, 3));
        albumList.add(new Album("album4", 1891, 5));
        albumList.add(new Album("album5", 1921, 1));
        Collections.sort(albumList);
        System.out.println(albumList);
    }
}
