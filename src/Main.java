public class Main {
    public static void main(String[] args) {
        task1();
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
}