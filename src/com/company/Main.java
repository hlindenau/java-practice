package com.company;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {



    public static void main(String[] args) {
        //Test myCalendar's class display method

        Random r = new Random();


        myCalendar cal = new myCalendar();
        cal.display();



        /* Point class testing
        Point p = new Point(3,4).translate(1,3).scale(0.5f);
        System.out.println(p.getX() + " " + p.getY());
        Point p2 = new Point(3,4);
        p2.translate_modify(1,3);
        p2.scale_modify(0.5f);
        System.out.println(p2.getX() + " " + p2.getY());
         */

        /* Car class testing
        Car c = new Car(10,3);
        c.Travel(100);
        c.Travel(300);
        c.Travel(300);
        c.Refuel(30);
        c.Status();
        c.Travel(1000);
        c.Status();
         */

        myCallendar2 cal2 = new myCallendar2();
        cal2.display();
        }
}
