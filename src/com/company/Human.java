package com.company;

public class Human {
    public static float overpaymentСalculation(float credit, float persent, float payment) throws Exception {

        float balance = credit + credit * persent / 100;

        return (Main.paymentCount(balance, payment, persent) - credit);
    }

}
