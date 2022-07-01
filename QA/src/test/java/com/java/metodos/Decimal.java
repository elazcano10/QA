package com.java.metodos;

import javax.swing.JOptionPane;

public class Decimal {
	
	

	public static void main(String[] args) {
		double x, y;
		

	}
	
	public static void areEqualByThreeDecimalPlaces(double x, double y)
	{
		int a, b;
		boolean resp=true; 
	    a = (int)(x*1000);
		b = (int)(y*1000);
		

		
		if(a==b)
		{	
//			System.out.println("Los numeros son iguales en sus primeros 3 decimales");
//			System.out.println("El primer número es: "+x);
//			System.out.println("El segundo número es: "+y);
			JOptionPane.showInternalMessageDialog(null,"Los numeros son iguales en sus primeros 3 decimales", "Resultados",JOptionPane.INFORMATION_MESSAGE);
	 	    JOptionPane.showInternalMessageDialog(null,"El primer número es: "+x, "Resultados",JOptionPane.INFORMATION_MESSAGE); 
	 	    JOptionPane.showInternalMessageDialog(null,"El segundo número es: "+y, "Resultados",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showInternalMessageDialog(null,"Respuesta: "+resp, "Resultados",JOptionPane.INFORMATION_MESSAGE);
//			return true;
		
		}
		else
		{
			resp=false;
//			System.out.println("Los numeros son diferentes");
//			System.out.println("El primer número es: "+x);
//			System.out.println("El segundo número es: "+y);
			JOptionPane.showInternalMessageDialog(null,"Los numeros son diferentes", "Resultados",JOptionPane.INFORMATION_MESSAGE);
	 	    JOptionPane.showInternalMessageDialog(null,"El primer número es: "+x, "Resultados",JOptionPane.INFORMATION_MESSAGE); 
	 	    JOptionPane.showInternalMessageDialog(null,"El segundo número es: "+y, "Resultados",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showInternalMessageDialog(null,"El segundo número es: "+y, "Resultados",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showInternalMessageDialog(null,"Respuesta: "+resp, "Resultados",JOptionPane.INFORMATION_MESSAGE);
//			return false;
			
		}
		
		
	}
	


}
