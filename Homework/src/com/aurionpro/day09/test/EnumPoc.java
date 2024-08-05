package com.aurionpro.day09.test;

enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumPoc {

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.FRIDAY; 

       
        switch (today) {
            case MONDAY:
                System.out.println("Mondays are tough.");
                break;
            case FRIDAY:
                System.out.println("Fridays are fun!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are for relaxing.");
                break;
            default:
                System.out.println("Midweek days are okay.");
                break;
        }


        System.out.println("Days of the week:");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}