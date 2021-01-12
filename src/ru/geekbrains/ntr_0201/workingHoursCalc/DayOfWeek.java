package ru.geekbrains.ntr_0201.workingHoursCalc;

public enum DayOfWeek {
    SUNDAY(0),
    MONDAY(8),
    TUESDAY(8),
    WEDNESDAY(8),
    THURSDAY(8),
    FRIDAY(8),
    SATURDAY(0);

    private int workHours;

    DayOfWeek(int workHours) {
        this.workHours = workHours;
    }

    public static int getHours(DayOfWeek today) {
        int workingHours = 0;

        for (int i = today.ordinal(); i < today.values().length; i++) {
            workingHours += today.values()[i].workHours;
        }
        return workingHours;
    }

    public static void getWorkingHours(DayOfWeek today) {
        switch (today) {
            case SUNDAY, SATURDAY:
                System.out.println("Сегодня выходной.");
                break;
            default:
                System.out.printf("Осталось отработать %d часов.\n", getHours(today));
        }
    }
}
