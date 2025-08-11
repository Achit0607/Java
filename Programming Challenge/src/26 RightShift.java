import java.util.Scanner;
class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to see it's Right Shift : ");
        int num = input.nextInt();
        int result = num >> 1;
        System.out.println("Your result is : " + result);
    }
}
