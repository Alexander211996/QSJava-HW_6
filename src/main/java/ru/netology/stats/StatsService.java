package ru.netology.stats;

public class StatsService {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int calculateTotalSale(int[] sales) {
        int totalSale = 0;
        for (int sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public int calculateAverage(int[] sales) {
        int Average = 0;
        Average = calculateTotalSale(sales) / sales.length;
        return Average;
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
        int Average = 0;
        Average = calculateTotalSale(sales) / sales.length;
        for (int sale : sales) {
            if (sale < Average) {
                monthBelowAverageQuantity = monthBelowAverageQuantity + 1;
            }
        }
        return monthBelowAverageQuantity;
    }

    public int findMonthAboveAverageQuantity (int [] sales) {
        int monthAboveAverageQuantity = 0;
        int Average = 0;
        Average = calculateTotalSale(sales) / sales.length;
        for (int sale : sales) {
            if (sale > Average) {
                monthAboveAverageQuantity = monthAboveAverageQuantity + 1;
            }
        }
        return monthAboveAverageQuantity;
    }

}

