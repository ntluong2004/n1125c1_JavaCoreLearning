package util;

public class IntArrayExport {
    static void arrayExport(int[] arr) {
        for (int j : arr) {
            System.out.printf("arr[%d]: ", arr[j]);
        }
    }
}
