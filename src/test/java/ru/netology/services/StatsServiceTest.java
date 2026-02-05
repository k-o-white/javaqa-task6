package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void calculateSalesSumTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        Assertions.assertEquals(expected, service.calculateSalesSum(sales));
    }

    @Test
    public void calculateAverageSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        Assertions.assertEquals(expected, service.calculateAverageSales(sales));
    }

    @Test
    public void calulateMaxSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        Assertions.assertEquals(expected, service.calulateMaxSales(sales));
    }

    @Test
    public void calulateMinSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        Assertions.assertEquals(expected, service.calulateMinSales(sales));
    }

    @Test
    public void calculateLowSalesCountTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        Assertions.assertEquals(expected, service.calculateLowSalesCount(sales));
    }

    @Test
    public void calculateHighSalesCountTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        Assertions.assertEquals(expected, service.calculateHighSalesCount(sales));
    }
}
