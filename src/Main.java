import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1
      String firstName = "Ivan ";
      String middleName = "Ivanovich ";
      String lastName = "Ivanov ";
      String fullName = lastName + firstName + middleName;
      System.out.println(fullName);

      //Задача 2
        String capitalLettersFullName = fullName.toUpperCase();
        System.out.println( "Данные Ф.И. О. сотрудника для заполнения отчёта - " + capitalLettersFullName);

        //Задача 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);

    }
}