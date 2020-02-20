package Epam.interest;

import java.util.Scanner;
import java.io.PrintWriter;

public class ClientApp {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		
		double principleAmount, rateOfInterest,  time,interest=0;
        String query;
        int choice;
        scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        InterestCalculation calculator = new InterestCalculation();
        do {
            out.print("\nEnter Principle Amount,rate of interest, time period : ");
            out.flush();
            principleAmount = scanner.nextDouble();
            rateOfInterest  = scanner.nextDouble();
            time = scanner.nextDouble();
            out.print("\nEnter your choice :\n1.Simple Interest\n2.Compound Interest ");
            out.flush();
            choice = scanner.nextInt();
            if(choice == 1) {
                interest = calculator.simpleInterest(principleAmount, time, rateOfInterest);
                out.print("\nSimple Interest = " + interest);
            }
            else if(choice == 2) {
                interest = calculator.compoundInterest(principleAmount, time, rateOfInterest);
                out.print("\nCompound Interest = " + interest);
            }
            else {
                out.print("Please enter correct choice ");out.flush();
            }
           
            out.print("\nPress 'stop' to exit or anything to continue : ");
            out.flush();
            query = scanner.next();
        }while(!query.equals("stop"));
        out.print("\n\nThankyou! :)");
        out.flush();
    }
	}


