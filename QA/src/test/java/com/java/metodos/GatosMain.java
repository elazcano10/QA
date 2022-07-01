package com.java.metodos;

import javax.swing.JOptionPane;

public class GatosMain {

	public static void main(String[] args) {
	
		
		boolean verano;
		int temperatura;
		
		Gatos gato = new Gatos();
			
		 verano = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Es verano? (true/false): "));
	     temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fatemperatura actual: "));
	     
	     gato.isCatPlaying(verano, temperatura);

	}

}
