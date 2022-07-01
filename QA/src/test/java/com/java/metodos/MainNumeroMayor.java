package com.java.metodos;

import javax.swing.JOptionPane;

public class MainNumeroMayor {

	public static void main(String[] args) {
		
		NumeroMayor numMayor = new NumeroMayor();
		
		int a, b, c;
		
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número entero: "));
		
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número entero: "));
		
		c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número entero: "));
		
		numMayor.ComparaNumeros(a, b, c);

	}

}
