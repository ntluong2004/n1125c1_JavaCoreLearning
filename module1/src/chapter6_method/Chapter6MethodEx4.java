package chapter6_method;

import java.util.Scanner;

public class Chapter6MethodEx4 {
    static void main() {

        Scanner input = new Scanner(System.in);
        int a, b;
        do {
            System.out.println("Please enter a positive integer");
            a = input.nextInt();
            b = input.nextInt();

            if (a < 0 || b < 0) {
                System.out.print("ERROR: negative number, Please Enter again: ");
            }

        }
        while (a < 0 || b < 0);

        System.out.print("Greatest common divisor of a and b is: " + greatestCommonDivisor(a, b));
    }

    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max % min == 0) {
            return min;
        }

        for (int i = min / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 0;
    }
}


