package com.java.metodos;

import javax.swing.JOptionPane;

public class MegaBytes {

	
	
/*
	public static int leerKiloBytes(){
		
		int kiloBytes;
		
		kiloBytes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de bytes a convertir: "));
		
		return kiloBytes;
		
	}
*/	
	
	
	
		
		
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		
		int mb;
		int kb;
		
		if (kiloBytes<0)
		   System.out.println("Valor inválido");
		
		else {
		
				mb = kiloBytes / 1024;	
				
				kb = kiloBytes % 1024;	
				
				System.out.println("El valor ingresado fue: " +kiloBytes+"KB");
				System.out.println(+kiloBytes + "KB = "+ mb+ "MB" + " y " + kb+"KB"  );
		    } 
		
	}

}
	
	

