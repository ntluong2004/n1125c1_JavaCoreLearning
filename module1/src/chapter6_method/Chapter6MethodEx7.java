package chapter6_method;

import java.util.Scanner;

public class Chapter6MethodEx7 {


    // Emp 1
    public static String name1;
    public static String gender1;
    public static double salary1;
    public static double averagePoints1;

    // Emp 2
    public static String name2;
    public static String gender2;
    public static double salary2;
    public static double averagePoints2;


    // Emp 3
    public static String name3;
    public static String gender3;
    public static double salary3;
    public static double averagePoints3;


    // Emp 4
    public static String name4;
    public static String gender4;
    public static double salary4;
    public static double averagePoints4;


    // Emp 5
    public static String name5;
    public static String gender5;
    public static double salary5;
    public static double averagePoints5;


    public static void inputEmployee1(Scanner scanner) {
        System.out.println("---Enter employee 1 info---");
        System.out.print("Full name 1: ");
        name1 = scanner.nextLine();
        System.out.print("Gender: ");
        gender1 = scanner.nextLine();
        System.out.print("Salary: ");
        salary1 = scanner.nextDouble();
        System.out.print("Average Points: ");
        averagePoints1 = scanner.nextDouble();
    }

    public static void inputEmployee2(Scanner scanner) {
        System.out.println("---Enter employee 2 info---");
        System.out.print("Full name 2: ");
        name2 = scanner.nextLine();
        System.out.print("Gender: ");
        gender2 = scanner.nextLine();
        System.out.print("Salary: ");
        salary2 = scanner.nextDouble();
        System.out.print("Average Points: ");
        averagePoints2 = scanner.nextDouble();

    }

    public static void inputEmployee3(Scanner scanner) {
        System.out.println("---Enter employee 3 info---");
        System.out.print("Full name 3: ");
        name3 = scanner.nextLine();
        System.out.print("Gender: ");
        gender3 = scanner.nextLine();
        System.out.print("Salary: ");
        salary3 = scanner.nextDouble();
        System.out.print("Average Points: ");
        averagePoints3 = scanner.nextDouble();
    }

    public static void inputEmployee4(Scanner scanner) {
        System.out.println("---Enter employee 4 info---");
        System.out.print("Full name 4: ");
        name4 = scanner.nextLine();
        System.out.print("Gender: ");
        gender4 = scanner.nextLine();
        System.out.print("Salary: ");
        salary4 = scanner.nextDouble();
        System.out.print("Average Points: ");
        averagePoints4 = scanner.nextDouble();
    }

    public static void inputEmployee5(Scanner scanner) {
        System.out.println("---Enter employee 5 info---");
        System.out.print("Full name 5: ");
        name5 = scanner.nextLine();
        System.out.print("Gender: ");
        gender5 = scanner.nextLine();
        System.out.print("Salary: ");
        salary5 = scanner.nextDouble();
        System.out.print("Average Points: ");
        averagePoints5 = scanner.nextDouble();
    }


    public static void printEmployee1() {
        System.out.println("[EMPLOYEE 1]");
        System.out.println("Full name: " + name1);
        System.out.println("Gender: " + gender1);
        System.out.println("Salary: " + salary1);
        System.out.println("Average Points: " + averagePoints1);
    }

    public static void printEmployee2() {
        System.out.println("[EMPLOYEE 2]");
        System.out.println("Full name: " + name2);
        System.out.println("Gender: " + gender2);
        System.out.println("Salary: " + salary2);
        System.out.println("Average Points: " + averagePoints2);
    }

    public static void printEmployee3() {
        System.out.println("[EMPLOYEE 3]");
        System.out.println("Full name: " + name3);
        System.out.println("Gender: " + gender3);
        System.out.println("Salary: " + salary3);
        System.out.println("Average Points: " + averagePoints3);
    }

    public static void printEmployee4() {
        System.out.println("[EMPLOYEE 4]");
        System.out.println("Full name: " + name4);
        System.out.println("Gender: " + gender4);
        System.out.println("Salary: " + salary4);
        System.out.println("Average Points: " + averagePoints4);
    }

    public static void printEmployee5() {
        System.out.println("[EMPLOYEE 5]");
        System.out.println("Full name: " + name5);
        System.out.println("Gender: " + gender5);
        System.out.println("Salary: " + salary5);
        System.out.println("Average Points: " + averagePoints5);

    }


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Please enter n 1-5");
            n = scanner.nextInt();

            if (n > 5 || n < 1) {
                System.out.print("ERROR: Please Enter n again: ");
            }

        }
        while (n < 1 || n > 5);


        System.out.println("*** Start to enter information ***");
        if (n == 1) {
            inputEmployee1(scanner);
        }
        if (n == 2) {
            inputEmployee1(scanner);
            inputEmployee2(scanner);

        }
        if (n == 3) {
            inputEmployee1(scanner);
            inputEmployee2(scanner);
            inputEmployee3(scanner);
        }
        if (n == 4) {
            inputEmployee1(scanner);
            inputEmployee2(scanner);
            inputEmployee3(scanner);
            inputEmployee4(scanner);
        }
        if (n == 5) {
            inputEmployee1(scanner);
            inputEmployee2(scanner);
            inputEmployee3(scanner);
            inputEmployee4(scanner);
            inputEmployee5(scanner);
        };
        System.out.println("*** Start to print information ***");

        switch (n) {
            case 1:
                printEmployee1();
                break;
            case 2:
                printEmployee1();
                printEmployee2();
                break;
            case 3:
                printEmployee1();
                printEmployee2();
                printEmployee3();
                break;
            case 4:
                printEmployee1();
                printEmployee2();
                printEmployee3();
                printEmployee4();
                break;
            case 5:
                printEmployee1();
                printEmployee2();
                printEmployee3();
                printEmployee4();
                printEmployee5();
        }
    }
}


