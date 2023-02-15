public class Main {
    public static void main(String[] args) {
        task1();
        task2();

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
        int clientDeviceYear = 2020;
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

    }

    public static void task4() {
        System.out.println("Задача 4");

    }

    public static void task5() {
        System.out.println("Задача 5");

    }
}