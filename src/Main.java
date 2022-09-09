public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }
    public static void task1(){
        System.out.println("Задание 1.1");
        int money = 46_200;
        int month = 0;
        int deposit = 0;
        while (deposit < 2_459_000){
            deposit = deposit + deposit/100;
            deposit = deposit + money;
            month++;
            System.out.printf("Месяц %d, сумма накоплений %d\n",month,deposit);
        }
    }
    public static void task2 (){
        System.out.println("Задание 1.2");
        int a = 0;
        while (a<10) {
            a++;
            System.out.print(" " + a);
        }
        System.out.println();
        for (a = 10; a > 0; a--){
            System.out.print(" " + a);
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Задание 1.3");
        int country = 12_000_000;
        int fertility = (country/1000) * 17;
        int mortality = (country/1000) * 8;
        for (int year = 2022; year <= 2032; year++){
            country = country + (fertility - mortality);
            System.out.printf("Год %d числиность населения %d\n", year,country);
        }
    }
    public static void task4(){
        System.out.println("Задание 2.1");
        double deposit = 15_000;
        int month = 0;
        while (deposit <= 12_000_000){
            deposit = deposit + deposit * 0.07;
            month++;
            System.out.printf("Месяц %d сумма на вкладе %.2f рублей\n", month,deposit);

        }
    }
    public static void task5 (){
        System.out.println("Задание 2.2");
        double deposit = 15_000;
        int month = 0;
        while (deposit <= 120_000_000){
            deposit = deposit + deposit * 0.07;
            month++;
            if (month % 6  == 0){
                System.out.printf("Месяц %d сумма на вкладе %.2f рублей\n", month,deposit);
            }
        }
    }
    public static void task6 (){
        System.out.println("Задание 2.3");
        double deposit = 15_000;
        int month = 0;
        while (month <= 108){
            deposit = deposit + deposit * 0.07;
            month++;
            if (month % 6 == 0){
                System.out.printf("Месяц %d сумма на вкладе %.2f рублей\n", month,deposit);
            }
        }
    }
    public static void task7(){
        System.out.println("Задание 2.4");
        int friday = 4;
        System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n",friday);
        while (friday <=31) {
            friday = friday + 7;
            if (friday <=31) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", friday);
            }
        }
    }
    public static void task8 (){
        System.out.println("Задание 3.1");
        int year = 0;
        while (year <=2122) {
            year = year + 79;
            if (year >= 1822 && year <= 2122) {
                System.out.printf("Комета пролетала в %d году\n", year);
            }
        }
    }
    public static void task9 (){
        System.out.println("Задание 3.2");
        int sum = 0;
        for (int number = 1; number <= 10; number++){
            sum = number * 2;
            System.out.printf("2 * %d = %d\n", number,sum);
        }
    }
}