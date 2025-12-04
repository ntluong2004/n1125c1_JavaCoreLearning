package chapter4_condition;

public class Chapter4Ex1BooleanValue {
    static void main(String[] args) {

        boolean a = true && false; //false
        boolean b = (3 > 100) || (25 % 5 == 0); //true
        boolean c = a && b; //false
        boolean d = !a || b; //true

        System.out.println("c result: " + c);
        System.out.println("d result: " + d);
    }
}
