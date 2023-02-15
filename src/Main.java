public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOs = 0;
        int clientDeviceYear = 2010;
        boolean old = (clientDeviceYear <= 2015);
        if (clientOs == 0 && old) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs == 1 && old) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
    int deliveryDistance = 95;
    int days = 1;
    if (deliveryDistance <= 20) {
        days = 1;
        System.out.println("Потребуется дней: " + days);
    } else if (deliveryDistance > 20 && deliveryDistance <=60) {
        days = days + 1;
        System.out.println("Потребуется дней: " + days);
    } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
        days = days + 2;
        System.out.println("Потребуется дней: " + days);
    } else {
        System.out.println("Доставки нет");
    }
    }

    public static void task5() {
        System.out.println("Задача 5");

    }
}