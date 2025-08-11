import java.util.Scanner;
class GradeCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks in percentage to calculate you Grade : ");
        float marks = input.nextFloat();
        if(marks >= 90){
            System.out.println("For " + marks + "% your Grade is A");
        } else if (marks >= 75) {
            System.out.println("For " + marks + "% your Grade is B");
        } else if (marks >= 60) {
            System.out.println("For " + marks + "% your Grade is C");
        } else if (marks >=30) {
            System.out.println("For " + marks + "% your Grade is D");
        } else{
            System.out.println("For " + marks + "% your Grade is F");
        }
    }
}
