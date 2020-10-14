package com.company;

import java.time.LocalDate;
import java.util.Date;


// myCalendar class provides a simple method to display calendar that starts with Sundays
public class myCalendar{

        //Get today's date using LocalDate's class method
        private LocalDate day  = LocalDate.now();

        public void display(){
                //Display current month, year and days of the week
                System.out.println(day.getMonth() + "  " + day.getYear());
                System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

                //Start with the first day of the month
                day = LocalDate.of(day.getYear(),day.getMonth(),1);

                //Print padding for the first week
                if(day.getDayOfWeek().getValue() != 7) {
                        for (int i = 0; i < day.getDayOfWeek().getValue(); i++) {
                                System.out.print("     ");
                        }
                }

                //Print days
                do{
                        //Highlight today's date with red
                        if(day.getDayOfMonth() == LocalDate.now().getDayOfMonth()){
                                System.out.print("\u001B[31m" + String.format("%3d", day.getDayOfMonth())+ "\u001B[0m" + "  ");
                        }
                        else {
                                System.out.print(String.format("%3d", day.getDayOfMonth()) + "  ");
                        }

                        //Check if the next day is Sunday (new week/row)
                        day = day.plusDays(1);
                        if (day.getDayOfWeek().getValue() == 7) {
                                System.out.println();
                        }
                } while(day.getDayOfMonth() > 1); //Repeat this process for other days of this month

                if(day.getDayOfWeek().getValue() != 7){
                        System.out.println();
                }

        }
}
