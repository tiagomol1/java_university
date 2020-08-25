package programs;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class notasAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Notas notas = new Notas();
		
		System.out.println("Digite as notas do 1º, 2º e 3º semestre: ");
		notas.n1 = sc.nextDouble();
		if(notas.n1 >30) {
			System.out.println("Digite a nota do 1º semestre corretamente (maximo 30):");
			notas.n1 = sc.nextDouble();
			System.out.println("Prossiga digitando a nota do 2º e 3º");
		}
		notas.n2 = sc.nextDouble();
		if(notas.n2 > 30) {
			System.out.println("Digite a nota do 2º semestre corretamente (maximo 30):");
			notas.n1 = sc.nextDouble();
			System.out.println("Prossiga digitando a nota do 2º e 3º");
		}
		if(notas.n3 > 30) {
			System.out.println("Digite a nota do 3º semestre corretamente (maximo 30):");
			notas.n1 = sc.nextDouble();
			System.out.println("Prossiga digitando a nota do 2º e 3º");
		}
		notas.n3 = sc.nextDouble();
		
		sc.close();
		
		System.out.println(notas.mediaFinal());
		
	}

}
