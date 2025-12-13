package chapter10_one_dimentional_array_section2;

public class Chapter10Ex3 {
    private static final int N = 5;

    private static String[] names = new String[N];
    private static int[] ages = new int[N];
    private static String[] genders = new String[N];
    private static double[] salaries = new double[N];
    private static double[] averagePoints = new double[N];

    static void main() {
        data();
        sortEmployeesByAge();

        System.out.println("\n EMPLOYEES SORTED BY AGE");
        displayEmployees();
    }

    private static void data() {
        names = new String[]{"An", "Binh", "Chau", "Dung", "Thanh"};
        ages = new int[]{35, 22, 41, 28, 30};
        genders = new String[]{"Nam", "Nữ", "Nam", "Nữ", "Nam"};
        salaries = new double[]{800, 550, 950, 600, 700};
        averagePoints = new double[]{7, 3, 6, 7, 10};

        System.out.println("INITIAL DATA");
        displayEmployees();
    }

    private static void displayEmployees() {
        for (int i = 0; i < N; i++) {
            System.out.printf("%-10s | %-5d | %-10s | %-10.1f | %-5.1f\n",
                    names[i], ages[i], genders[i], salaries[i], averagePoints[i]);
        }
        System.out.println();
    }


    public static void sortEmployeesByAge() {

        for (int i = 0; i < N - 1; i++) {

            for (int j = i + 1; j < N; j++) {

                if (ages[i] > ages[j]) {
                    swap(ages, i, j);
                    swap(names, i, j);
                    swap(genders, i, j);
                    swap(salaries, i, j);
                    swap(averagePoints, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Hoán vị cho mảng chuỗi (String[])
    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Hoán vị cho mảng số thực (double[])
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
