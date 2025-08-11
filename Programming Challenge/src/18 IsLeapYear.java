import java.util.Scanner;

class IsLeapYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year to check whether it is leap year or not : ");
        int year = input.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a Leap Year");
        } else{
            System.out.println(year + " is not a Leap Year");
        }
    }
}