package chapter6_method;

import java.util.Scanner;

public class Chapter6MethodEx3 {
    static void main() {

        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("Please enter a positive integer");
            n = input.nextInt();

            if (n < 0) {
                System.out.print("ERROR: negative number, Please Enter again: ");
            }

        }
        while (n < 0);

        System.out.println("1 + 2 + … + n: " + sum(n));
        System.out.println("1^2 + 2^2 + … + n^2: " + sumOfSquareNumber(n));
        System.out.println("1 + 1/2 + … + 1/n: " + sumOfHalfNumber(n));
        System.out.println("1 * 2 * … * n: " + factorial(n));
        System.out.println("1! + 2! + … + n!: " + sumOfFactorial(n));
    }

    //    Method return sum from 1 to n
    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //    b, method return sum with square number from 1 to n
    static int sumOfSquareNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    //    c,
    static double sumOfHalfNumber(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double) 1/i;
        }
        return sum;
    }

    //    d,
    static int factorial(int n) {
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul *= i;
        }
        return mul;
    }

    //    e,
    static int sumOfFactorial(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }
}


