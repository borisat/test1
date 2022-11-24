package com.company;

public class Business {
    public static float overpaymentСalculation(float credit, float persent, float payment) throws Exception {

        float balance = credit;

        if (((credit - payment * 12) * persent / 100 < credit) && (payment * 12 <= balance / 12)) {
            throw new Exception("Кредит не будет погашен таким платежом");
        }


        return (Main.paymentCount(balance, payment, persent) - credit);
    }
}
