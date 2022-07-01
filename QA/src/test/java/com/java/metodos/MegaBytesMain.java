package com.java.metodos;

import javax.swing.JOptionPane;

public class MegaBytesMain {

	public static void main(String[] args) {
		int kiloBytes;
		MegaBytes meg = new MegaBytes();
		
		//meg.leerKiloBytes();
		kiloBytes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de bytes a convertir: "));
		meg.printMegaBytesAndKiloBytes(kiloBytes);
		
	


	}

}
