public class Main {
    public static void main(String[] args) {

        // Задача 1
        int points = 10;
        do {
            System.out.println("Осталось" + points + " баллов");
            points--;
        } while (points >= 0);
        System.out.println("Игра окончена");

        int savings = 15_000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + savings;
            System.out.println("Месяц " + i++ + " сумма накоплений равна " + total + "рублей");
        }

        // Задача 2
        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Задача 3
        int initialPopulation = 12000000; // Население 12 миллионов
        double birthRate = 17.0 / 1000;  // Рождаемость на 1000
        double deathRate = 8.0 / 1000;   // Смертность на 1000

        // Расчет численности населения каждый год
        for (int year = 1; year <= 10; year++) {
            // Вычисление прироста населения
            int average = (int) ((initialPopulation * birthRate) - (initialPopulation * deathRate));
            initialPopulation = average + initialPopulation;// Обновляем численность населения

            // Вывод результата для текущего года
            System.out.println("Год " + year + ", численность населения составляет " + initialPopulation);
        }

        //Задача 4-5
        int money = 15_000;
        int totaln = 0;
        int h = 0;
        for (; totaln < 12_000_000; h++) {
            totaln = (int) (totaln + (totaln * 0.07));
            totaln = totaln + money;
            if (h % 6 == 0) {
                System.out.println("Месяц " + h + " сумма накоплений равна " + totaln + " рублей");
            }
        }
        System.out.println(totaln);

        //Задача 6
        int contribution = 15_000;
        int totaly = 0;
        int t = 0;
        for (; t <= 108; t++) {
            totaly = (int) (totaly + (totaly * 0.07));
            totaly = totaly + contribution;
            if (t % 6 == 0) {
                System.out.println("Месяц " + t + " сумма накоплений равна " + totaly + " рублей");
            }
        }
        System.out.println(totaly);

        //Задача 7
        int friday = 4;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня " + friday + "-е число пятница нужно приготовить отчёт");
        }
        //Задача 8
        int year = 2024;
        int yearStarted = year - 200;
        int yearStoped = year + 100;
        do {  yearStarted = yearStarted + 1;
            if (yearStarted % 79 == 0) {
            System.out.println(yearStarted);}
           }
        while (yearStarted <yearStoped);
         }
}