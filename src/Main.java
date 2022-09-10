public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 1");
        hw1_Task1();
        hw1_task2();
        hw1_task3();

        System.out.println("Домашнее задание - 2");
        hw2_task1();
        hw2_task2();
        hw2_task3();
        hw2_task4();

        System.out.println("Домашнее задание - 3");
        hw3_task1();
        hw3_task2();

    }

    // Домашнее задание - 1
    // Задание 1
    public static void hw1_Task1() {
        System.out.println("Задание 1");

        int salary = 29_000;
        int total = 0;
        int month = 0;

        while (total <= 2_459_000) {
            month++;
            total = total + total / 100;
            total = total + salary;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        System.out.println("---------");
    }

    // Задание 2
    public static void hw1_task2() {
        System.out.println("Задание 2");
        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n---------");
    }

    // Задание 3
    public static void hw1_task3() {
        System.out.println("Задание 3");
        int people = 12_000_000;
        int birthRate = people / 100 * 17;
        int mortality = people / 100 * 8;
        int year = 0;
        int people10Years = 0;

        while (year < 10) {
            year++;
            people10Years = people10Years + people + birthRate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + people10Years);
        }
        System.out.println("---------");
    }

    // Домашнее задание - 2
    // Задание 1
    public static void hw2_task1() {
        System.out.println("Задание 1");

        int depositAmount = 15_000;
        int month = 0;
        int accumulation = 0;

        while (accumulation <= 12_000_000) {
            month++;
            accumulation = accumulation + accumulation / 100 * 7;
            accumulation = accumulation + depositAmount;
            System.out.println("Месяц " + month + ", сумма накоплений " + accumulation);
        }
        System.out.println("---------");
    }

    // Задание 2
    public static void hw2_task2() {
        System.out.println("Задание 2");

        int depositAmount = 15_000;
        int month = 0;
        int accumulation = 0;

        while (accumulation <= 12_000_000) {
            month++;
            accumulation = accumulation + accumulation / 100 * 7;
            accumulation = accumulation + depositAmount;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + accumulation);
            }
        }
        System.out.println("---------");
    }

    // Задание 3
    public static void hw2_task3() {
        System.out.println("Задание 3");

        int depositAmount = 15_000;
        int monthPerYear = 9 * 12;
        int month = 0;
        int accumulation = 0;

        while (month <= monthPerYear) {
            month++;
            accumulation = accumulation + accumulation / 100 * 7;
            accumulation = accumulation + depositAmount;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + accumulation);
            }
        }
        System.out.println("---------");
    }

    // Задание 4
    public static void hw2_task4() {
        System.out.println("Задание 4");

        for (int i = 5; i < 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("---------");
    }

    // Домашнее задание - 3
    // Задание 1
    public static void hw3_task1() {
        System.out.println("Задание 1");

        for (int i = 1822; i <= 2022; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        for (int j = 2122; j >= 2022; j--) {
            if (j % 79 == 0) {
                System.out.println(j);
            }
        }

        System.out.println("---------");
    }

    // Задание 2
    public static void hw3_task2() {
        System.out.println("Задание 2");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }

        System.out.println("---------");
    }

}