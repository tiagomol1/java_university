package programs;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class stockProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data.");
		System.out.print("Name: ");
		String name = sc.nextLine();		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);
		
		System.out.println("Product data: " + product);
		boolean next = true;
		while(next == true) {
				
			System.out.println("Which operation do you want to perform? \r\n" 
				+ " 1 - Add \r\n"
				+ " 2 - Remove \r\n"
				+ " 3 - Close");
			int option = sc.nextInt();
			
			if(option == 1) {
				System.out.print("Quantity to add: ");
				quantity = sc.nextInt();
				product.addProducts(quantity);
				System.out.println("Updated data: " + product);
			}else if(option == 2) {
					System.out.print("Quantity to remove: ");
					quantity = sc.nextInt();
					product.removeProducts(quantity);
					System.out.println("Updated data: " + product);
				}else {
						next = false;
					}
					
		}
		
		sc.close();
		return;
		
	}

}
