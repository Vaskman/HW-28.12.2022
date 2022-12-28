public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 28.12.2022");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    public static void task1() {
        System.out.println("ЗАДАЧА №1");
        byte pen = 3;
        System.out.println("Ручка "+ pen+" шт");
        short pencil = 32000;
        System.out.println("Карандаш "+pencil+" шт");
        int marker = 3000000;
        System.out.println("Маркер "+ marker+" шт");
        long paperclips = 3000000;
        System.out.println("Скрепки "+paperclips+" шт");
        float ink = 0.88F;
        System.out.println("Чернил "+ ink+" мл");
        double paper = 10.555;
        System.out.println("Бумага "+ paper+" шт");
    }
    public static void task2(){
        System.out.println("ЗАДАЧА №2");
        float a=27.12F;
        System.out.println("а = "+a);
        long b=987678965549L;
        System.out.println("b = "+b);
        float c=2.786F;
        System.out.println("c = "+c);
        short d=569;
        System.out.println("d = "+d);
        short e=-159;
        System.out.println("e = "+e);
        int f=27897;
        System.out.println("f = "+f);
        byte g=67;
        System.out.println("g = "+g);
    }
    public static void task3(){
        System.out.println("ЗАДАЧА №3");
        var teacher1= ("Первый учитель Людмила Павловна");
        System.out.println(teacher1);
        var teacher2= ("Второй учитель Анна Сергеевна");
        System.out.println(teacher2);
        var teacher3= ("Третий учитель Екатерина Анреевна");
        System.out.println(teacher3);
        byte one =23;
        System.out.println(one+ " Человек учеников у " + teacher1 );
        byte two = 27;
        System.out.println(two+ " Человек учеников у " + teacher2 );
        byte three = 30;
        System.out.println(three+ " Человек учеников у " + teacher3 );
        byte totalStudents =(byte) (one+two+three);
        System.out.println("Итого учетиков "+totalStudents+" человек");
        var paper = ("Бумаги");
        System.out.println(paper);
        short sheetsOfPaper = 480;
        System.out.println("Закупили "+ sheetsOfPaper+" листов "+paper);
        byte total =(byte) (sheetsOfPaper/totalStudents);
        System.out.println("На каждого ученика рассчитано "+total+ " листов бумаги");
    }
    public static void task4(){
        System.out.println("ЗАДАЧА №4");
        byte machinePerformance=16;
        System.out.println("Производительность машины "+machinePerformance+" бутылок шт");
        byte productionTime=2;
        System.out.println("Время на производство "+productionTime+" мин");
        byte oneMinute = (byte)(machinePerformance/productionTime);
        System.out.println("За одну минуту машина производит "+oneMinute+" бутылок");
        byte twentyMinutes =20;
        System.out.println(twentyMinutes+" минут");
        short totalTwentyMinutes=(short) (oneMinute*twentyMinutes);
        System.out.println("За "+twentyMinutes+" минут машина произвела "+totalTwentyMinutes+ " штук бутылок");
        byte oneHour =60;
        System.out.println("Один час это "+oneHour+" минут");
        short producInOneHour= (short) (oneMinute*oneHour);
        System.out.println("За один час машина производит "+producInOneHour+" бутылок");
        short day=24;
        System.out.println("В сутках "+day+" часа");
        System.out.println("Сколько производит за "+day+ " часа бутылок в шт?");
        short totalDay= (short) (day*producInOneHour);
        System.out.println("За "+day+ " часа машина произвела "+totalDay+ " штук бутылок");
        short threeDays=3;
        System.out.println("Сколько производит за "+threeDays+ " дня бутылок в шт?");
        int totalThreeDays=(threeDays*totalDay);
        System.out.println("За "+threeDays+ " дня машина произвела "+totalThreeDays+ " штук бутылок");
        byte month = 30;
        System.out.println("В месяце "+month+ " дней");
        System.out.println("Сколько производит за "+month+ " дней бутылок в шт?");
        int totalMonth=(totalDay*month);
        System.out.println("За "+month+ " дней машина произвела "+totalMonth+ " штук бутылок");
    }
    public static void task5() {
        System.out.println("ЗАДАЧА №5");
        byte whitePaint =2;
        System.out.println("Банки белой краски "+whitePaint+" шт.на один класс");
        byte brownPaint=4;
        System.out.println("Банки коричневой краски "+brownPaint+" шт.на один класс");
        byte paintСansPerСlass=(byte) (whitePaint+brownPaint);
        System.out.println("На один класс уходит "+paintСansPerСlass+" банок краски");
        byte totalPurchasedCansOfPaint=120;
        System.out.println("Всего куплено "+totalPurchasedCansOfPaint+" банок краски");
        byte howManyClasses=(byte) (totalPurchasedCansOfPaint/paintСansPerСlass);
        System.out.println("Всего классов в школе "+howManyClasses+" шт");
        byte allWhite = (byte) (whitePaint*howManyClasses);
        System.out.println("Всего белой краски потрачено "+allWhite+" банок");
        byte allBrown=(byte) (brownPaint*howManyClasses);
        System.out.println("Всего коричневой краски потрачено "+allBrown+" банок");
        System.out.println("В школе, где "+howManyClasses+" классов, нужно "+ allWhite+" банок белой краски и "+allBrown+ " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("ЗАДАЧА №6");
        byte bananas = 5;
        System.out.println("Бананов "+bananas+" шт");
        byte onebanana= 80;
        System.out.println("Один Банан = "+onebanana+" г.");
        short bananasGrams=(short) (bananas*onebanana);
        System.out.println("Все бабаны в граммах = "+bananasGrams+" г.");
        short milk = 200;
        System.out.println("Молока "+milk+ "мл");
        short oneMilk=(105);
        System.out.println("В 100 мл молока "+oneMilk+" г.");
        short milkGrams=(short) (oneMilk+oneMilk);
        System.out.println("Все молоко в граммах = "+milkGrams+" г.");
        byte iceСream=2;
        System.out.println("Мороженное в брикетах "+iceСream+" шт");
        short weightIceCream=100;
        System.out.println("Вес одного брикета в граммах = "+weightIceCream+" г.");
        short iceCreamGrams=(short) (iceСream*weightIceCream);
        System.out.println("Все мороженное в граммах = "+iceCreamGrams+" г.)");
        byte eggs = 4;
        System.out.println("Яйца "+eggs+" шт");
        short oneEggs = 70;
        System.out.println("Вес одного яйца в граммах = "+oneEggs+ " г.");
        short eggsGrams=(short) (eggs*oneEggs);
        System.out.println("Все яйца в граммах = "+eggsGrams+ " г.");
        float productWeight=(bananasGrams+milkGrams+iceCreamGrams+eggsGrams);
        System.out.println("Вес всех продуктов в граммах ="+productWeight+" г.");
        float convection = productWeight/1000L;
        System.out.println("Вес всех продуктов в килограммах = "+convection+" кг");

    }
}