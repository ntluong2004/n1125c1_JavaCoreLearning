package chapter5_loop;

import java.util.Scanner;

public class Chapter5LoopEx9PrintListNegativeNumbers {
    static void main() {
        Scanner input = new Scanner(System.in);
        double n;
//        Declare distance and count variable
//        do-while loop require user enter again when number wrong type (n<0), not a number
        do {
            System.out.print("Enter n number (n<0): ");
            n = input.nextInt();

            if (n < 0) {
                System.out.println("\u001b[31m]" + "Err: n<0 please enter again!!!" + "\u001b[0m]");
            }
        }
        while (n < 0);


        int i = 1, mark = 1;
        while (i <= n) {
            System.out.print((i*mark) + " ");

            i = i * 2 + 1;
            mark = -mark;
        }
    }
}
