package ru.netology.services;

public class StatsService {

    public long calculateSalesSum(long[] sales) {
        if (sales == null) {
            return -1;
        }
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long calculateAverageSales(long[] sales) {
        if (sales == null) {
            return -1;
        }
        long salesSum = calculateSalesSum(sales);
        return salesSum / sales.length;
    }

    public int calulateMaxSales(long[] sales) {
        if (sales == null) {
            return -1;
        }
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int calulateMinSales(long[] sales) {
        if (sales == null) {
            return -1;
        }
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateLowSalesCount(long[] sales) {
        if (sales == null) {
            return -1;
        }
        long average = calculateAverageSales(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale < average) {
                result++;
            }
        }
        return result;
    }

    public int calculateHighSalesCount(long[] sales) {
        if (sales == null) {
            return -1;
        }
        long average = calculateAverageSales(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale > average) {
                result++;
            }
        }
        return result;
    }
}
