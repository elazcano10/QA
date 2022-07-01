package com.java;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Producto_Numeros {

	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
//		
//		int numero1, numero2, numero3, producto;
//		
//	    System.out.print("Ingrese el primer entero: ");
//		numero1 = entrada.nextInt();
//		
//		System.out.print("Ingrese el segundo entero: ");
//		numero2 = entrada.nextInt();
//		
//		System.out.print("Ingrese el tercer entero: ");
//		numero3 = entrada.nextInt();
//		
//		producto = numero1 * numero2 * numero3;
//		
//		System.out.print("El producto de los 3 números enteros es: "+producto);
		
		int x, y, z, producto;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer entero: "));
		
		y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo entero: "));
	
		z = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer entero: "));
		
		producto = x * y * z;
		
		JOptionPane.showInternalMessageDialog(null,"El producto es: "+producto, "Resultados",JOptionPane.INFORMATION_MESSAGE);

	}

}
