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

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц "+month+", сумма накоплений равна "+total+" рублей");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number+" ");
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number+" ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate = population / 1000 * 17;
        int mortality = population / 1000 * 8;
        for (int year = 1; year <= 10; year++) {
            population = population + birthRate - mortality;
            birthRate = population / 1000 * 17;
            mortality = population / 1000 * 8;
            System.out.println("Год "+year+", численность населения составляет "+population);
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        for (int month = 0;total <= 12_000_000;month++) {
            total = total + total/100*7;
            total = total + salary;
            System.out.println("Месяц "+month+", сумма накоплений "+total);
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int total = 15000;
        int month = 0;
        while(total<12000000){
            total = total + total/100*7;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц "+month+" Итого "+total);
            } else if (total>=12_000_000) {
                System.out.println("Планируемая сумма накоплена на "+month+" месяц. Итого "+total);
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int total = 15000;
        int month = 0;
        do {
            total = total + total/100*7;
            month++;
            if (month % 6 == 0&&month!=9*12) {
                System.out.println("Месяц "+month+" Итого "+total);
            }
            if (month==9*12) {
                System.out.println("Планируемое количество месяцев накопления достигнуто и равно "+month+". Итого "+total);
            }
        }
        while (month<=9*12);
    }

    public static void task7 () {
        System.out.println("Задача 7");
        for (int date = 5; date <= 31; date += 7) {
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
        }


    }
    public static void task8 () {
        System.out.println("Задача 8");
        int currentDate = 2023;
        int date = currentDate - 200;
        while(date<=currentDate+100){
            if (date%79==0){
                System.out.println(date);
            }
            date++;
        }
    }


}