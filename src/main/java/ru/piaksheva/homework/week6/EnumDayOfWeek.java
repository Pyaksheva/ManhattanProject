package ru.piaksheva.homework.week6;

public class EnumDayOfWeek {
    enum DayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        DayOfWeek i = DayOfWeek.SATURDAY;
        switch (i) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Будний день");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Выходной день");
        }
    }
}
