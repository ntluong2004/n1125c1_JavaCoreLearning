import java.util.Scanner;

    static void main() {
        double mathScore, physicScore, chemicalScore, mathWeight, physicWeight, chemicalWeight;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the math score and coefficient: ");
        mathScore = sc.nextDouble();
        mathWeight = sc.nextDouble();

        System.out.print("Enter the physic score and coefficient: ");
        physicScore = sc.nextDouble();
        physicWeight = sc.nextDouble();

        System.out.print("Enter the chemical score  and coefficient: ");
        chemicalScore = sc.nextDouble();
        chemicalWeight = sc.nextDouble();

        double totalWeight = mathWeight + physicWeight + chemicalWeight;
        double averageScore = (mathScore*mathWeight + physicScore*physicWeight + chemicalScore*chemicalWeight)/totalWeight;

        System.out.println("The average score is: " + averageScore);
    }