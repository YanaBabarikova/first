import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Author fedor = new Author("Федор", "Федорович");
        Book book1 = new Book("Первая книга", 1988, fedor);
           System.out.println("Книга: " + book1.getName() + ", Автор: " + book1.getAuthor().getFirstname() + " " + book1.getAuthor().getSurname() + ", Год публикации: " + book1.getYear());
           book1.setYear(1985);
        System.out.println("Книга: " + book1.getName() + ", Автор: " + book1.getAuthor().getFirstname() + " " + book1.getAuthor().getSurname() + ", Измененный год публикации: " + book1.getYear());
               }
}