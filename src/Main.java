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
    public static int phoneAndYear (int clientPhone, int currentYear){
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
    public static int deliveryDistance(int deliveryDistance){
        if (deliveryDistance <= 20){
            System.out.println("Для того чтобы доставить карту потребуется 1 сутки");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Для того чтобы доставить карту потребуется 2 суток");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Для того чтобы доставить карту потребуется 3 суток");
        }
        else {
            System.out.println("Свыше 100 км от офиса банка доставка невозможна");
        }
        return deliveryDistance;
    }

    public static void main(String[] args) {

        leapYear(2024);

        // Задача 2
        phoneAndYear(0, 2017);

        // Задача 3
        deliveryDistance(110);



    }
}