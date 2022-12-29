public class Main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Домашнее задание 1");
        int man = 17;
        if (man >= 18) {
            System.out.println("Совершеннолетний");
        } else
            System.out.println("Возраст совершеннолетия еще не наступил и нужно немного подождать.");
    }
    public static void task2() {        //Домашнее задание 2
        System.out.println("Домашнее задание 2");
        int t = 5;
        if (t < 5) {
            System.out.println("На улице " + t + " градусов, нужно надеть шапку");
        } else
            System.out.println("На улице " + t + " градусов, можно идти без шапки");
    }
    public static void task3() {
        System.out.println("Домашнее задание 3");  // Домашнее задание 3

        int kh = 60;
        if (kh > 60) {
            System.out.println("Если скорость " + kh + " придется заплатить штраф");
        } else
            System.out.println("Если скорость " + kh + " можно ездить спокойно");
    }
    //Домашнее задание 4
    public static void task4() {
        System.out.println("Домашнее задание 4");
        int personIsAge = 40;
        if (personIsAge >= 2 && personIsAge < 6) {
            System.out.println("Если возраст человека равен " + "ему нужно ходить в детский сад");
        } else if (personIsAge >= 7 && personIsAge <= 18) {
            System.out.println("Ему нужно ходить в школу");
        } else if (personIsAge > 18 && personIsAge < 24) {
            System.out.println("его место в университете");
        } else
            System.out.println("Пора ходить на работу");
    }
    // Домашнее задание 5
    public static void task5() {
        System.out.println("Домашнее задание 5");
        int childhood = 14;
        if (childhood < 5) {
            System.out.println("Если возраст ребенка равен " + childhood + "то ему не льзя кататься на аттракционе.");
        } else if (childhood > 5 && childhood < 14) {
            System.out.println("Если возраст ребенка равен " + childhood + "он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else
            System.out.println("Если возраст ребенка равен " + childhood + " то ему можно кататься на аттракционе без сопровождения ");
    }
    public static void task6() {
        System.out.println("Домашнее задание 6");

        int wagon = 102; // общее количество мест в одном вагоне
        int seat = 60; // количество сидячих мест
        int standingPlace = 38;// стоячие места
        if (seat == 60 && standingPlace == 38) {
            System.out.println("Вагон забит полностью");
        } else if (seat <= 60 || standingPlace < 38) {
            seat = 60 - seat;
            standingPlace = 38 - standingPlace;
            System.out.println("сидячих " + seat + " стоячих " + standingPlace);
        }
    }
    public static void task7() {
        System.out.println("Домашнее задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one < two && three > two) {
            System.out.println(three + " больше");
        } else if (one > two && three < two) {
            System.out.println(one + " больше");
        } else
            System.out.println(two + " больше");

    }
}

