import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1-2

        // Целочисленный массив
        int[] weight1 = new int[3];
        weight1[0] = 1;
        weight1[1] = 2;
        weight1[2] = 3;
        System.out.println(Arrays.toString(weight1));

        for (int i = weight1.length; i >= 1; i--) {
            if (i > 1) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println();

        for (int i = 1; i < (weight1.length + 1); i++) {
            if (i % 2 == 0) {
                System.out.print(i + "; ");
            } else {
                System.out.print(i + 1 + "; ");
            }
        }
            System.out.println();

            // Массив с дробными числами
            double[] weight2 = new double[3];
            weight2[0] = 1.57;
            weight2[1] = 7.654;
            weight2[2] = 9.986;
            System.out.println(Arrays.toString(weight2));

            for (int h = weight2.length; h >= 1; h--) {
                if (h > 1) {
                    System.out.print(h + ", ");
                } else {
                    System.out.print(h);
                }
            }

            System.out.println();
            // Произвольный массив
            int[] weight3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(Arrays.toString(weight3));

            for (int k = weight3.length; k >= 1; k--) {

                if (k > 1) {
                    System.out.print(k + ", ");
                } else {
                    System.out.print(k);
                }
            }


        }
    }