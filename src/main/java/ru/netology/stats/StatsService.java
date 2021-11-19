package ru.netology.stats;

public class StatsService {

    public int calculateTotalSale(int[] sales) {
        int totalSale = 0;
        for (int sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public int calculateAverage(int[] sales) {
        int average = 0;
        average = calculateTotalSale(sales) / sales.length;
        return average;
    }

    public int findMaxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale > sales [maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;
    }

    public int findMinMonth(int[] sales) {
            int minMonth = 0;
            int month = 0;
            for (int sale : sales) {
                if (sale < sales[minMonth]) {
                    minMonth = month;
                }
                month = month + 1;
            }
            return minMonth + 1;
        }

    public int findMonthBelowAverageQuantity (int [] sales) {
        int monthBelowAverageQuantity = 0;
        for (int sale : sales) {
            if (sale < calculateAverage(sales)) {
                monthBelowAverageQuantity = monthBelowAverageQuantity + 1;
            }
        }
        return monthBelowAverageQuantity;
    }

    public int findMonthAboveAverageQuantity (int [] sales) {
        int monthAboveAverageQuantity = 0;
        for (int sale : sales) {
            if (sale > calculateAverage(sales)) {
                monthAboveAverageQuantity = monthAboveAverageQuantity + 1;
            }
        }
        return monthAboveAverageQuantity;
    }

}

