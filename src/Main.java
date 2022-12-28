public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 28.12.2022");
        task1();
        task2();
        task3();
        task4();

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
    }

}