package by.teachmeskills.util;

public class DateTimeUtils {
    public static boolean isLeapYear(int year) {
        if (year < 0)
            return false;

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
