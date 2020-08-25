package com.cursoJava.poo;

import java.util.Scanner;

public class Conta {
	
	public static String nome;
	public static Double saldoConta;
	public static Scanner sc = new Scanner(System.in);
	
	static void opcoes() {
		
		System.out.println("Qual opera��o voc� quer realizar?");
		System.out.println("1 - Exibir Saldo");
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("0 - Sair");
		
		int opcao = sc.nextShort();
		
		opcaoSelecionada(opcao);
		
	}
	
	public static void opcaoSelecionada(int operacao) {	
		if(operacao == 1) {
			exibirSaldo();
		}else if(operacao == 2) {
				sacar();
			}else if(operacao == 3) {
					depositar();
				}else {
						return;
					}
	}
	
	
	static void exibirSaldo() {
		
		System.out.println(nome + ", seu saldo �: " + saldoConta);
		opcoes();
		
	}
	
	static void sacar() {
		
		System.out.println("Seu saldo �:" + saldoConta);
		System.out.println("Quanto voc� deseja sacar?");
		double valSaque = sc.nextDouble();
		
		saldoConta = saldoConta - valSaque;
		opcoes();
	
	}
	
	static void depositar() {
		System.out.println("Seu saldo �:" + saldoConta);
		System.out.println("Quanto voc� deseja depositar?");
		double valDep = sc.nextDouble();
		
		saldoConta = saldoConta + valDep;
		opcoes();
	}



}
