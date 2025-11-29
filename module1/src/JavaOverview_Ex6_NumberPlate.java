import java.util.Scanner;

public class JavaOverview_Ex6_NumberPlate {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int NumberPlate;

        System.out.println("Please enter the number plate: ");
        int numberPlate1 = input.nextInt();
        int numberPlate2 = input.nextInt();
        int numberPlate3 = input.nextInt();
        int numberPlate4 = input.nextInt();
        int numberPlate5 = input.nextInt();

        int platePoints = (numberPlate1 + numberPlate2 + numberPlate3 + numberPlate4 + numberPlate5) %10;
        System.out.println("The points of the licence plate are: " +  platePoints);

    }
}
