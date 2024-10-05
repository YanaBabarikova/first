public class Main {

        // Задача 1:
    public static void main(String[] args){
       var dog = 8.0;
       var cat = 3.6;
       var paper = 763789;

       System.out.println("dog: " + dog + " cat: " + cat + " paper: " + paper);

        // Задача 2:
       dog = dog * 4;
       cat = cat * 4;
       paper = paper * 4;

       System.out.println("Четыре собаки: " + dog + " Четыре кошки: " + cat + " Четыре бумаги: " + paper);

        // Задача 3:
        dog = dog / 3.5;
        cat = cat / 1.6;
        paper = paper / 7639;

        System.out.println("Собак теперь: " + dog + " Кошек теперь: " + cat + " Бумаги теперь: " + paper);

        // Задача 4:
        var friend = 19;
        System.out.println(friend);

        friend = friend * 2;
       System.out.println(friend);

        friend = friend / 7;
       System.out.println(friend);

       // Задача 5:
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        // Задача 6:
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        var boxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес: " + boxersWeight);

        var differenceWeight = (secondBoxerWeight + firstBoxerWeight) % firstBoxerWeight;
        System.out.println("Разница в весе: " + differenceWeight);

        // Задача 7

        differenceWeight = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница в весе полученная вычетанием: " + differenceWeight);

        // Задача 8
        var totalTime = 640;
        var workingHours = 8;

        var worker = totalTime / workingHours;
        System.out.println("Всего работников в компании: " + worker + " человек");

        worker = worker + 94;
        workingHours = worker * workingHours;
        System.out.println("Если в компании работает " + worker + " человека, то всего " + workingHours + " часов работы может быть поделено между сотрудниками.");
}}