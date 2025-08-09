import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BookDistributor {

    public static List<List<String>> distributeBooks(List<String> books) {

        Collections.sort(books);

        final int SHELVES_COUNT = 5;

        List<List<String>> shelves = new ArrayList<>(SHELVES_COUNT);

        for (int i = 0; i < SHELVES_COUNT; i++) {
            shelves.add(new ArrayList<>());
        }

        int totalBooks = books.size();

        for (int i = 0; i < totalBooks; i++) {
            int shelfIndex = i * SHELVES_COUNT / totalBooks;

            shelves.get(shelfIndex).add(books.get(i));
        }
        return shelves;



    }

}

