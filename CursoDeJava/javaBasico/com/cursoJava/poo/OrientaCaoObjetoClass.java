package com.cursoJava.poo;

public class OrientaCaoObjetoClass {
	
	public static void main(String[] args) {
		
		OrientaCaoObjeto pitbull = new OrientaCaoObjeto();
		
		pitbull.raça = "Pit Bull";
		pitbull.tamanho = 40;
		pitbull.latir();
		
		OrientaCaoObjeto viralata = new OrientaCaoObjeto();
		viralata.raça = "Vira-Lata";
		viralata.tamanho = 30;
		viralata.latir();
		
	}

}
