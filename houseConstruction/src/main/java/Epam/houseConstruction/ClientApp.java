package Epam.houseConstruction;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class ClientApp {
	public static void main(String[] args) {
		String query;
		
		Scanner scannerobject=new Scanner(System.in);
		
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		do {
		myOutput.print("\t Welcome\n  Please enter your choice:\n1:Standard Materials\n2:AboveStandard Materials\n3:HighlyStandard Materials\n4:FullyAutomated  ");
		int choice=scannerobject.nextInt();		
		myOutput.print("\nEnter total area of house in square feet:  ");
		int totalArea=scannerobject.nextInt();
		
ConstructionCost constructionCostObj=new ConstructionCost();		
		
constructionCostObj.constructionCost(choice,totalArea);
myOutput.print("\n\nPress 'stop' to exit or anything to continue : ");
query = scannerobject.next();
		}while(!query.equals("stop"));
		myOutput.print("\nThankyou!  :)");
  }
}
