import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    // Задача 1

    public static void task1() {
        int[] arr = generateRandomArray();
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + total + " рублей");


        // Задача 2

        int maxArr = 99_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }
        System.out.println("Максимальная сумма составила " + maxArr + " рублей");

        int minArr = 201_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
        System.out.println("Минимальная сумма составиа " + minArr + " рублей");

        // Задача 3
        double averageArr = (double) total / (arr.length);
        System.out.println("Средняя сумма трат за месяц составила " + averageArr + " рублей");

        // Задача 4
                char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                int left = 0;
                int right = reverseFullName.length - 1;

                while (left < right) {
                    char temp = reverseFullName[left];
                    reverseFullName[left] = reverseFullName[right];
                    reverseFullName[right] = temp;
                    left++;
                    right--;
                }
                System.out.println(new String(reverseFullName));

    }
}