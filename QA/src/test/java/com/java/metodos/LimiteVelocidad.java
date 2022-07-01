package com.java.metodos;
import javax.swing.JOptionPane;

public class LimiteVelocidad {

	public static void main(String[] args) {
		//variables globales
		int vel;
		
		int zona;		
		
		vel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad del vehículo en km/hr(entero): "));
		
		zona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor entero de acuerdo a la zona en la que conduce (1: Carretera, 2: Zona Escolar, 3: Calle)"));
		
		//System.out.println("La velocidad del vehículo es: "+vel+" km/hr");

		
		limiteVelocidad(vel, zona);
		
		
	}
	public static void limiteVelocidad(int x, int y) {
		//Variables locales
		int velocidadActual=x;
		int lugar = y;
		int velLimCarretera = 110;
		int velLimEscuela = 10;
		int velLimCalle = 40;
	
		
		
		 switch(lugar) {
		 case 1:
			 // Block code
			 	if(velocidadActual>velLimCarretera)//Zona: Carretera
			 	{
					//System.out.println("Vas conduciendo en carretera a exceso de velocidad");
			    	JOptionPane.showInternalMessageDialog(null,"Vas conduciendo en carretera a exceso de velocidad", "Resultados",JOptionPane.INFORMATION_MESSAGE);
			 	    JOptionPane.showInternalMessageDialog(null,"La velocidad del vehículo es de: "+velocidadActual+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE);
			 	    JOptionPane.showInternalMessageDialog(null,"La velocidad permitida es de: "+velLimCarretera+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				 	
			 	}
				else
				{
					//System.out.println("Vas conduciendo en carretera, respetando el límite de velocidad");
			 	    JOptionPane.showInternalMessageDialog(null,"Vas conduciendo en carretera, respetando el límite de velocidad", "Resultados",JOptionPane.INFORMATION_MESSAGE);
			 	    JOptionPane.showInternalMessageDialog(null,"La velocidad del vehículo es de: "+velocidadActual+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE); 
			 	    JOptionPane.showInternalMessageDialog(null,"La velocidad permitida es de: "+velLimCarretera+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				}
			 	break;
			 
		 case 2:
			 	if(velocidadActual>velLimEscuela)//Zona: Escuela
			 	{	
					//System.out.println("Vas conduciendo en zona escolar a exceso de velocidad");
			 	    JOptionPane.showInternalMessageDialog(null,"Vas conduciendo en zona escolar a exceso de velocidad", "Resultados",JOptionPane.INFORMATION_MESSAGE);
			 	    JOptionPane.showInternalMessageDialog(null,"La velocidad del vehículo es de: "+velocidadActual+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE); 
			 	    JOptionPane.showInternalMessageDialog(null,"La velocidad permitida es de: "+velLimEscuela+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE);
			 	}
				else
				{
					//System.out.println("Vas conduciendo en zona escolar, respetando el límite de velocidad");
			 	    JOptionPane.showInternalMessageDialog(null,"Vas conduciendo en zona escolar, respetando el límite de velocidad", "Resultados",JOptionPane.INFORMATION_MESSAGE);
			 	    JOptionPane.showInternalMessageDialog(null,"La velocidad del vehículo es de: "+velocidadActual+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE); 
			 	    JOptionPane.showInternalMessageDialog(null,"La velocidad permitida es de: "+velLimEscuela+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				}	
			 	break;
			 
		 case 3:
			   if(velocidadActual>velLimCalle)//Zona Calle
			   {	
				 //System.out.println("Vas conduciendo en calle a exceso de velocidad");
		        	JOptionPane.showInternalMessageDialog(null,"Vas conduciendo en calle a exceso de velocidad", "Resultados",JOptionPane.INFORMATION_MESSAGE);
		        	JOptionPane.showInternalMessageDialog(null,"La velocidad del vehículo es de: "+velocidadActual+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE); 
		        	JOptionPane.showInternalMessageDialog(null,"La velocidad permitida es de: "+velLimCalle+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE);
			   }
			 
				
				else
				{
					//System.out.println("Vas conduciendo en calle, respetando el límite de velocidad");
			        JOptionPane.showInternalMessageDialog(null,"Vas conduciendo en calle, respetando el límite de velocidad", "Resultados",JOptionPane.INFORMATION_MESSAGE);
			        JOptionPane.showInternalMessageDialog(null,"La velocidad del vehículo es de: "+velocidadActual+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE); 
			        JOptionPane.showInternalMessageDialog(null,"La velocidad permitida es de: "+velLimCalle+" Km/hr", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				}
			 	break;
			 
			 
			 default:
				 //System.out.println("Lugar desconocido, velocidad no determinada");
				 JOptionPane.showInternalMessageDialog(null,"Lugar desconocido, velocidad no determinada", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				 break;
		 }
		

	} 

}