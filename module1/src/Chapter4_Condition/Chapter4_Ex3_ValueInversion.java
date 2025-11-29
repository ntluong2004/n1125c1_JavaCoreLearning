package Chapter4_Condition;

public class Chapter4_Ex3_ValueInversion {
    public static void main(String[] args) {

        int a = 3, b = 5, temp;
        System.out.printf("a and b value before invert a = %d  b = %d\n", a, b);

        temp = a;
        a = b;
        b = temp;

        System.out.printf("a and b value after invert a = %d, b = %d\n", a, b);

    }
}
