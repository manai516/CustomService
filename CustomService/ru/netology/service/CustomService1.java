package ru.netology.service;

public class CustomService1 {

    public static final int FEE_PER_KILOGRAM = 100;

    public static final int FEE_PER_RUBLE_IN_KOPEKS = 1;

    public static int calculateCustoms(int price) {
        int feeInKop = price * FEE_PER_RUBLE_IN_KOPEKS;
        int feeInRubls = feeInKop / 100;
        return feeInRubls;
    }

    public static int calculateCustoms1(int weight) {
        int feeWeight = weight * FEE_PER_KILOGRAM;
        return feeWeight;
    }

    public static int calculateTotal(int weight, int price) {
        int totalFee = calculateCustoms(price);
        int totalWeight = calculateCustoms1(weight);
        int totalPrice = totalFee + totalWeight;
        return totalPrice;
    }
}