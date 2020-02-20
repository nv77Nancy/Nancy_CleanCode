package task4;

import java.util.Scanner;

public class SimpleInterest {
	double principalAmount , rateOfInterest , timeInYears;
	
	@SuppressWarnings("resource")
	void getInput() {
		Scanner scanner = new Scanner(System.in);
		principalAmount=scanner.nextDouble();
		rateOfInterest=scanner.nextDouble();
		timeInYears=scanner.nextDouble();
	}
	
	double getResult() {
		return ((principalAmount/100)*rateOfInterest*timeInYears);
	}
}
