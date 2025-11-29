package Chapter4_Condition;

import java.util.Scanner;

public class Chapter4_Ex8_DayOfMonth {
    static void main() {
        Scanner input = new Scanner(System.in);
        int month, year;

        System.out.print("Enter the month: ");
        month = input.nextInt();

        System.out.print("Enter the year: ");
        year = input.nextInt();

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Day of month: 30");
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Day of month: 29");
            } else {
                System.out.println("Day of month: 28");
            }
        }
        else{
                System.out.println("Day of month: 31");
            }
        }
    }
