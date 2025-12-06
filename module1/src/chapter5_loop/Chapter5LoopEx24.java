package chapter5_loop;

import java.util.Scanner;


public class Chapter5LoopEx24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product price: ");
        int giaSanPham = scanner.nextInt();
        System.out.print("Enter b: ");
        int tienKhachDua = scanner.nextInt();

        if (giaSanPham <= 0 || tienKhachDua <= 0) {
            System.out.println("please enter two numbers greater than 0.");
            scanner.close();
            return;
        }

        int thoiLai = tienKhachDua - giaSanPham;
        int donVi;
        int temp;
        for (int i = 3; i >= 1; i--) {
            donVi = (int) Math.pow(10, i);

            temp = 500 * donVi;
            if (thoiLai >= temp) {
                System.out.println("Can " + (thoiLai / (temp)) + " to tien " + temp);
                thoiLai = thoiLai % temp;
            }

            temp = 200 * donVi;
            if (thoiLai >= temp) {
                System.out.println("Can " + (thoiLai / temp) + " to tien " + temp);
                thoiLai = thoiLai % temp;
            }

            temp = 100 * donVi;
            if (thoiLai >= temp) {
                System.out.println("Can " + (thoiLai / temp) + " to tien " + temp);
                thoiLai = thoiLai % temp;
            }
        }
    }
}