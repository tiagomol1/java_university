import java.util.Scanner;

public class Aritmetica{
	
	public static void main(String[] args){
		Scanner entradaDeDados = new Scanner(System.in);
		int n1, n2, soma;
		
		System.out.print("Informe o PRIMEIRO numero INTEIRO:");
		n1 = entradaDeDados.nextInt();
		
		System.out.print("Informe o SEGUNDO numero INTEIRO:");
		n2 = entradaDeDados.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("Soma: "+ soma);
		
	}
	
}