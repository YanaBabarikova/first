import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       Author author1 = new Author("Name", "Surname");
       Author author2 = new Author("Name", "Surname");
       Book book1 = new Book("Book", 1994, author1);
       Book book2 = new Book("Book", 1994, author2);
       System.out.println(book1);
       System.out.println(book2);

       System.out.println(author1.equals(author2));
       System.out.println(book1.equals(book2));



               }
}