package chapter7_debug_string;

import util.Input;

import java.util.Scanner;

public class Ex1Fix {

    static void main() {
        int m;
        int n;

        do {
            n = Input.inputGreatThan("n", 0);
            m = Input.inputGreatThan("m", 0);

            if (n > m) {
                System.out.println("\u001b[31m" + "Err: m must be greater than n, please enter again: " + "\u001b[0m");
            }
        }
        while (n > m);
    }

}
