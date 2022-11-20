package com.company;

public class Business {
    public static float overpayment(float credit, float persent, float payment) throws Exception {

        float total = 0; // сумма выплат
        float balance = credit; //баланс
        int m = 0; //месяц в году

           // исключение невозможности погашения и расчет досроного погашения

        if (((credit - payment * 12) * persent / 100 < credit) && (payment * 12 <= balance / 12)) throw new Exception("Кредит не будет погашен таким платежом");


            while (balance > 0) {

                //проверка суммы последнего платежа
                if (balance < payment)
                    payment = balance;

                balance -= payment;
                total += payment;
                m++;

                // начисление процентов за год
                if (m == 12) {
                    balance = balance + balance * persent / 100;
                    m = 0;
                }
        }
        return (total - credit);
    }
}
