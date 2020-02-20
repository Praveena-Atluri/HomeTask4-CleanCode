package Epam.houseConstruction;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ConstructionCost {
public void constructionCost(int choice, int totalarea) {
		
		switch(choice) {
		case 1:standard(totalarea);
		      break;
		case 2:aboveStandard(totalarea);
		      break;
		case 3:highlyStandard(totalarea);
		      break;
		case 4:fullyAutomated(totalarea);
              break;
		}
	}
    private void standard(int totalarea) {
   
	PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("Total construction cost: "+ 1200*totalarea);
		
	}

	private void aboveStandard(int totalarea) {
		
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("Total construction cost: "+ 1500*totalarea);
		 
	}

	private void highlyStandard(int totalarea) {
		
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("Total construction cost:"+ 1800*totalarea);
		
	}

	private void fullyAutomated(int totalarea) {
		
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("Total construction cost: "+ 2500*totalarea);
		
	}

}
