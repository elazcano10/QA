package com.java.metodos;

import javax.swing.JOptionPane;

public class CocheLimiteMain {
	
	public static void main(String[] args) {
		
		int vel, zona;	
				
		CocheLimite coche = new CocheLimite();

        vel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad del vehículo en km/hr(entero): "));
		
		zona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor entero de acuerdo a la zona en la que conduce (1: Carretera, 2: Zona Escolar, 3: Calle)"));
		
		
		coche.limiteVelocidad(vel, zona);

	}
	

}
