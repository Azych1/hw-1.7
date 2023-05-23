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

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int summToAccumulate = 2_459_000;
        for (int month = 1; total <= summToAccumulate; month++) {
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate = 17;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + population * birthRate / 1000 - population * mortality / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        int amountToAccumulate = 12_000_000;
        int numberOfPercentages = 7;
        for (int month = 0; total <= amountToAccumulate; month++) {
            total = total + total / 100 * numberOfPercentages;
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 15000;
        int month = 0;
        int summToAccumulate = 12_000_000;
        while (total < summToAccumulate) {
            total = total + total / 100 * 7;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + total);
            } else if (total >= summToAccumulate) {
                System.out.println("Планируемая сумма накоплена на " + month + " месяц. Итого " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 15000;
        int month = 0;
        int percentage = 7;
        int summOfMonth = 9 * 12;
        do {
            total = total + total / 100 * percentage;
            month++;
            if (month % 6 == 0 && month != summOfMonth) {
                System.out.println("Месяц " + month + " Итого " + total);
            }
            if (month == summOfMonth) {
                System.out.println("Планируемое количество месяцев накопления достигнуто и равно " + month + ". Итого " + total);
            }
        }
        while (month <= summOfMonth);
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int date = 5; date <= 31; date += 7) {
            System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
        }


    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentDate = 2023;
        int dayPlus = 1;
        for (int date = currentDate - 200; date <= currentDate + 100; date += dayPlus) {
            if (date % 79 == 0) {
                System.out.println(date);
                dayPlus = 79;
            }
        }
    }


}