package com.java.metodos;

import javax.swing.JOptionPane;

public class NumeroVerificador {

	public static void main(String[] args) {
	 int a, b, c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er n�mero entero: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do n�mero entero: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 3er n�mero entero: "));			
		
	//Llamada o invocaci�n del m�todo
	imprimirVerificadorNumeros(a, b, c);
		

	}
	
	
	//Definici�n del m�todo
	public static void imprimirVerificadorNumeros(int a, int b, int c) {
		
		if(a<0||b<0||c<0)
			System.out.println("Valor no v�lido");
		else
			if(a==b&&b==c&&a==c)
				System.out.println("Todos los n�meros son iguales");
			else
				if(a!=b&&b!=c&&a!=c)
					System.out.println("Todos los n�meros son diferentes");
				else
					System.out.println("Ni todos son iguales ni todos son diferentes");
			
		}
	

}
