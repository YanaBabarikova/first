public class Main {

    public static void main(String[] args){
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        var stuffWaight = 20;
        var сapacityLeft = liftingCapacity - stuffWaight;

        System.out.println("Ещё можно положить " + сapacityLeft + " кг вещей");
        var appleWaeight = 2;
        var orangeWaeight = 3;
        var frutWaeight = appleWaeight + orangeWaeight;
        System.out.println("Общий вес фруктов: " + frutWaeight +" кг");

        var meatWaeight = 4;
        var waterWeeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var peppersWeight = 2;
        var zucchineWeight = 2;
        var vegetableWeight =  tomatoesWeight + cucumberWeight + peppersWeight +zucchineWeight;
        var productsWeight = vegetableWeight+ frutWaeight + meatWaeight + waterWeeight;
        System.out.println("Общий вес продуктов: " + productsWeight + " кг");

        var leftWeight = liftingCapacity - stuffWaight - productsWeight;
        System.out.println("Места осталось: " + leftWeight + " кг");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов: " + productsWeight + " кг");

        leftWeight = liftingCapacity - stuffWaight - productsWeight;
        System.out.println("Теперь места осталось: " + leftWeight + " кг");

        var overLoad = ( stuffWaight + productsWeight ) % liftingCapacity;
        System.out.println("Перегруз на " + overLoad + " кг");

        var productsInOneCar = productsWeight / 2;
        System.out.println("В одну машину влезает " + productsInOneCar + " кг");
}}