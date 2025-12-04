package chapter5_loop;

import java.util.Scanner;

public class Chapter5LoopEx3PrintNegativeEvenNumber {
    static void main() {
        Scanner input = new Scanner(System.in);

//        Declare distance and count variable
        int distance = 2, count = 0, n;

//        do-while loop require user enter again when number wrong type (n<0), not a number
        do {
            System.out.print("Enter n number (n<0): ");
            n = input.nextInt();

            if (n < 0) {
                System.out.println("\u001b[31m]" + "Err: n<0 please enter again!!!" + "\u001b[0m]");
            }
        }
        while (n < 0);

        int i = 2;

//        while loop process to print even number with negative number when count = distance = 2.
        while (i <= n) {
            count++;
            if (count == distance) {
                count = 0;
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
            i += 2;
        }
    }
}
