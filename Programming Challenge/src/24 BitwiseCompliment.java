import java.util.Scanner;
class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to see it's compliment : ");
        int num = input.nextInt();
        int result = ~num;
        System.out.println("Your result is : " + result);
    }
}
