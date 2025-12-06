package chapter6_method;

import java.util.Scanner;

public class Chapter6MethodEx2 {


    static void main(String[] args) {

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

        System.out.println(revertNumber(n));
        System.out.println("n is a SymmetricalNumber: " + isSymmetricalNumber(n));
        System.out.println("n is a perfect square number: " + isPerfectSquare(n));
        System.out.println("n is a prime number: " + isPrimeNumber(n));
        System.out.println("Sum of even numbers from i to n: " + sumOfEvenNumber(n));
        System.out.println("Sum of prime numbers from i to n: " + sumOfPrimeNumber(n));
        System.out.println("Sum of square numbers from i to n: " + calculateTotalSquareDigits(n));


    }

    //    Question a
    static int revertNumber(int a) {
//        Case 1
        int revert = 0, donVi;
        while (a > 0) {
            revert = revert * 10 + a % 10;
            a = a / 10;
        }
        return revert;
    }

    //    question b
    static boolean isSymmetricalNumber(int n) {
        return (revertNumber(n) == n);
    }

    //    question c
    static boolean isPerfectSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    //    question d

    public static boolean isPrimeNumber(int n) {
        // 1. Trường hợp n <= 1
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //    question e
    static int sumOfEvenNumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {

            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    //    question f
    static int sumOfPrimeNumber(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    //    question g
    static int calculateTotalSquareDigits(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (isPerfectSquare(i)) {
                sum += i;
            }
        }
        return sum;
    }

}


