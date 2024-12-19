class homeWork3 {
    public static void main(String[] args) {
        int a1 = 38500940;
        byte a2 = 120;
        short a3 = 31199;
        long a4 = 6_555_486_785_556L;
        float a5 = 4.28F;
        double a6 = 4.28282585009;

        int b1 = 569;
        byte b2 = 67;
        short b3 = 27897;
        long b4 = 987678965549L;
        float b5 = 27.12F;
        double b6 = 2.786;
        int b7 = -159;

        int studentLyudmilaPavlovna = 23;
        int studentAnnaSergeevna = 27;
        int studentEkaterinaAndreevna = 30;
        int purchasedSecurities = 480;
        int perStudent = purchasedSecurities / (23 + 27 + 30);
        System.out.println("На каждого ученика рассчитано " + perStudent + " листов бумаги");
        System.out.println();

        int machinePerformance2min = 16;
        int min1 = machinePerformance2min / 2;
        int min20 = min1 * 20;
        int day = min1 * (60 * 24);
        int day3 = day * 3;
        int month = day * 30;

        System.out.println("За 1 минуту машина произвела " + min1 + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        System.out.println("За 1 день машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + month + " штук бутылок");
        System.out.println();

        int totalPaints = 120;
        int whitePaintClass = 2;
        int brownPaintClass = 4;
        int totalClasses = totalPaints / (2 + 4);
        int whitePaintTotal = totalClasses * whitePaintClass;
        int brownPaintTotal = totalClasses * brownPaintClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");


        int bananas = 5;
        int milkMl = 200;
        int iceCream = 2;
        int rawEggs = 4;

        int bananas1 = 80;
        int milk100ml = 105;
        int iceCreamBriquettes = 100;
        int rawEggs1 = 70;

        int totalBananas = bananas * bananas1;
        int totalMilk = milk100ml * 2;
        int totalIceCreamBriquettes = iceCreamBriquettes * iceCream;
        int totalRawEggs = rawEggs * rawEggs1;
        int blenderGramm = totalBananas + totalMilk + totalIceCreamBriquettes + totalRawEggs;
        float blender = blenderGramm / 1000F;
        System.out.println(totalBananas + totalMilk + totalIceCreamBriquettes + totalRawEggs + " грамм в блендере.");
        System.out.println(blender + " килограмм в блендере.");
        System.out.println();


        double needToReset = 7;
        double weightLoss = 0.250;
        double weightLoss1 = 0.500;
        double weight = needToReset / weightLoss;
        double weight1 = needToReset / weightLoss1;
        System.out.println("Если терять в весе 250 грамм в день, то можно похудеть за " + weight + " дней. ");
        System.out.println("Если терять в весе 500 грамм в день, то можно похудеть за " + weight1 + " дней. ");
        System.out.println();


        float salaryMasha = 67760f;
        float salaryDenis = 83690f;
        float salaryKristina = 76230f;
        float salaryIncrease = 0.10f;
        float newSalaryMasha = salaryMasha * salaryIncrease;
        float newSalaryDenis = salaryDenis * salaryIncrease;
        float newSalaryKristina = salaryKristina * salaryIncrease;
        float increasedMasha = newSalaryMasha + salaryMasha;
        float increasedDenis = newSalaryDenis + salaryDenis;
        float increasedKristina = newSalaryKristina + salaryKristina;
        System.out.println("У Маши была такая " + salaryMasha + " зарплата. Ее повысили на " + newSalaryMasha + " руб. И теперь она получает " + increasedMasha + " руб. ");
        System.out.println("У Дениса была такая " + salaryDenis + " зарплата. Ее повысили на " + newSalaryDenis + " руб. И теперь она получает " + increasedDenis + " руб. ");
        System.out.println("У Кристины была такая " + salaryKristina + " зарплата. Ее повысили на " + newSalaryKristina + " руб. И теперь она получает " + increasedKristina + " руб. ");

    }
}