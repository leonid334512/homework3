
public class Main {
    public static void main(String[] args) {
        byte a = 5;
        short b = 10;
        int c = 100;
        long d = 1000L;
        float i = 2.5f;
        double g = 5.78456781;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(g);

        byte p = 67;
        short o = -159;
        short u = 569;
        int y = 27897;
        long t = 987678965549L;
        float m = 2.786f;
        double n = 27.12;
        System.out.println(p);
        System.out.println(o);
        System.out.println(u);
        System.out.println(y);
        System.out.println(t);
        System.out.println(m);
        System.out.println(n);

        byte firstClass = 23;
        byte secondGrade = 27;
        byte thirdGrade = 30;
        short sheets = 480;
        int tatalStudents = firstClass + secondGrade + thirdGrade;
        System.out.println(tatalStudents);
        int sheetsForEach = sheets / tatalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsForEach + " листов бумаги");

        byte bottles = 16;
        byte time = 2;
        int bottlesTime1 = bottles / time;
        byte time1 = 20;
        byte inMonthOfDay = 31;
        byte hoursInDay = 24;
        byte minutesInHour = 60;
        int time2 = hoursInDay * minutesInHour;
        int time3 = (hoursInDay * 3) * minutesInHour;
        int time4 = (inMonthOfDay * hoursInDay) * minutesInHour;
        int timeOne = bottlesTime1 * time1;
        int timeTwo = bottlesTime1 * time2;
        int timeThree = bottlesTime1 * time3;
        int timeFour = bottlesTime1 * time4;
        System.out.println("За 1 минуту машина произвела " + bottlesTime1 + " бутылок");
        System.out.println("За 20 минут машина произвела " + timeOne + " бутылок");
        System.out.println("За сутки машина произвела " + timeTwo + " бутылок");
        System.out.println("За трое суток машина произвела " + timeThree + " бутылок");
        System.out.println("За месяц машина произвела " + timeFour + " бутылок");

        byte cansPurchased = 120;
        byte white = 2;
        byte brown = 4;
        int oneClass = white + brown;
        int totalClasses = cansPurchased / oneClass;
        int totalWhite = totalClasses * white;
        int totalBrown = totalClasses * brown;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        byte bananas = 5;
        byte bananaWeight = 80;
        int weightOfBananas = bananas * bananaWeight;
        byte servingsOfMilk = 2;
        byte theWeightOneHundredMilliliters = 105;
        int totalMilkWeight = theWeightOneHundredMilliliters * servingsOfMilk;
        byte plombir = 2;
        byte weightOfOnePlombir = 100;
        int weightOfPlombir = plombir * weightOfOnePlombir;
        byte egg = 4;
        byte weightOneEgg = 70;
        int weightEgg = egg * weightOneEgg;
        long totalPondusProducts = weightOfBananas + totalMilkWeight + weightOfPlombir + weightEgg;
        System.out.println("вес продуктов " + totalPondusProducts + " грамм");
        float pondusKg = ( float) totalPondusProducts / 1000;
        System.out.println("Вес продуктов " + pondusKg + " в кг");

        byte pondas = 7;
        short oneDieta = 250;
        short twoDieta = 500;
        int pondusGram = pondas * 1000;
        int oneOptio = pondusGram / oneDieta;
        int twoOptio = pondusGram / twoDieta;
        System.out.println("в первом рационе понадобиться " + oneOptio + " дней");
        System.out.println("во втором рационе понадобиться " + twoOptio + " дней");
        int inMedio = (oneOptio + twoOptio) / 2;
        System.out.println("в среднем понадобиться " + inMedio + " день");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        long tenPercentMasha = (long) (masha * 0.10);
        long tenPercentDenis = (long) (denis * 0.10);
        long tenPercentKristina = (long) (kristina * 0.10);
        long newCashMasha =  masha + tenPercentMasha;
        long newCashDenis = denis + tenPercentDenis;
        long newCashKristina = kristina + tenPercentKristina;
        long cashYearMasha = masha * 12;
        long cashYearDenis = denis * 12;
        long cashYearKristina = kristina * 12;
        long newCashYearMasha =  newCashMasha * 12;
        long newCashYearDenis = newCashDenis * 12;
        long newCashYearKristina = newCashKristina * 12;
        long differenceMasha = newCashYearMasha - cashYearMasha;
        long differenceDenis = newCashYearDenis - cashYearDenis;
        long differenceKristina = newCashYearKristina - cashYearKristina;
        System.out.println("Маша теперь получает " + newCashMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newCashDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Крестина теперь получает " + newCashKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");
















    }
}

