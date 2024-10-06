public class Main {
    public static void main(String[] args) {

        //Задача 1
        int clientOS = 0;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Не удалось инициализировать тип Вашего устройства");
        }

        //Задача 2
        int yearPhone = 2017;
        int clientPhone = 0;
        if (clientPhone == 0 && yearPhone < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientPhone == 1 && yearPhone < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientPhone == 1 && yearPhone > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задача 3
        int year = 2018;
        int remainder = year % 4;
        if (remainder > 0 && year > 1584) {
            System.out.println(year + " год - не високосный");
        }
        else if (remainder==0 && year > 1584) {
            System.out.println(year + " год - високодский");
        }
        else {System.out.println("Високосный год ввели после 1584 года");
        }

        //Задача 4
        int deliveryDistance = 100;
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

        //Задача 5
        int monthNumber = 7;
        switch (monthNumber){
            case 1:
            case 2:
            case 12: {
                System.out.println("Это зима");
            }
            break;
            case 3:
            case 4:
            case 5:{
                System.out.println("Это весна");
            }
            break;
            case 6:
            case 7:
            case 8: {
                System.out.println("Это лето");
            }
            break;
            case 9:
            case 10:
            case 11: {
                System.out.println("Это осень");
            }
            break;
            default: {
                System.out.println("Введите номер месяца корректно");
            }
        }
    }
}
