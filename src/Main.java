import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void ChangeValue1(int value1) {
        value1 = 33;
        System.out.println("value = " + value1);
    }
    public static void ChangeValue2(Integer value2) {
        value2 = 33;
        System.out.println("value = " + value2);
    }
    public static void changeValue3(Integer[] value3) {
        value3 = new Integer[]{1, 2};
    }
    public static void changeValue4(Integer[] value4) {
        value4 = new Integer[]{1, 2};
        value4[0] = 99;
    }
    public static void changePerson(Person person){
      //  person = new Person("Ilya", "Lagutenko"); //задача 5
     person.setName("Ilya"); // Задача 6
     person.setSurname("Lagutenko"); // Задача 6
        }

    public static void main (String[] args) {
        //Задача 1 (5)
        int value1 = 22;
            System.out.println(value1);
            ChangeValue1(value1);

        //Задача 2 (6)
        Integer value2 = 22;
            System.out.println(value2);
            ChangeValue1(value2);

        //Задача 3 (7)
        Integer[] value3 = new Integer[]{3, 4};
        changeValue3(value3);
        System.out.println(value3[0] + ", " + value3[1]);

        //Задача 4 (8)
        Integer[] value4 = new Integer[]{3, 4};
        changeValue4(value4);
        System.out.println(value4[0] + ", " + value4[1]);

        //Задача 5 - 6 (9-10)
        Person person = new Person("Ilya", "Trubetskoy");
        System.out.println(person);
        changePerson(person);
        System.out.println(person);

    }


    }
