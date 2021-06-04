/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex21;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App mainApp = new App();
        int month = mainApp.getMonth();
        String monthName = mainApp.getMonthName(month);

        String outputString = genOutputString(monthName);
        System.out.println(outputString);
    }

    public Integer getMonth()
    {
        System.out.println("Please enter the number of the month:");
        return in.nextInt();
    }

    public String getMonthName(int month)
    {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Error: That does not appear to be a month.";
        };
    }

    public static String genOutputString(String monthName)
    {
        return "The name of the month is " + monthName;
    }
}
