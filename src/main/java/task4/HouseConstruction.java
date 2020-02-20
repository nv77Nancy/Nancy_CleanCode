package task4;

public class HouseConstruction {

	double priceCalculation(String materialStandard , double areaOfHouse , boolean isFullyAutomated) {
		if(materialStandard.equals("High Standard") && isFullyAutomated==true) {
			return (areaOfHouse*2500.0);
		}
		else if(materialStandard.equals("High Standard") && isFullyAutomated==false) {
			return (areaOfHouse*1800.0);
		}
		else if(materialStandard.equals("Above Standard")) {
			return (areaOfHouse*1500.0);
		}
		else if(materialStandard.equals("Standard")) {
			return (areaOfHouse*1200.0);
		}
		else {
			return 0;
		}
	}
	
}
