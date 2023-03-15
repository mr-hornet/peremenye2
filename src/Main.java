public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 10;
        byte b = 15;
        short c = 20;
        long d = 25L;
        float g = 1.5F;
        double h = 2.5;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной g с типом float равно " + g);
        System.out.println("Значение переменной h с типом double равно " + h);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        double value1 = 27.12;
        long value2 = 987_678_965_549L;
        float value3 = 2.786f;
        short value4 = 569;
        short value5 = -159;
        int value6 = 27897;
        byte value7 = 67;
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int lp = 23;
        int as = 27;
        int ea = 30;
        int totalStudent = lp + as + ea;
        int sheets = 480;
        System.out.println("На каждого ученика рассчитано " + (sheets / totalStudent) + " листов бумаги");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int machine = 16 / 2;
        int value1 = 20;
        int value2 = 24 * 60;
        int value3 = value2 * 3;
        int value4 = value2 * 30;

        System.out.println("За 20 минут машина произвела " + (machine * value1) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (machine * value2) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (machine * value3) + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + (machine * value4) + " штук бутылок");
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 120;
        int white = 2;
        int brown = 4;
        int rooms = total / (white + brown);
        int totalWhite = rooms * white;
        int totalBrown = rooms * brown;
        System.out.println("В школе, где " + rooms + " классов, нужно "
                + totalWhite + " банок белой краски и "
                + totalBrown + " банок коричневой краски");
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        int banana = 80;
        int totalBananas = 5;
        int totalWeightBananas = banana * totalBananas;
        double mlMilk = 105.0 / 100.0;
        int totalMilk = 200;
        int totalWeightMilk = (int) (mlMilk * totalMilk);
        int iceCreme = 2;
        int iceCremeWeight = 100;
        int totalIceCremeWeight = iceCreme * iceCremeWeight;
        int eggs = 4;
        int eggWeight = 70;
        int totalEggsWeight = eggs * eggWeight;
        double totalWeight = (totalEggsWeight + totalWeightMilk + totalIceCremeWeight + totalWeightBananas) / 1000.0;
        System.out.println(totalWeight);
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7");
        int dayMin = 250;
        int dayMax = 500;
        int weightNeed = 7 * 1000;
        System.out.println("Если худеть по " + dayMin + " грамм в день, то понадобится "
                + (weightNeed / dayMin) + " дней.");
        System.out.println("Если худеть по " + dayMax + " грамм в день, то понадобится "
                + (weightNeed / dayMax) + " дней.");
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int mashaMonthBefore = 67760;
        int denisMonthBefore = 83690;
        int kristinaMonthBefore = 76230;

        int mashaYearBefore = mashaMonthBefore * 12;
        int denisYearBefore = denisMonthBefore * 12;
        int kristinaYearBefore =  kristinaMonthBefore * 12;

        double mashaMonthAfter = mashaMonthBefore + (mashaMonthBefore * 0.1);
        double denisMonthAfter = denisMonthBefore + (denisMonthBefore * 0.1);
        double kristinaMonthAfter = kristinaMonthBefore + (kristinaMonthBefore * 0.1);;

        double mashaYearAfter = mashaMonthAfter * 12;
        double denisYearAfter = denisMonthAfter * 12;
        double kristinaYearAfter = kristinaMonthAfter * 12;
        System.out.println("Маша теперь получает "
                + mashaMonthAfter + " рублей в месяц. Годовой доход вырос на "
                + (mashaYearAfter - mashaYearBefore) + " рублей");
        System.out.println("Денис теперь получает "
                + denisMonthAfter + " рублей в месяц. Годовой доход вырос на "
                + (denisYearAfter - denisYearBefore) + " рублей");
        System.out.println("Кристина теперь получает "
                + kristinaMonthAfter + " рублей в месяц. Годовой доход вырос на "
                + (kristinaYearAfter - kristinaYearBefore) + " рублей");
        System.out.println();
    }
}
