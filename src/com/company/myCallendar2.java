package com.company;
import java.time.LocalDate;


import static java.lang.System.*;
import static java.time.LocalDate.*;

// Practicing statically imported classes

public class myCallendar2{

    //Get today's date using statically imported LocalDate's
    private LocalDate day  = now();

    public void display(){
        //Display current month, year and days of the week
        System.out.println(now().getMonth() + "  " + now().getYear());
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        //Start with the first day of the month
        day = LocalDate.of(day.getYear(),day.getMonth(),1);

        //Print padding for the first week
        if(day.getDayOfWeek().getValue() != 7) {
            for (int i = 0; i < day.getDayOfWeek().getValue(); i++) {
                out.print("     ");
            }
        }

        //Print days
        do{
            //Highlight today's date with red
            if(day.getDayOfMonth() == now().getDayOfMonth()){
                out.print("\u001B[31m" + String.format("%3d", day.getDayOfMonth())+ "\u001B[0m" + "  ");
            }
            else {
                out.print(String.format("%3d", day.getDayOfMonth()) + "  ");
            }

            //Check if the next day is Sunday (new week/row)
            day = day.plusDays(1);
            if (day.getDayOfWeek().getValue() == 7) {
                out.println();
            }
        } while(day.getDayOfMonth() > 1); //Repeat this process for other days of this month

        if(day.getDayOfWeek().getValue() != 7){
            out.println();
        }

    }
}
