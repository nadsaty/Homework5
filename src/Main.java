public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1 () {
        System.out.println("Задача 1 \n");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке \n");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке \n");
                break;
            default:
                System.out.println("OS неопознано \n");
        }
    }


    public static void task2 () {
        System.out.println("Задача 2 \n");
        int clientOS = 1;
        int clientDeviceYear = 2013;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке \n ");
        } else  if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке \n");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке \n");
        } else  if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке \n");
        }
    }


    public static void task3 () {
        System.out.println("Задача 3 \n");
        int year = 2024;
        boolean whichYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (whichYear) {
            System.out.println (year + " - високосный год \n");
        } else {
            System.out.println (year + " - не високосный год \n");
        }
    }
}