package userInput;

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        /* Constants */
        final int MILLISECONDS_IN_SECOND = 1000;
        final int SECONDS_IN_MINUTE = 60, MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;

        /**
         * Current Time
         * */
        /* Calculations */
        long totalMilliseconds = System.currentTimeMillis();            // Step 1
        long totalSeconds = totalMilliseconds / MILLISECONDS_IN_SECOND; // Step 2
        long currentSecond = totalSeconds % SECONDS_IN_MINUTE;          // Step 3
        long totalMinutes = totalSeconds / MINUTES_IN_HOUR;             // Step 4
        long currentMinute = totalMinutes % MINUTES_IN_HOUR;            // Step 5
        long totalHours = totalMinutes / HOURS_IN_DAY;                  // Step 6
        long currentHour = totalHours % HOURS_IN_DAY;                   // Step 7

        /* Display */
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT.");

        /**
         * User-Entered Time
         * */
        /* Get user input */
        Scanner scanner = new Scanner(System.in);

        /* Calculations */
        totalMilliseconds = scanner.nextLong();                    // Step 1; ask the user for Long value
        totalSeconds = totalMilliseconds / MILLISECONDS_IN_SECOND; // Step 2
        currentSecond = totalSeconds % SECONDS_IN_MINUTE;          // Step 3
        totalMinutes = totalSeconds / MINUTES_IN_HOUR;             // Step 4
        currentMinute = totalMinutes % MINUTES_IN_HOUR;            // Step 5
        totalHours = totalMinutes / HOURS_IN_DAY;                  // Step 6
        currentHour = totalHours % HOURS_IN_DAY;                   // Step 7

        /* Display */
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT.");
    }
}
