public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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


    public static void task4 () {
        System.out.println("Задача 4 \n");
        int deliveryDistance = 95;
        int time = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + time + " день \n");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется " + time * 2 + " дня \n");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется " + time * 3 + " дня \n");
        } else if (deliveryDistance > 100) {
            System.out.println("Свыше 100км доставки нет \n");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5 \n");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц январь принадлежит к сезону зима \n");
                break;
            case 2:
                System.out.println("Месяц февраль принадлежит к сезону зима \n");
                break;
            case 3:
                System.out.println("Месяц март принадлежит к сезону весна \n");
                break;
            case 4:
                System.out.println("Месяц апрель принадлежит к сезону весна \n");
                break;
            case 5:
                System.out.println("Месяц май принадлежит к сезону весна \n");
                break;
            case 6:
                System.out.println("Месяц июнь принадлежит к сезону лето \n");
                break;
            case 7:
                System.out.println("Месяц июль принадлежит к сезону лето \n");
                break;
            case 8:
                System.out.println("Месяц август принадлежит к сезону лето \n");
                break;
            case 9:
                System.out.println("Месяц сентябрь принадлежит к сезону осень \n");
                break;
            case 10:
                System.out.println("Месяц октябрь принадлежит к сезону осень \n");
                break;
            case 11:
                System.out.println("Месяц ноябрь принадлежит к сезону осень \n");
                break;
            case 12:
                System.out.println("Месяц декабрь принадлежит к сезону зима \n");
                break;

            default:
                System.out.println("Такого месяца не существует \n");
        }

    }
}