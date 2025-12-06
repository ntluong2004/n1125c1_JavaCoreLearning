package chapter6_method;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Chapter6MethodEx6 {

    public static String fullName;
    public static String gender;
    public static int old;
    public static double baseSalary;
    public static double averagePoints;

    public static void employeeManager() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter employee information");

        System.out.print("Full Name: ");
        fullName = input.nextLine();

        System.out.print("Gender: ");
        gender = input.nextLine();

        System.out.print("Old: ");
        old = input.nextInt();

        System.out.print("Base Salary: ");
        baseSalary = input.nextDouble();

        System.out.print("averagePoints Salary: ");
        averagePoints = input.nextDouble();
        input.close();
    }

    public static void printEmployeeInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Gender: " + gender);
        System.out.println("Old: " + old);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Average: " + averagePoints);
    }

    static void main(String[] args) {
        employeeManager();
        printEmployeeInfo();
    }
}


