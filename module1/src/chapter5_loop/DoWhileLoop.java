package chapter5_loop;

import java.util.Scanner;

public class DoWhileLoop {
    static void main() {

        Scanner input = new Scanner(System.in);
        double score;

        do {
            System.out.print("Enter your score: ");
            score = input.nextDouble();

            if (score < 0 || score > 10) {
                System.out.println("\u001b[31m" + "Err: score is invalid, please enter a number between 0 and 10" + "\u001b[0m");
            }
        }
        while (score < 0 || score > 10);

        System.out.println("Your score is " + score);
    }
}
