package com.java.metodos;

import javax.swing.JOptionPane;

public class Barking {

	//Definici�n de variables

	    boolean barking = false;
		int hourOfDay = 0;
	
	//Definici�n de M�todos
			
		public void leerDatos(){
		
			barking = Boolean.parseBoolean(JOptionPane.showInputDialog("�El perro est� ladrando? (true/false): "));
			hourOfDay = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora actual en formato de 24 hrs: "));
			
			
		}
		
	
		
	public void shouldWakeUp(){
		
		if (hourOfDay >=0 && hourOfDay<=23)
		{
			if(barking==true && (hourOfDay<8 || hourOfDay>22))
			{	barking=true;
				//System.out.println("El perro est� ladrando, debemos despertarnos...");
				//System.out.println("Son las "+hourOfDay+" hrs");	
				//System.out.println(barking);  
			    JOptionPane.showInternalMessageDialog(null,"El perro est� ladrando, debemos despertarnos... ", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showInternalMessageDialog(null,"Son las: "+hourOfDay+" hrs", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showInternalMessageDialog(null,barking, "Resultados",JOptionPane.INFORMATION_MESSAGE);
				
		
			}
			else
			{
				barking=false;
//				System.out.println("El perro no est� ladrando...");
//				System.out.println("Son las "+hourOfDay+" hrs");
//				System.out.println(barking);
				
				JOptionPane.showInternalMessageDialog(null,"El perro no est� ladrando...", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showInternalMessageDialog(null,"Son las: "+hourOfDay+" hrs", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showInternalMessageDialog(null,barking, "Resultados",JOptionPane.INFORMATION_MESSAGE);
				
			}
			 
		}
		else
		{
			barking=false;
//			System.out.println("El perro no est� ladrando...");
//			System.out.println("Fuera de horario");
//			System.out.println(barking);
			
			JOptionPane.showInternalMessageDialog(null,"El perro no est� ladrando...", "Resultados",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showInternalMessageDialog(null,"Fuera de horario", "Resultados",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showInternalMessageDialog(null,barking, "Resultados",JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		
		
	}
	
}
