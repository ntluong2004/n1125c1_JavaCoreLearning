package Chapter4_Condition;

public class Chapter4_Ex1_BooleanValue {
    static void main(String[] args) {

        boolean a = true && false; //false
        boolean b = (3 > 100) || (25 % 5 == 0); //true
        boolean c = a && b; //false
        boolean d = !a || b; //true

        System.out.println("c result: " + c);
        System.out.println("d result: " + d);
    }
}
