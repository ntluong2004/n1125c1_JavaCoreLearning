package chapter9_one_dimentional_array;

import java.util.Scanner;

public class Chapter9Ex2 {

    static Scanner input = new Scanner(System.in);

    static void main() {

        System.out.print("Enter the number of employees: ");
        int n = input.nextInt();
        input.nextLine();

        String[] name = new String[n];
        int[] age = new int[n];
        String[] gender = new String[n];
        double[] salary = new double[n];
        double[] averagePoints = new double[n];

        importEmployee(n, name, age, gender, salary, averagePoints);

        int index = input.nextInt();
        exportEmployee(index, name, age, gender, salary, averagePoints);
    }

    public static void importEmployee(int n, String[] name, int[] age, String[] gender, double[] salary, double[] averagePoints) {
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

    public static void exportEmployee(int n, String[] name, int[] age, String[] gender, double[] salary, double[] averagePoints) {
        System.out.println("EMPLOYEE LIST" + "\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Employee number " + (i + 1));
            System.out.println("Name: " + name[i]);
            System.out.println("Age: " + age[i]);
            System.out.println("Gender: " + gender[i]);
            System.out.println("Salary: " + salary[i]);
            System.out.println("average points: " + averagePoints[i]);
        }
        System.out.println();
    }
}
