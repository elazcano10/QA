package com.java;

import java.util.Arrays; 

import javax.swing.JOptionPane;

import org.apache.poi.util.SystemOutLogger;

public class Arreglos {

	public static void main(String[] args) {
		
	// Arreglos
		
		// Unidimensional (Vector)
//		String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "domingo"};
//		 System.out.println("El dia de la semana es: " + diasSemana[0]);
//		 
//		 Boolean[] array1 = new Boolean[10];
//		 
//		 array1[0] = true;
//		 array1[9] = false;
//		 array1[5] = true;
//		 array1[1] = true;
//		 
//		 System.out.println(array1[1]);
//		 
//		 int [] numerosEnteros = {1, 2, 3, 4, 5};
//		 
//		 for (int i = 0; i<=numerosEnteros.length-1; i++)
//		 {
//			 System.out.println("Los valores del vector son: "+numerosEnteros[i]);
//			 
//		 }
//		
//		 
		
		// bidimensional (MAtriz)
//		String[][] nombres = new String[2][2];
//		
//		nombres[0][0] = "ricardo";
//		nombres[0][1] = "Avalos";
//		nombres[1][0] = "Pedro";
//		nombres[1][1] = "avalos";
//		
//		System.out.println(nombres[0][0] + nombres[0][1]);
		
		// Multidimensional (Solo 3D se puede representar)
		
//		String[][][][][] multiarray = new String[3][3][3][3][3];
//		
//		multiarray[0][0][0][0][0]= "Hello";
//		multiarray[0][0][0][0][1]= "Hello";
//		multiarray[0][0][0][1][0]= "Hello";
//		multiarray[0][0][1][0][0]= "Hello";
//		multiarray[0][1][0][0][0]= "Hello";
//		
//		
//		System.out.println();
		
//		String [] nombres = {"juan", "pedro", "ana", "maria", "felipe", "luis", "eduardo"};
//
//		
//        for (String n : nombres) {
//			
//
//			
//		     System.out.println(n);                                                                                       
//		}
//		

		
		//int [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
		int [] numeros = {1,3,4,6,6,3,1,8,9,3};
		
		int [] numeros2=new int [numeros.length];
		
		
		 System.out.print("Arreglo Original: "); 
			
			for (int i=0; i<(numeros.length);i++)
				System.out.print(numeros[i]+" ");  
			

        Arrays.sort(numeros); //metodo que ordena un arreglo
		int cont=0;
		boolean numrep;
		int j;

		//mostrarlo ordenado
//		for (int i=0; i <(numeros.length-1); i++) {
//			for (int j=0; j <(numeros.length-1); j++) {
//				
//				if(numeros[j]>numeros[j+1])
//				{
//					aux=numeros[j];               //Método de ordenamiento Burbuja
//					numeros[j]=numeros[j+1];
//					numeros[j+1]=aux;
//					
//				}
//			}		
//			
//			                                                                                      
//		}
		
		
       
		
		System.out.print("\nArreglo Ordenado: "); 
		
		for (int i=0; i<(numeros.length);i++)
			System.out.print(numeros[i]+" ");   //Imprime el arreglo original ordenado
		
		
		for (int i=0; i<numeros.length;i++)
		{
			numrep = false;
			j = 0;
			while(!numrep && (j<cont))
			{
				if(numeros[i] == numeros2[j])
					{numrep = true;}
				j++;
			}
			if(!numrep)
			{
				numeros2[cont] = numeros[i];
				cont++;
			}
			
		
	    }
		System.out.print("\nArreglo con valores sin repetir: ");
		for (int i=0; i<cont;i++)
			System.out.print(numeros2[i]+" ");  
}
}


