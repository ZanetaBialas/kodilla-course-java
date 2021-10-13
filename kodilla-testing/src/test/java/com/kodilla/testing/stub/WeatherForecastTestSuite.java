package com.kodilla.testing.stub;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithStub ( ) {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantityOfSensors);
    }
    @BeforeEach
    @Test
    void testAverageValueTemperatures() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        double valueA1 = weatherForecast.calculateAverageTemperature();

        //Then
        assertEquals(25.56, valueA1);
    }


    @BeforeEach
    @Test
    void testMedianOfTemperatures() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        double valueA1 = weatherForecast.calculateMedianOfTemperature();

        //Then
        assertEquals(25.5, valueA1);
    }

}