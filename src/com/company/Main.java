package com.company;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Piotr");
        Test t = new Test("Me",0);
        Test anonim = new Test(100);
        t.raiseSalary(10);

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));

    }
}
