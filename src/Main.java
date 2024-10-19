import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       Author author1 = new Author("Name", "Surname");
       Book book1 = new Book("Book", 1994, author1);
       System.out.println(book1);
               }
}