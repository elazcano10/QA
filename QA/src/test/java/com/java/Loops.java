package com.java;

public class Loops {

	public static void main(String[] args) {
		
		// While
		int numero =1;
		
		System.out.println("Imprimiendo valores de un Ciclo While");
		
		while(numero<=10) {
			System.out.println("El numero es:" + numero);
			numero++;
		}
		
		System.out.println("##########################\n");
		
		System.out.println("Imprimiendo valores de un Ciclo Do While");
		// Do while
		int numero2 = 1;
		do {
			System.out.println("El numero es:" + numero2);
			numero2++;
		   }while(numero2<=10);
		
		
        System.out.println("##########################\n");
		
		System.out.println("Imprimiendo valores de un Ciclo For");	
		// FOR
		int numero3 = 10;
		
		for(int i=1; i<=numero3; i++) {
			System.out.println("El contador es:" + i);
		}

	}

}
