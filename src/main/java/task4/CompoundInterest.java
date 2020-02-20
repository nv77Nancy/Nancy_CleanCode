package task4;

import java.util.Scanner;

public class CompoundInterest {
	double principalAmount , rateOfInterest , timeInYears;
	
	@SuppressWarnings("resource")
	void getInput() {
		Scanner scanner = new Scanner(System.in);
		principalAmount=scanner.nextDouble();
		rateOfInterest=scanner.nextDouble();
		timeInYears=scanner.nextDouble();
	}
	
	double getResult() {
		return ((principalAmount*(Math.pow((1+(rateOfInterest/100)), timeInYears)))-principalAmount);
	}
}
