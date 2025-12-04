package chapter5_loop;

import java.util.Scanner;


public class Chapter5LoopEx13GreatestCommonDivisorAndLeastCommonMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("please enter two numbers greater than 0.");
            scanner.close();
            return;
        }

        System.out.println("Case 1 (Base Find Loop)");

        int uscln1 = 1; 
        int bscnn1 = 0;

        int minAB = Math.min(a, b);
        for (int i = minAB; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                uscln1 = i;
                break;
            }
        }

        int maxAB = Math.max(a, b);
        for (int i = maxAB; ; i++) {
            if (i % a == 0 && i % b == 0) {
                bscnn1 = i;
                break;
            }
        }

        System.out.println("USCLN (Case 1) of " + a + " and " + b + " is: " + uscln1);
        System.out.println("BSCNN (Case 1) of " + a + " and " + b + " is: " + bscnn1);


        System.out.println("Case 2");

        int uscln2 = 1;
        int bscnn2 = 0;

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (max % min == 0) {
            uscln2 = min;
        } else {
            for (int i = min / 2; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    uscln2 = i;
                    break;
                }
            }
        }

        for (int i = max; ; i += max) {
            if (i % min == 0) {
                bscnn2 = i;
                break;
            }
        }

        System.out.println("USCLN (Case 2)of " + a + " and " + b + " is: " + uscln2);
        System.out.println("BSCNN (Cách 2) os " + a + " and " + b + " is: " + bscnn2);

        scanner.close();
    }
}