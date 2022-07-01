package com.java.metodos;

import javax.swing.JOptionPane;

public class NumeroVerificador {

	public static void main(String[] args) {
	 int a, b, c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er número entero: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do número entero: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 3er número entero: "));			
		
	//Llamada o invocación del método
	imprimirVerificadorNumeros(a, b, c);
		

	}
	
	
	//Definición del método
	public static void imprimirVerificadorNumeros(int a, int b, int c) {
		
		if(a<0||b<0||c<0)
			System.out.println("Valor no válido");
		else
			if(a==b&&b==c&&a==c)
				System.out.println("Todos los números son iguales");
			else
				if(a!=b&&b!=c&&a!=c)
					System.out.println("Todos los números son diferentes");
				else
					System.out.println("Ni todos son iguales ni todos son diferentes");
			
		}
	

}
