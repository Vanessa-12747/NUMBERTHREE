package com.mycompany.aqimonitor;

import java.util.Arrays;
import java.util.Random;

public class AQIMonitor {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random random = new Random();
        int hazardousDays = 0;

        // Generate 30 random AQI readings
        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = random.nextInt(300) + 1; // 1 to 300
            if (aqiReadings[i] > 200) {
                hazardousDays++;
            }
        }

        // Sort readings to compute median
        Arrays.sort(aqiReadings);
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[14] + aqiReadings[15]) / 2.0;
        } else {
            median = aqiReadings[aqiReadings.length / 2];
        }

        // Output results
        System.out.println("AQI Readings: " + Arrays.toString(aqiReadings));
        System.out.println("Median AQI: " + median);
        System.out.println("Number of hazardous days (AQI > 200): " + hazardousDays);
    }
}
