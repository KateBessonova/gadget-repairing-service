package com.solvd.gadgetrepairservice.pickup;

import java.util.Arrays;

enum Weekday {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean weekend;

    Weekday(boolean weekend) {

        this.weekend = weekend;
    }

    public static Weekday[] getDays(boolean weekend) {
        return Arrays.stream(values()).filter(i -> i.weekend == weekend).toArray(Weekday[]::new);
    }
}

