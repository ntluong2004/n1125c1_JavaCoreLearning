package chapter6_method;

public class demo1 {
    static void main(String[] args) {
        sayHi("Thien");
        sayHi("Truong");
        sayHi("Luong");
    }

    static void sayHi(String say) {
        System.out.println("Hello " + say);
    }
}
