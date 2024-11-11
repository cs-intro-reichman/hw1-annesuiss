// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// define the input.
		String currentValueString = args[0];
		String rateString = args[1];
		String nString = args[2];
		String dollar = "$";
		// convert
		int currentValue = Integer.parseInt(currentValueString);
		double rate = Double.parseDouble(rateString);
		double ratePercent = rate/100 ;
		int n = Integer.parseInt(nString);
		// create an equesion.
		Double futureValue = currentValue * Math.pow((1+ratePercent),n);
		//tried to cast didnt work also checked gpt says to Math.round.
		// print and casting int futureValue
		System.out.println("After " + nString + " years, " + dollar + currentValue + 
		                  " saved at " + rate + "%" +" will yield " + dollar +
						   Math.round(futureValue) + " future Value");



	}
}