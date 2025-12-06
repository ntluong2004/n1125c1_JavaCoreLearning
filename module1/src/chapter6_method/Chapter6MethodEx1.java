package chapter6_method;

import static java.lang.Math.sqrt;

public class Chapter6MethodEx1 {

    //    question a
    static char convert(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return ch;
        }
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return ch;
    }

    //    question b
    static void FirstDegreeEquation(int a, int b) {
        double result;
        if (a == 0 && b != 0) {
            System.out.println("Inconsistent Values");
        } else if (a == 0 && b == 0) {
            System.out.println("Equation with infinitely mani solutions");
        } else {
            result = (double) -b / a;
            System.out.println("The first degree equation result is: " + result);
        }
    }

    //    question c
    static void SecondDegreeEquation(int a, int b, int c) {
        double delta;
        if (a == 0) {
            FirstDegreeEquation(b, c);
            return; /*--nên dùng return tại vị trí này và bỏ else ở dưới => giảm số lượng if-else--*/
        } /*else {*/
        delta = b * b - 4 * a * c;
        System.out.println("Delta: " + delta);

        if (delta < 0) {
            System.out.println("Meaningless");
        } else if (delta == 0) {
            System.out.println("Equation has exactly one solution: " + ((double) -b / 2 * a));
        } else {
            System.out.println("Equation have 2 distinct solutions");
            System.out.println("x1 = " + (((double) -b - sqrt(delta)) / (2 * a)));
            System.out.println("x2 = " + (((double) -b + sqrt(delta)) / (2 * a)));
        }
    }

    //    question d
    static int minValue(int a, int b, int c, int d) {
        int max;
        max = Math.max(a, b);
        max = Math.max(max, c);
        max = Math.max(max, d);
        return max;
    }


    static void main(String[] args) {

        System.out.println(convert('A'));
        System.out.println();
        FirstDegreeEquation(2, 3);
        System.out.println();
        SecondDegreeEquation(2, 3, 4);
        System.out.println();
        System.out.println(minValue(2, 3, 4, 5));
    }
}


