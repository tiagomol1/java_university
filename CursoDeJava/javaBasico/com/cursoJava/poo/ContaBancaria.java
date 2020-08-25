package com.cursoJava.poo;


import java.util.Scanner;

public class ContaBancaria{
	

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args){

		sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		Conta.nome = sc.nextLine();
		
		System.out.println("Qual o seu saldo? ");
		Conta.saldoConta = sc.nextDouble();
		
		Conta.opcoes();
		
	}

}