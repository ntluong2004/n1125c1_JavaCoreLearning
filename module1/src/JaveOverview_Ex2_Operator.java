
static void main() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int a = sc.nextInt();

    System.out.print("Enter a number: ");
    int b = sc.nextInt();

    int sum=a+b, sub=a-b, mul=a*b, div=a/b;
    System.out.println("Sum of a and b: " + sum);
    System.out.println("Difference of a and b: " + sub);
    System.out.println("Product of a and b: " + mul);
    System.out.println("Quotient of a and b: " + div);

}