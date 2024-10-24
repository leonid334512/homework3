//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
    byte one = 100;
    short two = 1000;
    int three = 10000;
    long four = 100000;
    float five = 1.123f;
    double sex = 5.555555555;
        System.out.println("Значение переменной с типом байт равно " + one);
        System.out.println("Значение переменной с типом шорт равно " + two);
        System.out.println("Значение переменной с типом инт равно " + three);
        System.out.println("Значение переменной с типом лонг равно " + four);
        System.out.println("Значение переменной с типом флоат равно " + five);
        System.out.println("Значение переменной с типом дабл равно " + sex);

        System.out.println("Задача 2");

        byte one1 = 67;
        short two2 = -159;
        short three3 = 569;
        int four4 = 27897;
        long five5 = 987678965549L;
        float sex6 = 27.12F;
        double seven7 = 2.786;

        System.out.println(one1);
        System.out.println(two2);
        System.out.println(three3);
        System.out.println(four4);
        System.out.println(five5);
        System.out.println(sex6);
        System.out.println(seven7);

        System.out.println("Задача 3");

        int oneClass = 23;
        int twoClass = 27;
        int threeClass = 30;
        int totalStudents = oneClass + twoClass + threeClass;
        int sheetsOfPaper = 480;
        int sheetsOneStudents = sheetsOfPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsOneStudents + " листов бумаги");

        System.out.println("Задача 4");

        int bottles = 16;
        int minutes = 2;
        int bottlesOneMinutes = bottles / minutes;
        int bottlesTwentyMinutes = bottlesOneMinutes * 20;
        int bottlesOneDay = bottlesOneMinutes * 1440;
        int bottlesThreeDay = bottlesOneMinutes * 4320;
        int bottlesOneMonth = bottlesOneMinutes * 44640;
        System.out.println("За 20 минут машина произвела " + bottlesTwentyMinutes + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + bottlesOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesOneMonth + " штук бутылок");

        System.out.println("Задача 5");

        int cans = 120;
        int oneClassWhite = 2;
        int oneClassBrown = 4;
        int oneClas = oneClassWhite + oneClassBrown;
        int clas = cans / oneClas;
        int white = clas * oneClassWhite;
        int brown = clas * oneClassBrown;
        System.out.println("В школе где " + clas + " классов, нужно " + white + " банок белой краски и " + brown +" банок коричневой краски");

        System.out.println("Задача 6");

        int bananas = 5;
        int weightOneBanana = 80;
        int milkMillilitrs = 200;
        int portionsMilk = milkMillilitrs / 100;
        int weightMilkOneHundredMilliliters = 105;
        int plombir = 2;
        int weightPlombir = 100;
        int egg = 4;
        int weightOneEgg = 70;
        int weightBananas = bananas * weightOneBanana;
        int weightMilk = portionsMilk * weightMilkOneHundredMilliliters;
        int weightPlombirs = plombir * weightPlombir;
        int weightEgg = egg * weightOneEgg;
        int weightGram = weightBananas + weightMilk + weightPlombirs + weightEgg;
        System.out.println("Вес такого спортзавтрака " +weightGram + " грамм");
        float weightkillograms = weightGram / 1000f;
        System.out.println("Вес такого спортзавтрака " + weightkillograms + " килограмм");

        System.out.println("Задача 7");

        int weightsKg = 7;
        int weightsGm = weightsKg * 1000;
        int weightsOneDay = 250;
        int weightsTwoDay = 500;
        int oneDayWeight = weightsGm / weightsOneDay;
        int twoDayWeight = weightsGm / weightsTwoDay;
        System.out.println("В первом случае спортсмену понадобится " + oneDayWeight + " дней");
        System.out.println("Во втором случае спортсмену понадобится " + twoDayWeight + " дней");
        int daysAverage = (oneDayWeight + twoDayWeight) / 2;
        System.out.println("В среднем спортмену понадобиться " + daysAverage + " день");

        System.out.println("Задача 8");

        int masha = 67760;
        int denis = 83690;
        int krestina = 76230;
        int newMasha = (int) (masha + (masha * 0.1));
        int newDenis = (int) (denis + (denis * 0.1));
        int newKristina = (int) (krestina + (krestina * 0.1));
        int annualMasha = masha * 12;
        int annualDenis = denis * 12;
        int annualKristina = krestina * 12;
        int annualNewMasha = newMasha * 12;
        int annualNewDenis = newDenis * 12;
        int annualNewKristina = newKristina * 12;
        int differenceMasha = annualNewMasha - annualMasha;
        int differenceDenis = annualNewDenis - annualDenis;
        int differenceKristina = annualNewKristina - annualKristina;
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Крестина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");


























    }

}