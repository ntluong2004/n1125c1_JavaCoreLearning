package chapter9_one_dimentional_array;


public class Main3 {

    static void main() {
        int[] arr = new int[]{2, 4, 6};

        System.out.println(isEvenArray(arr) ? "Is odd array" : "is even array");


    }

    static boolean isEvenArray(int[] arr) {
        for (int j : arr) {
            if (j % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
