package chapter9_one_dimentional_array;

import java.util.Scanner;

public class Chapter9Ex3 {

    static Scanner input = new Scanner(System.in);

    static void main() {

        System.out.print("Enter the number of employees.: ");
        int n = input.nextInt();
        input.nextLine();

        String[] name = new String[n];
        int[] age = new int[n];
        String[] gender = new String[n];
        double[] salary = new double[n];
        double[] averagePoints = new double[n];

        Chapter9Ex2.importEmployee(n, name, age, gender, salary, averagePoints);
        exportHighestEmployee(averagePoints, highestEmployee(averagePoints), name, age, gender, salary, averagePoints);

        String nameToFind = input.nextLine();
        printEmployee(findEmployeeByName(nameToFind, name), name, age, gender, salary, averagePoints);
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

    public static void exportHighestEmployee(double[] averagePoint1, double maxPoint, String[] name, int[] age, String[] gender, double[] salary, double[] averagePoints) {
        for (int i = 0; i < averagePoint1.length; i++) {
            if (averagePoints[i] == maxPoint) {
                System.out.print("Employee have highest average point is: ");
                System.out.println("Employee number " + (i + 1));
                System.out.println("Name: " + name[i]);
                System.out.println("Age: " + age[i]);
                System.out.println("Gender: " + gender[i]);
                System.out.println("Salary: " + salary[i]);
                System.out.println("average points: " + averagePoints[i]);
            }
        }
    }

    public static int findEmployeeByName(String input, String[] name) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(input)) {
                return i;
            }
        }
        return 0;
    }

    public static void printEmployee(int index, String[] name, int[] age, String[] gender, double[] salary, double[] averagePoints)
    {
        if (index < 0) {
            System.out.println("Chỉ mục nhân viên không hợp lệ!")
            return;
        }
        System.out.println("Name: " + name[index]);
        System.out.println("Age: " + age[index]);
        System.out.println("Gender: " + gender[index]);
        System.out.println("Salary: " + salary[index]);
        System.out.println("average points: " + averagePoints[index]);
    }

    }
}
