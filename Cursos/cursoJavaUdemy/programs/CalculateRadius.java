package programs;

import java.util.Scanner;

import utils.CalculateRadiusUtils;

public class CalculateRadius {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculateRadiusUtils calc = new CalculateRadiusUtils();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o valor do Raio:");
			double radius = sc.nextDouble();
			
			System.out.println(radius);
			System.out.println(calc.circunference(radius));
			System.out.println(calc.volume(radius));
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error: " + e);
		}
		
	}
	
}
