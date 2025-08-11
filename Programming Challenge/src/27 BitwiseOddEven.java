import java.util.Scanner;
class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Even or Odd Calculator using Bitwise Operator");
        System.out.print("Enter number : ");
        int num = input.nextInt();
        if((num & 1) == 1){
            System.out.println(num + " is ODD");
        }else{
            System.out.println(num + " is EVEN");
        }
    }
}
