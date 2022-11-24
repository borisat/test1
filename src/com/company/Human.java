package com.company;

public class Human {
    public static float overpaymentСalculation(float credit, float persent, float payment) throws Exception {

        float balance = credit + credit * persent / 100;

        if ((((credit + credit * persent / 100) - payment * 12) < balance) && (payment * 12 <= balance / 12)) {
            throw new Exception("Кредит не будет погашен таким платежом");
        }

        return (Main.paymentCount(balance, payment, persent) - credit);
    }

}
