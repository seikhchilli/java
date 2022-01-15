import java.util.Scanner;

public class SimpleInterestCalculator{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        int principal = in.nextInt();
        
        System.out.print("Enter interest rate: ");
        double rate = in.nextDouble();

        System.out.print("Enter time: ");
        int time = in.nextInt();

        double simpleInterest = (principal * rate * time)/ 100;

        System.out.println("Simple Interest: " + simpleInterest);

        in.close();

    }
}
