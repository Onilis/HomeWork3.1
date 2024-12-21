class homeWork3 {
    public static void main(String[] args) {
        byte myByte = 127;
        short myShort = 32167;
        int myInt = 140700;
        long myLong = 6500486785556L;
        float myFloat = 4.28F;
        double myDouble = 4.28282585009;
        System.out.println("Значение переменной myByte: " + myByte);
        System.out.println("Значение переменной myShort: " + myShort);
        System.out.println("Значение переменной myInt: " + myInt);
        System.out.println("Значение переменной myLong: " + myLong);
        System.out.println("Значение переменной myFloat: " + myFloat);
        System.out.println("Значение переменной myDouble: " + myDouble);
        System.out.println();


        float byFloat = 27.12F;
        long byLong = 987678965549L;
        double byDoble = 2.786;
        int byInt = 569;
        int byInt1 = 27897;
        short byShort = -159;
        byte byByte = 67;


        int studentsLudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;

        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        int totalNotebooks = 480;

        int notebooksPerStudent = totalNotebooks / totalStudents;

        int notebooksLudmila = studentsLudmila * notebooksPerStudent;
        int notebooksAnna = studentsAnna * notebooksPerStudent;
        int notebooksEkaterina = studentsEkaterina * notebooksPerStudent;

        System.out.println("Тетради для Людмилы Павловны: " + notebooksLudmila);
        System.out.println("Тетради для Анны Сергеевны: " + notebooksAnna);
        System.out.println("Тетради для Екатерины Андреевны: " + notebooksEkaterina);
        System.out.println();


        int bottlesPer2Minutes = 16;
        int minutesInHour = 60;
        int hoursInDay = 8;
        int daysInMonth = 30;

        double bottlesPerMinute = (double) bottlesPer2Minutes / 2;

        int bottlesIn30Minutes = (int) (bottlesPerMinute * 20);
        System.out.println("Количество бутылок за 20 минут: " + bottlesIn30Minutes);

        int bottlesIn1Day = (int) (bottlesPerMinute * hoursInDay * minutesInHour);
        System.out.println("Количество бутылок за 1 день: " + bottlesIn1Day);

        int bottlesIn3Days = bottlesIn1Day * 3;
        System.out.println("Количество бутылок за 3 дня: " + bottlesIn3Days);

        int totalMinutesInMonth = hoursInDay * minutesInHour * daysInMonth;
        int bottlesInMonth = (int) (bottlesPerMinute * totalMinutesInMonth);
        System.out.println("Количество бутылок за 1 месяц: " + bottlesInMonth);
        System.out.println();

        int totalPaints = 120;
        int whitePaintClass = 2;
        int brownPaintClass = 4;
        int totalClasses = totalPaints / (2 + 4);
        int whitePaintTotal = totalClasses * whitePaintClass;
        int brownPaintTotal = totalClasses * brownPaintClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");
        System.out.println();


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
        System.out.println(" Всего  " + blenderGramm + " грамм в блендере.");
        System.out.println(" Всего  " + blender + " килограмм в блендере.");
        System.out.println();


        double needToReset = 7;
        double weightLoss = 0.250;
        double weightLoss1 = 0.500;
        double weight = needToReset / weightLoss;
        double weight1 = needToReset / weightLoss1;
        System.out.println("Если терять в весе 250 грамм в день, то можно похудеть за " + weight + " дней. ");
        System.out.println("Если терять в весе 500 грамм в день, то можно похудеть за " + weight1 + " дней. ");
        System.out.println();


        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float salaryIncrease = 0.10f;
        double newSalaryMasha = salaryMasha * salaryIncrease;
        double newSalaryDenis = salaryDenis * salaryIncrease;
        double newSalaryKristina = salaryKristina * salaryIncrease;
        double increasedMasha = newSalaryMasha + salaryMasha;
        double increasedDenis = newSalaryDenis + salaryDenis;
        double increasedKristina = newSalaryKristina + salaryKristina;
        int сurrentSalary = salaryMasha + salaryDenis + salaryKristina;
        double newSalary = newSalaryMasha + newSalaryDenis + newSalaryKristina;
        double revenueDifference = newSalaryMasha + newSalaryDenis + newSalaryKristina;


        System.out.println(" Маша теперь получает " + increasedMasha + " руб. Годовой доход вырос на " + newSalaryMasha + " руб. ");
        System.out.println(" Денис теперь получает " + increasedDenis + " руб. Годовой доход вырос на " + newSalaryDenis + " руб. ");
        System.out.println(" Кристина теперь получает " + increasedKristina + " руб. Годовой доход вырос на " + newSalaryKristina + " руб. ");
        System.out.println(" Общая годовая разница за год составила : " + revenueDifference + " руб. ");

    }
}