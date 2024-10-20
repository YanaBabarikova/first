import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Hogwarts [] hogwarts = {
                new Hogwarts ("Harry", "Potter",90, 7),
                new Hogwarts("Hermione", "Granger", 85, 9),
                new Hogwarts("Ron", "Weasley",70, 8),
                new Hogwarts("Zachariah", "Smith", 80, 7),
                new Hogwarts("Cedric", "Diggory", 87, 9),
                new Hogwarts("Justin", "Finch-Fletchley", 71, 8),
                new Hogwarts("Zhou", "Chang", 65, 7),
                new Hogwarts("Padma", "Patil", 67, 9),
                new Hogwarts("Marcus", "Belby", 61, 8),
                new Hogwarts("Gregory", "Goyle", 65, 7),
                new Hogwarts("Graham", "Montague", 67, 9),
                new Hogwarts("Draco", "Malfoy", 70, 8)};
        System.out.println("Размер списка " + hogwarts.length);
        int i;
        for (i = 0; i < hogwarts.length; i++) {
            Hogwarts hogwart = hogwarts[i];
            System.out.println(hogwart);
        }

        Gryffindor[] gryffindors = {
                new Gryffindor("Harry", "Potter", 90, 7, 9, 9, 9),
                new Gryffindor("Hermione", "Granger", 85, 9, 9, 9, 9),
                new Gryffindor("Ron", "Weasley", 70, 8, 8, 7, 8)};
        System.out.println("Размер списка " + gryffindors.length);
            for (i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindor);

        }

       Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah", "Smith", 80, 7, 9, 9, 9),
                new Hufflepuff("Cedric", "Diggory", 87, 9, 9, 9, 9),
                new Hufflepuff("Justin", "Finch-Fletchley", 71, 8, 8, 7, 8)};
        System.out.println("Размер списка " + hufflepuffs.length);
        for (i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuff);
        }

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou", "Chang", 65, 7, 9, 9, 9),
                new Ravenclaw("Padma", "Patil", 67, 9, 9, 9, 9),
                new Ravenclaw("Marcus", "Belby", 61, 8, 8, 7, 8)};
        System.out.println("Размер списка " + ravenclaws.length);
        for (i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaw);
        }

        Slytherin[] slytherins = {
                new Slytherin("Gregory", "Goyle", 65, 7, 9, 9, 9, 7, 6),
                new Slytherin("Graham", "Montague", 67, 9, 9, 9, 9, 6, 5),
                new Slytherin("Draco", "Malfoy", 70, 8, 8, 7, 8, 8, 8)};
        System.out.println("Размер списка " + ravenclaws.length);
        for (i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherin);
        }
        hogwarts[3].showInfo();
        slytherins[1].showInfo();
        gryffindors[2].showInfo();
        slytherins[0].showInfo();

        Gryffindor.compareStudents(gryffindors[0], gryffindors[1]);
        Hufflepuff.compareStudents(hufflepuffs[0], hufflepuffs[1]);
        Ravenclaw.compareStudents(ravenclaws[0], ravenclaws[1]);
        Slytherin.compareStudents(slytherins[0], slytherins[1]);
        Hogwarts.compareStudents(hogwarts[4], hogwarts[5]);

    }



    }
