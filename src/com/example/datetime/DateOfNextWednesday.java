package com.example.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateOfNextWednesday {

    public static void main(String[] args) {

        findDateOfNextWednesday();
    }

    private static void findDateOfNextWednesday() {
        LocalDate today = LocalDate.now();
        LocalDate nextWednesday = today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(nextWednesday);
    }
}
