package programs;

import java.util.Scanner;

import utils.DollarConverUtils;

public class dollarExercise {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			DollarConverUtils convert = new DollarConverUtils();
			
			System.out.println("Whats is the dollar price?");
			double dollar = sc.nextDouble();
			
			System.out.println("How many dollar will be bought?");
			double quantity = sc.nextDouble();
			
			System.out.println(convert.convertDollar(dollar, quantity));
									
		}catch(Exception e) {
			System.out.println("error> " + e);
		}
		
				
		
	}
}
