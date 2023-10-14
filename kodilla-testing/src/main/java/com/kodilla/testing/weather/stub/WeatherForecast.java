package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double calculateAverageTemperature() {
        double sumTemperatures = 0.0;

        for (Double temperature : temperatures.getTemperatures().values()) {
            sumTemperatures += temperature;
        }
        double averageTemperature = sumTemperatures/ temperatures.getTemperatures().size();
        return averageTemperature;
    }
    public double CalculateTheMedianTemperature() {
        double theMedianTemperature = 0.0;
        int dataSize = temperatures.getTemperatures().size();
        double[] sortedTemperatures = new double[dataSize];
        int i = 0;
        for(Double temperature : temperatures.getTemperatures().values()) {
            sortedTemperatures[i] = temperature;
            i++;
        }
        Arrays.sort(sortedTemperatures);
        if(dataSize % 2 == 1) {
            int medianIndexNumber = dataSize / 2;
            theMedianTemperature = sortedTemperatures[medianIndexNumber];
        } else {
            int indexNum1 = dataSize / 2;
            int indexNum2 = dataSize / 2 - 1;
            double temp1 = sortedTemperatures[indexNum1];
            double temp2 = sortedTemperatures[indexNum2];
            theMedianTemperature = (temp1 + temp2) / 2;

        } return theMedianTemperature;
    }
}
