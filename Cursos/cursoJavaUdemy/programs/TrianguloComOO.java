package programs;

import java.util.Scanner;

import entities.Triangulo;

public class TrianguloComOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();		
		
		double areaX = x.area();
		double areaY = x.area();
		
		System.out.printf("Triangle X  area: %.4f%", areaX);
		System.out.printf("Triangle Y  area: %.4f%", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area X");
		}else {
			System.out.println("Larger area Y");			
		}
		
		sc.close();
		
	}

}
