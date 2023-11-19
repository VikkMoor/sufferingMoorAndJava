package sem3.lessonTasks;

import java.util.ArrayList;
import java.util.List;

public class shopBook {
    /*
    The bookstore catalog is saved as a two-dimensional list: List<ArrayList<String>>,
    so that the 0th position of each internal list contains the name of the genre,
    and the rest positions - book titles. Write a method to populate this structure
    (but with only unique values).

    [
        ["Novel", "War and Peace", "The Master and Margarita"],
        ["Fairy Tale", "Pinocchio", "Turnip"],
        ["Fantasy", "Harry Potter"]
    ]
     */
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Novel", "War and Peace");
        addBook(shopBook, "Fairy Tale", "Pinocchio");
        addBook(shopBook, "Novel", "The Master and Margarita");
        addBook(shopBook, "Fantasy", "Harry Potter");
        addBook(shopBook, "Fairy Tale", "Turnip");
        addBook(shopBook, "Fairy Tale", "Turnip");
        addBook(shopBook, "Fantasy", "Turnip");

        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook) {
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> curList = shopBook.get(i);
            if (curList.get(0).equalsIgnoreCase(genre)) {
                if (!curList.contains(nameBook)) {
                    curList.add(nameBook);
                }
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);
    }
}
