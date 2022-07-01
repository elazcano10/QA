package com.java.metodos;

import javax.swing.JOptionPane;

public class Gato {

	public static void main(String[] args) {
		
		boolean verano, llamada;
		int temperatura;
		
		
	
	
		 verano = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Es verano? (true/false): "));
	     temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fatemperatura actual: "));
	     

		 
		 llamada = isCatPlaying(verano, temperatura);
		 
		 if(llamada==true)
		 {
			 System.out.println("El gato está jugando? "+"Verdadero");
			 System.out.println("La temperatura actual es: "+temperatura+" grados");	 
		 }
		 else
		 {
			 System.out.println("El gato no está jugando? "+"Falso");
			 System.out.println("La temperatura actual es: "+temperatura+" grados");
		 }

		
	}
	
	
	public static boolean isCatPlaying(boolean v, int t)
	{ boolean resultado = true;
		 if((t>=25 && t<=45 )&&(v==true))
		 { 
			 System.out.println("El gato está jugando? "+"Verdadero");
			 System.out.println("La temperatura actual es: "+t+" grados");	 
			 
			 resultado = true;
		    
		 }
		 else
		 {
			 System.out.println("El gato está jugando? "+"Falso");
			 System.out.println("La temperatura actual es: "+t+" grados");
		     resultado = false; 
		 }
	     if((t>=25 && t<=35)&&(v==false))
	     {
	    	 System.out.println("El gato está jugando? "+"Verdadero");
			 System.out.println("La temperatura actual es: "+t+" grados");	 
			 resultado = true;
	     }
	     else
	     {
	    	 System.out.println("El gato está jugando? "+"Falso");
			 System.out.println("La temperatura actual es: "+t+" grados");
	    	 resultado = false;
	     }	 
			 
		return resultado;

	}
	
//	 * isCatPlaying (verdadero, 10); debe devolver falso ya que la temperatura no está en el rango de 25 a 45
//
//	 * isCatPlaying (falso, 36); debe devolver falso ya que la temperatura no está en el rango de 25 a 35 (el parámetro de verano es falso)
//
//	 * isCatPlaying (falso, 35); debería volver a verdadero ya que la temperatura está en el rango de 25 a 35
//	
	

		
	}



