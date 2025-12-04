package chapter4_condition;

import java.util.Scanner;

public class Chapter4Ex4MaxMinNumber {
    static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Please enter a number: ");
        a = input.nextInt();

        System.out.print("Please enter b number: ");
        b = input.nextInt();

//        use if-else
        System.out.print("Use if-else: ");
        if (a > b) {
            System.out.println("max=" + a + " min=" + b);
        } else {
            System.out.println("max=" + b + " min=" + a);
        }

//  use ternary operator
        System.out.print("Use ternary operator: ");
        String result = a > b ? "max =" + a + " min =" + b : "max = " + b + " min = " + a;
        System.out.println(result);
    }
}
