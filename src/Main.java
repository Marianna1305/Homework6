public class Main {
    public static void main(String[] args) {
//  Циклы ДЗ 1
        System.out.println("Зaдaние 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Зaдaние 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Зaдaние 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("Зaдaние 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
//  Циклы ДЗ 2
        System.out.println("Задание 1");
        for (int year = 1904; year <= 2096; year += 4) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");}
        }
        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int number = 1;
        System.out.println(number + " ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
//  Циклы ДЗ 3
        System.out.println("Задание 1");
        int saved = 0;
        int savedMonth = 29000;
        for (int i = 1; i <= 12; i++) {
            saved = saved + saved / 12;
            saved = saved + savedMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + saved + " рублей");
        }
    }
}