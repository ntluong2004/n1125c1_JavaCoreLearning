package chapter4_condition;

import java.util.Scanner;

public class Chapter4Ex11FindNextDay {

    public static int checkDayOfMonth(int month, int year) {

        int dayofmonth;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayofmonth = 30;
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                dayofmonth = 29;
            } else {
                dayofmonth = 28;
            }
        } else {
            dayofmonth = 31;
        }
        ;
        return dayofmonth;
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        int day, month, year;

        System.out.println("enter the day");
        day = input.nextInt();

        System.out.println("enter the month");
        month = input.nextInt();

        System.out.println("enter the year");
        year = input.nextInt();

        if (day > 0 && day <= 31 && month > 0 && month <= 12 && year > 1900 && year <= 2025) {
            if (day > checkDayOfMonth(month, year)) {
                System.out.println("err: invalid date");
            } else {
                if (++day > checkDayOfMonth(month, year)) {

                    System.out.println("The next day is: 1/" + (++month) + "/" + year);

                }
            }

            System.out.println("The next day is " + (++day) + "/" + month + "/" + year);


        } else {
            System.out.println("err: invalid date");
        }
    }
}
