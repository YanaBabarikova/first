import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static int leapYear(int year ){
        // Задача 1
        if (year%4 == 0){
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не високосный");
        }
        return year;
    }
    public static int phoneAndYear (int clientPhone){
        int currentYear = LocalDate.now().getYear();
        if (clientPhone == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientPhone == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientPhone == 1 && currentYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        return clientPhone;
    }

    public static void main(String[] args) {

        leapYear(2024);

        // Задача 2
        phoneAndYear(0);

        // Задача 3




    }
}