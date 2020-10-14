package com.company;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {

    //TODO: generate javadoc

    public static void main(String[] args) {
        //Test myCalendar's class display method

        myCalendar cal = new myCalendar();
        cal.display();

        // Test Point class
        Point p = new Point(3,4).translate(1,3).scale(0.5f);
        System.out.println(p.getX() + " " + p.getY());

        Point p2 = new Point(3,4);
        p2.translate_modify(1,3);
        p2.scale_modify(0.5f);
        System.out.println(p2.getX() + " " + p2.getY());


        }
}
