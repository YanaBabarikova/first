public class Main {
    public static void main(String[] args) {

        //Задача 1
        int score = 18;
        if (score <= 18) {
            System.out.println("Вы совершеннолетний!");
        } else {
            System.out.println("Возвраст совершеннолетия ещё не достигнут, нужно подождать!");
        }

        //Задача 2
        int temperature = 3;
        if (temperature <= 5) {
            System.out.println("На улице" + temperature + "  надеть шапку!");
        } else {
            System.out.println("Сегодня" + temperature + " можно идти без шапки!");
        }

        //Задача 3
        int speed = 49;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        //Задача 4
        int ageForActivity = 12;
        if (ageForActivity < 2) {
            System.out.println("В таком возврасте ещё никуда не ходят");
        } else if (ageForActivity >= 2 && ageForActivity <= 6) {
            System.out.println("В " + ageForActivity + " ходят в детский сад");
        } else if (ageForActivity >= 7 && ageForActivity <= 17) {
            System.out.println("В " + ageForActivity + " ходят в школу");
        } else if (ageForActivity >= 18 && ageForActivity <= 24) {
            System.out.println("В " + ageForActivity + " ходят в университет");
        } else {
            System.out.println("В " + ageForActivity + " пора ходить на работу");
        }

        //Задача 5
        int ageForAttractions = 3;
        if (ageForAttractions < 5) {
            System.out.println("Если возвраст ребенка равен " + ageForAttractions + ", то ему нельзя кататься на аттракционе");
        } else if (ageForActivity > 5 && ageForActivity < 14) {
            System.out.println("Если возвраст ребенка равен " + ageForAttractions + ", то ему можно кататься на аттракционе в сопровождении возрослого");
        } else {
            System.out.println("Если возвраст ребенка равен " + ageForAttractions + ", то ему можно кататься на аттракционе без сопровождения возрослого");
        }

        //Задача 6
        int placeInTheCarriage = 102;
        if (placeInTheCarriage > 60 && placeInTheCarriage <= 102) {
            System.out.println("В вагоне остались только стоячие места");
        } else if (placeInTheCarriage <= 60) {
            System.out.println("В вагоне остались стоячие и сидячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }

        //Задача 7
        int one = 20;
        int two = 2;
        int three = 100;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше всех");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше всех");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " больше всех");
        } else {
            System.out.println("Числа равны");
        }
    }
}