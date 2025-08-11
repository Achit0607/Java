import java.util.Scanner;
class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        System.out.print("First Number : ");
        int num1 = input.nextInt();
        System.out.print("Second Number : ");
        int num2 = input.nextInt();
        int result = num1 & num2;
        System.out.println("Result is : " + result);

    }
}
