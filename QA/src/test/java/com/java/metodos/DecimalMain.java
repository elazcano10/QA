package com.java.metodos;

import javax.swing.JOptionPane;

public class DecimalMain {

	public static void main(String[] args) {
		
		  double x,y;
		  
		  Decimal dec = new Decimal();
		     
			
			x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un n�mero decimal: "));
			y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro n�mero decimal: "));
			
			dec.areEqualByThreeDecimalPlaces(x, y);
			
			
	}

}
