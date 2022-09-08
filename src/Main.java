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
        System.out.println("Задание 1");
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
        System.out.println("Задание 2");
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
        System.out.println("Задание 3");
        int country = 12_000_000;
        int fertility = (country/1000) * 17;
        int mortality = (country/1000) * 8;
        for (int year = 2022; year <= 2032; year++){
            country = country + (fertility - mortality);
            System.out.printf("Год %d числиность населения %d\n", year,country);
        }
    }
    public static void task4(){
        System.out.println("Задание 4");
        double deposit = 15_000;
        int month = 0;
        while (deposit <= 120_000_000){
            deposit = deposit + deposit * 0.07;
            month++;
            if (month % 2  == 0){
            System.out.printf("Месяц %d сумма на вкладе %.2f рублей\n", month,deposit);
            }
        }
    }
    public static void task5 (){
        System.out.println("Задание 5");
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
        System.out.println("Задание 6");
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
        System.out.println("Задание 7");
        int date = 1;
        while (date<=31) {
            date = date + 6;
            if (date <= 31) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", date);
            }
        }
    }
    public static void task8 (){
        System.out.println("Задание 8");
        int date = 0;
        while (date<=2100) {
            date = date + 79;
            if (date >= 1800 && date <= 2200) {
                System.out.printf("Комета пролетала в %d году\n", date);
            }
        }
    }
    public static void task9 (){
        System.out.println("Задание 9");
        int sum = 0;
        for (int number = 1; number <= 10; number++){
            sum = number * 2;
            System.out.printf("2 * %d = %d\n", number,sum);
        }
    }
}