package com.company;

public class Business {
    public static float overpaymentСalculation(float credit, float persent, float payment) throws Exception {

        float balance = credit;

        return (Main.paymentCount(balance, payment, persent) - credit);
    }
}
