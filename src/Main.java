public class Main {
    public static void main(String[] args) {

       //Задача 1
        int a1 = 10000;
        System.out.println(a1);

        byte b1 = 5;
        System.out.println(b1);

        short c1 = 100;
        System.out.println(c1);

        long d1 = 100L;
        System.out.println(d1);

        float e1 = 45.78f;
        System.out.println(e1);

        double f1 = 68.42;
        System.out.println(f1);

        //Задача 2
        long a2 = 987678965549L;
        System.out.println(a2);

        float b2 = 27.12f;
        System.out.println(b2);

        byte c2 = 67;
        System.out.println(c2);

        double d2 = 2.786;
        System.out.println(d2);

        short e2 = 569;
        System.out.println(e2);

        short f2 = -159;
        System.out.println(f2);

        int g2 = 27897;
        System.out.println(g2);

        //Задача 3
        byte classLudmilaPavlovna = 23;
        byte classAnnaSergeevna = 27;
        byte classEkaterinaAndreevna = 30;

        short paper = 480;

        short allClass = (byte) (classEkaterinaAndreevna + classAnnaSergeevna + classLudmilaPavlovna);

        short onePeoplepaper = (short) (paper / allClass);
        System.out.println("Одному учинеку доставнется " + onePeoplepaper + " листов бумаги");

        //Задача 4
        byte inTwoMinutes = 16;
        byte inTwentyMinutes = (byte) (inTwoMinutes * 10);
        System.out.println("За 20 минут машина производит " + inTwoMinutes + " бутылок");

        short minutesAtOneDay = 1440;
        short twoMinutesAtOneDay = (short) (minutesAtOneDay / 2);
        short inOneDay = (short) ( twoMinutesAtOneDay * inTwoMinutes);
        System.out.println("За один день машина производит " + inOneDay + " бутылок");

        int inThreeDay = inOneDay * 3 ;
        System.out.println("За 3 дня машина производит: " + inThreeDay + " бутылок");

        byte dayInMounse = 30;
        int inOneMonth = inOneDay * dayInMounse;
        System.out.println("За месяц, в котором " + dayInMounse + " дней машина производит " + inOneMonth + " бутылок");

        // Задача 5
        byte cansOfPaint = 120;
        byte waiteAtOneClass = 2;
        byte brownAtOneClass = 4;
        byte сlassrooms = (byte) (cansOfPaint /(waiteAtOneClass+brownAtOneClass));
        System.out.println("Всего в школе " + сlassrooms + " кабинетов");

        byte waiteAtSchool = (byte) (waiteAtOneClass * сlassrooms);
        System.out.println("Нужно " + waiteAtSchool + " банок белой краски на все кабинеты");

        byte brownAtSchool = (byte) (brownAtOneClass * сlassrooms);
        System.out.println("Нужно " + brownAtOneClass + " банок коричневой краски на все кабинеты");

        System.out.println("В школе, где " + сlassrooms +" классов, нужно " + waiteAtSchool + " банок белой краски и " + brownAtSchool + " банок коричневой краски" );

        // Задача 6
        byte banana = 5;
        byte bananaWeight = 80;
        byte milk = 2; // 200 мл
        byte milkWeight = 105;
        byte icecream = 2;
        byte icecreamWeight = 100;
        byte eggs = 4;
        byte eggsWeight = 70;

        int breakfastInGrams = (banana * bananaWeight) + (milk * milkWeight) + (icecream * icecreamWeight) + (eggs * eggsWeight);
        System.out.println("Вес завтрака составляет "+ breakfastInGrams + " грамм");

        double kilogramToGram = 0.001;
        double breakfastInKilograms = breakfastInGrams * kilogramToGram;
        System.out.println("Вес завтрака составляет " + breakfastInKilograms + " килограмм");

        // Задача 7
       int slimmingWeight = 7000;
       int lossWeight1 = 250;
       int lossWeight2 = 500;

       byte option1 = (byte) (slimmingWeight / lossWeight1);
       System.out.println("При похудении на " + lossWeight1 + " грамм в день потребуется " + option1 + " дней");
       byte option2 = (byte) (slimmingWeight / lossWeight2);
       System.out.println("При похудении на " + lossWeight2 + " грамм в день потребуется " + option2 + " дней");

       byte average = (byte) ((option1 + option2) / 2);
       System.out.println("В среднем на похудение потребуется " + average + " дней");

       // Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double percent = 1.1;

        int promotionMasha = (int) (salaryMasha * percent);
        int differenceMashaInYear = (promotionMasha - salaryMasha) * 12;
        System.out.println("Зарплата Маши после повышения на 10% " + promotionMasha + " рублей. Годовой доход вырос на " + differenceMashaInYear);

        int promotionDenis = (int) (salaryDenis * percent);
        int differenceDenisInYear = (promotionDenis - salaryDenis) * 12;
        System.out.println("Зарплата Дениса после повышения на 10% " + promotionDenis + " рублей. Годовой доход вырос на " + differenceDenisInYear);

        int promotionKristina = (int) (salaryKristina * percent);
        int differenceKristinaInYear = (promotionKristina - salaryKristina) * 12;
        System.out.println("Зарплата Кристины после повышения на 10% " + promotionKristina + " рублей. Годовой доход вырос на " + differenceKristinaInYear);
    }
}