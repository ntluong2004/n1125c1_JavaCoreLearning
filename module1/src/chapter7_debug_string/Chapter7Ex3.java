package chapter7_debug_string;

import java.util.Scanner;

public class Chapter7Ex3 {
//So sánh hai chuỗi
//Đề bài
//Cho 2 chuỗi (String) a và b nhập vào từ bàn phím. Hãy so sánh chuỗi nào lớn hơn. (quan trọng)

    static void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string 1: ");
        String string1 = scanner.nextLine();

    System.out.print("Enter a string 2: ");
        String string2 = scanner.nextLine();

        System.out.println("Result: " + string1.compareToIgnoreCase(string2));

    }
}


