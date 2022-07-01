package com.java.metodos;

import javax.swing.JOptionPane;

public class Gatos {

	

	public static boolean isCatPlaying(boolean v, int t)
	{ boolean resultado = true;
	     if(v==true)
			 if(t>=25 && t<=45) //Si es Verano y la temperatura oscila entre los 25 y 45 grados
			 { 
//				 System.out.println("Es Verano y el gato está jugando");
//				 System.out.println("La temperatura actual es: "+t+" grados");	 
//				 System.out.println(resultado);
				 resultado = true;
				 
				 JOptionPane.showMessageDialog(null, "Es Verano y el gato está jugando", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				 JOptionPane.showMessageDialog(null, "La temperatura actual es: "+t+" grados", "Resultados",JOptionPane.INFORMATION_MESSAGE);
				 JOptionPane.showMessageDialog(null, "Resultado: "+resultado,"Resultados",JOptionPane.INFORMATION_MESSAGE);
				    
			 }
		     else
		    	 if(t>=25 && t<=35)
				 {
//		    		 System.out.println("El gato está jugando");
//					 System.out.println("La temperatura actual es: "+t+" grados");	 
//					 System.out.println(resultado);
					 resultado = true;
					 JOptionPane.showMessageDialog(null, "El gato está jugando", "Resultados",JOptionPane.INFORMATION_MESSAGE);
					 JOptionPane.showMessageDialog(null, "La temperatura actual es: "+t+" grados", "Resultados",JOptionPane.INFORMATION_MESSAGE);
					 JOptionPane.showMessageDialog(null, "Resultado: "+resultado,"Resultados",JOptionPane.INFORMATION_MESSAGE);
				 }
                 else
                 {
//                	 System.out.println("El gato no está jugando");
//					 System.out.println("La temperatura actual es: "+t+" grados");
//				     System.out.println(resultado); 
				     resultado = false; 
                	 
				     JOptionPane.showMessageDialog(null, "El gato no está jugando", "Resultados",JOptionPane.INFORMATION_MESSAGE);
					 JOptionPane.showMessageDialog(null, "La temperatura actual es: "+t+" grados", "Resultados",JOptionPane.INFORMATION_MESSAGE);
					 JOptionPane.showMessageDialog(null, "Resultado: "+resultado,"Resultados",JOptionPane.INFORMATION_MESSAGE);
                 }

		   else  	 
		    	 if(v==false)
		    		 if(t>=25 && t<=35)
					 {
//			    		 System.out.println("El gato está jugando");
//						 System.out.println("La temperatura actual es: "+t+" grados");	 
//						 System.out.println(resultado);
						 resultado = true;
						 
						 JOptionPane.showMessageDialog(null, "El gato está jugando", "Resultados",JOptionPane.INFORMATION_MESSAGE);
						 JOptionPane.showMessageDialog(null, "La temperatura actual es: "+t+" grados", "Resultados",JOptionPane.INFORMATION_MESSAGE);
						 JOptionPane.showMessageDialog(null, "Resultado: "+resultado,"Resultados",JOptionPane.INFORMATION_MESSAGE);
					 }
	                 else
	                 {
//	                	 System.out.println("El gato no está jugando");
//						 System.out.println("La temperatura actual es: "+t+" grados"); 
//					     System.out.println(resultado);
					     resultado = false; 
	                	 
					     JOptionPane.showMessageDialog(null, "El gato no está jugando", "Resultados",JOptionPane.INFORMATION_MESSAGE);
						 JOptionPane.showMessageDialog(null, "La temperatura actual es: "+t+" grados", "Resultados",JOptionPane.INFORMATION_MESSAGE);
						 JOptionPane.showMessageDialog(null, "Resultado: "+resultado,"Resultados",JOptionPane.INFORMATION_MESSAGE);
	                 } 
                 
		  		 
		return resultado;

	}
	
	
}
