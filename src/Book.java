import java.time.Year;
import java.util.Objects;

public class Book {
  private String name;
  private int year;
  private Author author;

public Book(String name, int year, Author author){
    this.name = name;
    this.year = year;
    this.author = author;
}

public String getName(){
    return this.name;
}

public Author getAuthor(){
    return this.author;
}
public int getYear(){
    return this.year;
}

public int setYear(int year){
this.year = year;
return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
    }
}
