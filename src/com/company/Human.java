package com.company;

public class Human {
    public static float overpayment(float credit, float persent, float payment) throws Exception {

        float total = 0; // всего выплат
        float balance = credit + credit * persent / 100 ; //баланс
        int m = 0; //месяц рсчетов

        // исключение невозможности погашения и расчет досроного погашения

        if ((((credit + credit * persent / 100) - payment * 12)  < balance) && (payment * 12 <= balance / 12)) throw new Exception("Кредит не будет погашен таким платежом");


        while (balance > 0) {

            // начисление процентов в начале года
            if (m == 12)
            {
                balance = balance + balance * persent / 100;
                m = 0;
            }
            //проверка суммы последнего платежа
            if (balance < payment)
                payment = balance;


            balance -= payment;
            total += payment;
            m++;
        }

        return (total - credit);
    }

}
