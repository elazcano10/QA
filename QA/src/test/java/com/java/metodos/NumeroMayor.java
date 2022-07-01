package com.java.metodos;

import javax.swing.JOptionPane;

public class NumeroMayor {
	
	static public void ComparaNumeros(int x, int y, int z) {
		
		int mayor;
		
		mayor = x;
		
		
		if(y>mayor)
			mayor = y;
		
	    if(z>mayor)
			mayor = z;
		
		
		JOptionPane.showInternalMessageDialog(null,"El número mayor es: "+mayor, "Resultado",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
