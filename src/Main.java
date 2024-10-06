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
        double birthRate = 17.0 / 1000.0;  // Рождаемость на 1000
        double deathRate = 8.0 / 1000.0;   // Смертность на 1000

        // Расчет численности населения каждый год
        for (int year = 1; year <= 10; year++) {
            // Вычисление прироста населения
            int births = (int) (initialPopulation * birthRate);
            int deaths = (int) (initialPopulation * deathRate);
            initialPopulation += (births - deaths); // Обновляем численность населения

            // Вывод результата для текущего года
            System.out.println("Год " + year + ", численность населения составляет " + initialPopulation);
        }

        //Задача 4

    }
    }

