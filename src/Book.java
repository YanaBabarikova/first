import java.time.Year;

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

}
