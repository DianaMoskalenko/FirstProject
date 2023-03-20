package com.ua.robot.HomeWork14;

public enum DayOfWeek {
    MONDAY (1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    int priority;

    DayOfWeek(int priority) {
        this.priority = priority;
    }

    public static DayOfWeek of(int dayNumber) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.priority == dayNumber) {
                return day;
            }
        }
        return null;
    }
}
