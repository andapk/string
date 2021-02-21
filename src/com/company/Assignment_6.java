package com.company;

import java.time.*;
import java.util.Scanner;

public class Assignment_6 {


    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please write day, month and year of your birthday.");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        System.out.println("Please enter time of birth(hour, minutes):");
        int hour = input.nextInt();
        int min = input.nextInt();

        LocalDate(year,month,day);
        LocalTime(hour,min);
        LocalDateTime(year,month,day,hour,min);

    }
    public static void LocalDate (int year,int month, int day) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date=" + today);

        LocalDate birthDay = LocalDate.of(year, enummonth(month), day);
        System.out.println("Your birthday: " + birthDay);
    }

    public static void LocalTime(int hour, int min) {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time=" + time);
        LocalTime birthTime = LocalTime.of(hour, min);
        System.out.println("Birthday Time  of Day=" + birthTime);

    }
    public static void LocalDateTime (int year,int month, int day, int hour, int min) {
        LocalDateTime tday = LocalDateTime.now();
        System.out.println("Current DateTime="+tday);
         LocalDateTime BDate = LocalDateTime.of(year, enummonth(month), day, hour, min);
           System.out.println("Your birthday:" +BDate);
    }
         public static Month enummonth(int month){
        switch (month) {
        case 1:
            return Month.JANUARY;
            case 2:
                return Month.FEBRUARY;
            case 3:
                return Month.MARCH;
            case 4:
                return Month.APRIL;
            case 5:
                return Month.MAY;
            case 6:
                return Month.JUNE;
            case 7:
                return Month.JULY;
            case 8:
                return Month.AUGUST;
            case 9:
                return Month.SEPTEMBER;
            case 10:
                return Month.OCTOBER;
            case 11:
                return Month.NOVEMBER;
            case 12:
                return Month.DECEMBER;
        }
             return null;
         }}






