package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Считываем строку
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        //создаем массив строк
        try {


        String [] params = s.split(" ");
        float credit = Float.parseFloat(params[0]);
        float payment = Float.parseFloat(params[1]);
        float persent = Float.parseFloat(params[2]);
        String creditType = params[3];


        // обработка исключений нуля в параметрах
            if (credit <= 0 )
            {
            throw new Exception("сумма кредита меньше либо равна 0");
            }

            if (payment <= 0 )
            {
                throw new Exception("сумма платежка меньше либо равна 0");
            }

            if (persent <= 0 )
            {
                throw new Exception("ставка кредита меньше либо равна 0");
            }


        if (creditType.equals("human"))
        System.out.println(Human.overpayment(credit, persent, payment));
        else if (creditType.equals("business"))
        System.out.println(Business.overpayment(credit, persent, payment));

        }

        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
