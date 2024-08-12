package com.mycompany.vurunners;

/**
 *
 * @author isaac
 */
public class VuRunners {

   public static void main(String[] args) {
        // Array of runners' names
        String[] names = {
            "Elena", "Thimas", "Hamilton", "Suzie", "Phil",
            "Matt", "Alex", "Emma", "John", "James",
            "Jane", "Emily", "Neda", "Aaron", "Kate"
        };

        // Array of corresponding times (in minutes)
        int[] times = {
            341, 273, 278, 329, 445,
            402, 388, 275, 243, 334,
            412, 393, 343, 317, 265
        };

        // Initialize variables to track the fastest and second fastest runners
        int fastestTimeIndex = 0;
        int secondFastestTimeIndex = 0;

        // Find the fastest runner
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[fastestTimeIndex]) {
                secondFastestTimeIndex = fastestTimeIndex;
                fastestTimeIndex = i;
            } else if (times[i] < times[secondFastestTimeIndex] || fastestTimeIndex == secondFastestTimeIndex) {
                secondFastestTimeIndex = i;
            }
        }

        // Print the fastest runner's name and time
        System.out.println("Fastest Runner: " + names[fastestTimeIndex] + " with time " + times[fastestTimeIndex] + " minutes.");

        // Print the second fastest runner's name and time
        System.out.println("Second Fastest Runner: " + names[secondFastestTimeIndex] + " with time " + times[secondFastestTimeIndex] + " minutes.");
    }
}