package chapter5_loop;

import java.util.Scanner;


public class Chapter5LoopEx11SumOfFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n (n > 0): ");
        int n = scanner.nextInt();

//  Case 1
//
//        if (n <= 0) {
//            System.out.println("Please enter a positive integer");
//            return;
//        }
//
//        double S = 0.0;
//
//        for (int i = 1; i <= n; i++) {
//            int k = 2 * i - 1;
//            long fact = 1;
//
//            for (int j = 1; j <= k; j++) {
//                fact *= j;
//            }
//
//            S += 1.0 / fact;
//        }
//
//        System.out.println("Sum S with n = " + n + " is " + S);
//
//        scanner.close();

//        case 2

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        double S = 0.0;
        long fact = 1;

        for (int i = 1; i <= n; i++) {

            S += 1.0 / fact;

            int firstNumber = 2 * i;
            int secondNumber = 2 * i + 1;

            fact = fact * firstNumber * secondNumber;
        }
        System.out.println("Sum S = 1 + 1/3! + ... + 1/(2n-1)! with n = " + n + " is " + S);

        scanner.close();
    }
}
