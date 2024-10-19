import java.util.Objects;

public class Author {
   private String firstname;
   private String surname;

   public Author (String firstname, String surname){
       this.firstname = firstname;
       this.surname = surname;
   }

   public String getFirstname(){
       return this.firstname;
   }

   public String getSurname(){
       return this.surname;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstname, author.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firstname);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
