package task4;

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		double simpleInterestResult=0.0,compoundInterestResult=0.0,houseConstructionEstimate=0.0;
		
		SimpleInterest simpleInterest = new SimpleInterest();
		CompoundInterest compoundInterest = new CompoundInterest();
		HouseConstruction houseConstruction = new HouseConstruction();
		
		simpleInterest.getInput();
		simpleInterestResult=simpleInterest.getResult();
		
		compoundInterest.getInput();
		compoundInterestResult=compoundInterest.getResult();
		
		houseConstructionEstimate=houseConstruction.priceCalculation("High Standard", 500.0, true);
		houseConstructionEstimate=houseConstruction.priceCalculation("Standard", 780.0, false);
		
	}

}
