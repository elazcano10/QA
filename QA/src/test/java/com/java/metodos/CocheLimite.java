package com.java.metodos;

import javax.swing.JOptionPane;

public class CocheLimite {
	
	//Atributos
	
	int vel, zona;		
	int velLimCarretera = 110;
    int velLimEscuela = 10;
	int velLimCalle = 40;
	
	

	
	
	public void limiteVelocidad(int x, int y) {
		//Variables locales
		int velocidadActual=x;
		int lugar = y;
		
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
