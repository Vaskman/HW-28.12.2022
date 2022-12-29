import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 28.12.2022");
    //task1
        System.out.println("ЗАДАЧА №1");
        byte pen = 3;
        System.out.println("Значение переменной pen с типом byte равно " +pen);
        short pencil = 32000;
        System.out.println("Значение переменной pencil с типом short равно " +pencil);
        int marker = 3000000;
        System.out.println("Значение переменной marker с типом int равно " +marker);
        long paperclips = 3000000;
        System.out.println("Значение переменной paperclips с типом long равно " +paperclips);
        float ink = 0.88F;
        System.out.println("Значение переменной ink с типом float равно " +ink);
        double paper = 10.555;
        System.out.println("Значение переменной paper с типом double равно " +paper);
    //task 2
        System.out.println("ЗАДАЧА №2");
        float a=27.12F;
        long b=987678965549L;
        double c=2.786F;
        char d=569;
        short e=-159;
        int f=27897;
        byte g=67;
    //task 3
        System.out.println("ЗАДАЧА №3");
        byte one =23;
        byte two = 27;
        byte three = 30;
        short sheetsOfPaper = 480;
        byte totalStudents =(byte) (one+two+three);
        byte total =(byte) (sheetsOfPaper/totalStudents);
        System.out.println("На каждого ученика рассчитано "+total+ " листов бумаги");
    //task 4
        System.out.println("ЗАДАЧА №4");
        byte machinePerformance=16;
        byte productionTime=2;
        byte oneMinute = (byte)(machinePerformance/productionTime);
        int minutes20 =oneMinute*20;
        int hour=minutes20*3;
        int day=hour*24;
        int day3=day*3;
        int month=day3*10;
        System.out.println("За 20 минут машина производит "+minutes20+" бутылок");
        System.out.println("За сутки машина произвела "+day+" штук бутылок");
        System.out.println("За 3 дня  дня машина произвела "+day3+ " штук бутылок");
        System.out.println("За месяц  машина произвела "+month+ " штук бутылок");
    //task 5
        System.out.println("ЗАДАЧА №5");
        byte totalPurchasedCansOfPaint=120;
        byte whitePaint =2;
        byte brownPaint=4;
        int howManyClasses=totalPurchasedCansOfPaint/(whitePaint+brownPaint);
        int allWhite = (whitePaint*howManyClasses);
        int allBrown= (brownPaint*howManyClasses);
        System.out.println("В школе, где "+howManyClasses+" классов, нужно "+ allWhite+" банок белой краски и "+allBrown+ " банок коричневой краски");
    //task 6
        System.out.println("ЗАДАЧА №6");
        int bananas = 5;
        int milk = 2;
        int iceСream=2;
        int eggs = 4;
        int oneBanana= 80;
        int oneMilk=(105);
        int onetIceCream=100;
        int oneEggs = 70;
        int weightGrams = bananas*oneBanana+milk*oneMilk+iceСream*onetIceCream+eggs*oneEggs;
        double weightKg = weightGrams/1_000D;
        System.out.println("Общий вес в граммам "+weightGrams+ " общий вес в кг "+weightKg);
    //task 7
        System.out.println("ЗАДАЧА №7");
        int weightForLossInGrams = 7_000;
        int lossWeightPerDayMin = 250;
        int lossWeightPerDayMax = 500;
        double maxDaysCount= (double) weightForLossInGrams/lossWeightPerDayMin;
        double minDaysCount= (double) weightForLossInGrams/lossWeightPerDayMax;
        double lossWeightPerDayAverage = (lossWeightPerDayMin +lossWeightPerDayMax) / 2D;
        double averageDaysCount = weightForLossInGrams / lossWeightPerDayAverage;
        System.out.println("Минимальное количество дней для похудения "+minDaysCount);
        System.out.println("Максимальное количество дней для похудения "+maxDaysCount);
        System.out.printf(Locale.US,"Среднее количество дней для похудения %.2f%n" ,averageDaysCount);


    //task 8
        System.out.println("ЗАДАЧА №8");
        int nameMasha = 67_760;
        int nameDenis = 83_690;
        int nameKristina = 76_230;

        double index = 1.1;

        double newMasha = nameMasha*index;
        double newDenis = nameDenis*index;
        double newKristina = nameKristina*index;

        double annualMasha = 12*nameMasha;
        double newMasha1 = 12*newMasha;

        double annualDenis = 12*nameDenis;
        double newDenis1 = 12*newDenis;

        double annualKristina = 12*nameKristina;
        double newKristina1 = 12*newKristina;

        System.out.printf(Locale.US,"Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n",newMasha,newMasha1-annualMasha);
        System.out.printf(Locale.US,"Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newDenis,newDenis1-annualDenis);
        System.out.printf(Locale.US,"Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newKristina,newKristina1-annualKristina);}

}