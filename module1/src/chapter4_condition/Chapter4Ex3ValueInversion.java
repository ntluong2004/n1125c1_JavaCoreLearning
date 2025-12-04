package chapter4_condition;

public class Chapter4Ex3ValueInversion {
    public static void main(String[] args) {

        int a = 3, b = 5, temp;
        System.out.printf("a and b value before invert a = %d  b = %d\n", a, b);

        temp = a;
        a = b;
        b = temp;

        System.out.printf("a and b value after invert a = %d, b = %d\n", a, b);

    }
}
