package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float credit;
        float payment;
        float persent;


        /**
         * Считываем строку
         * создаем массив строк
         */

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        try {
            String[] params = s.split(" ");
            credit = Float.parseFloat(params[0]);
            payment = Float.parseFloat(params[1]);
            persent = Float.parseFloat(params[2]);
            //String creditType = params[3];


            /**
             * обработка отрицательных суммы,
             * платежа ,процентов
             */

            if (credit <= 0) {
                throw new Exception("сумма кредита меньше либо равна 0");
            }

            if (payment <= 0) {
                throw new Exception("сумма платежка меньше либо равна 0");
            }

            if (persent <= 0) {
                throw new Exception("ставка кредита меньше либо равна 0");
            }


            /**
             * Вывод результата расчетов
             */

            if (params[3].equals("human")) {
                System.out.println(Human.overpaymentСalculation(credit, persent, payment));
            } else if (params[3].equals("business")) {
                System.out.println(Business.overpaymentСalculation(credit, persent, payment));
            }


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static  float paymentCount(float balance, float payment, float persent) throws Exception {

        float total = 0;
        int m = 0;

        if (payment * 12 <= balance / 12) {
            throw new Exception("Кредит не будет погашен таким платежом");
        }

        while (balance > 0) {

            /**
             * проверка  последнего платежа
             * и баланса
             */

            if (balance < payment) {
                payment = balance;
            }


            balance -= payment;
            total += payment;
            m++;


            /**
             *  начисление процентов за период 12 месяцев
             */
            if (m == 12) {
                balance = balance + balance * persent / 100;
                m = 0;
            }
        }

        return (total);
    }


}


