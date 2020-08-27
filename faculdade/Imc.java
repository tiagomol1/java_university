import java.util.Scanner;

public class Imc{
	public static void main (String[] args){
		Scanner entradaDeDados = new Scanner(System.in);
		double altura, imc;
		int peso;
		
		System.out.print("Informe sua altura: ");
		altura = entradaDeDados.nextDouble();
		System.out.print("Informe seu peso: ");
		peso = entradaDeDados.nextInt();
		imc = peso / (altura * altura);
		
		if(imc < 18.5){
			System.out.println("Voce esta abaixo do peso");
		}else if(imc > 18.4 && imc < 25){
				System.out.println("Voce esta com peso normal");
			}else if(imc > 24.9 && imc < 30){
					System.out.println("Voce esta com sobrepeso");
				}else{
						System.out.println("Voce esta obeso");
					}
		System.out.println("Seu imc: " + imc);
	}
}