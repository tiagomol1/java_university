package utils;

public class DollarConverUtils {

	public double convertDollar(double dollar, double quantity) {
		double totalDollar = dollar * quantity;
		double dollarMoreImpost = totalDollar * 0.06;
		return totalDollar + dollarMoreImpost;
	}
	
}
