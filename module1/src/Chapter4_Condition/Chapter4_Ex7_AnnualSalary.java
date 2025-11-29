package Chapter4_Condition;

import java.util.Scanner;

public class Chapter4_Ex7_AnnualSalary {
    void main(String [] args) {
        Scanner input = new Scanner(System.in);

        double basicSalary = 650000;
        int workingTimes;

        System.out.print("Enter your working time (month): ");
        workingTimes = input.nextInt();

        if (workingTimes < 12) {
            System.out.println("Your salary: " + (basicSalary*1.92));
        }
        else if (workingTimes < 36) {
            System.out.println("Your salary: " + (basicSalary*2.34));
        }
        else if (workingTimes < 60) {
            System.out.println("Your salary: " + (basicSalary*3));
        }
        else{
            System.out.println("Your salary: " + (basicSalary*4.5));
        }

    }
}
