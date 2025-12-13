package chapter9_one_dimentional_array;

import java.util.Scanner;

public class Chapter9Ex3 {

    static Scanner input = new Scanner(System.in);
    static int n;
    static String[] name = new String[n];
    static int[] age = new int[n];
    static String[] gender = new String[n];
    static double[] salary = new double[n];
    static double[] averagePoints = new double[n];

    static void main() {
//
        System.out.print("Enter the number of employees.: ");
        n = input.nextInt();

        name = new String[n];
        age = new int[n];
        gender = new String[n];
        salary = new double[n];
        averagePoints = new double[n];

        input.nextLine();


        importEmployee(n);
        exportHighestEmployee(highestEmployee(averagePoints));

        System.out.print("Enter employee name to find: ");
        String nameToFind = input.nextLine();
        printEmployee(findEmployeeByName(nameToFind));
    }

    public static double highestEmployee(double[] averagePoints) {
        double maxPoint = averagePoints[0];
        for (int i = 1; i < averagePoints.length; i++) {
            if (averagePoints[i] > maxPoint) {
                maxPoint = averagePoints[i];
            }
        }
        return maxPoint;
    }

    public static void exportHighestEmployee(double maxPoint) {
        for (int i = 0; i < averagePoints.length; i++) {
            if (averagePoints[i] == maxPoint) {
                printEmployee(i);
            }
        }
    }

    public static int findEmployeeByName(String input) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(input)) {
                return i;
            }
        }
        return 0;
    }

    public static void printEmployee(int index) {
        if (index < 0) {
            System.out.println("Chỉ mục nhân viên không hợp lệ!");
            return;
        }
        System.out.println("EMPLOYEE: " + (index + 1));
        System.out.println("Name: " + name[index]);
        System.out.println("Age: " + age[index]);
        System.out.println("Gender: " + gender[index]);
        System.out.println("Salary: " + salary[index]);
        System.out.println("average points: " + averagePoints[index]);
    }

    public static void importEmployee(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("enter information for employee number: " + (i + 1));

            System.out.print("Name: ");
            name[i] = input.nextLine();

            System.out.print("Age: ");
            age[i] = input.nextInt();
            input.nextLine();

            System.out.print("Gender: ");
            gender[i] = input.nextLine();

            System.out.print("Salary: ");
            salary[i] = input.nextDouble();
            input.nextLine();

            System.out.print("average points: ");
            averagePoints[i] = input.nextDouble();

            input.nextLine();

            System.out.println();
        }
    }
}

