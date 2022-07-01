package com.java;

import java.util.Arrays; 

import javax.swing.JOptionPane;

public class Repaso_Estructuras {

	public static void main(String[] args) {
		
//		int num1, num2, mayor=0;
//		
//		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));
//		
//		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número entero: "));
//		
//		if(num1>num2)
//		{
//			mayor = num1;
//			JOptionPane.showInternalMessageDialog(null,"El nmero mayor es: "+mayor, "Resultados",JOptionPane.INFORMATION_MESSAGE);	
//		}
//		else
//			if(num2>num1)
//			{
//				
//				mayor = num2;
//				JOptionPane.showInternalMessageDialog(null,"El número mayor es: "+mayor, "Resultados",JOptionPane.INFORMATION_MESSAGE);	
//			}
//			else
//			{
//				num1=num2;
//	        	JOptionPane.showInternalMessageDialog(null,"Los números son iguales", "Resultados",JOptionPane.INFORMATION_MESSAGE);	
//		
//			}
//
//		int c=0;
//		if (c < 7)
//		System.out.println("c es menor que 7");
//		
//		
//		if (c >= 7)
//			System.out.println("c es igual o mayor que 7");
		
//**********************************************************************************
		
//		int radio;
//		int diametro;
//		
//		double area, circunferencia;
//		
//		radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del radio: "));
//		
//		// Cálculo del Diametro
//		
//		diametro = 2*radio;
//		
//		//Cálculo de la circunferencia
//		
//		circunferencia = 2*Math.PI*radio;
//		
//		//Cálculo del área
//		
//		area = Math.PI*(radio*radio);
//		
//		
//		  JOptionPane.showInternalMessageDialog(null,"El diametro es: " +diametro, "Resultados",JOptionPane.INFORMATION_MESSAGE);	
//		
//        JOptionPane.showInternalMessageDialog(null,"La circunferencia es: " +circunferencia, "Resultados",JOptionPane.INFORMATION_MESSAGE);	
//	
//        JOptionPane.showInternalMessageDialog(null,"El área es: " +area+ "unidades cuadradas", "Resultados",JOptionPane.INFORMATION_MESSAGE);	
    	
//**********************************************************************************
		
		//Ciclos
		
		
//***********************Ciclo While***********************************************		
//		int numero=0;
//		System.out.println("El número es: ");
//		while(numero<=10) {
//			
//	   // JOptionPane.showInternalMessageDialog(null,"El número es: " +numero, "Resultados",JOptionPane.INFORMATION_MESSAGE)
//		System.out.println(numero);
//	    numero++;
//	    
//		}
//		
//		int cuadrado=0;
//		System.out.println("El cuadrado es: ");
//		while(cuadrado<=10) {
//			
//	   // JOptionPane.showInternalMessageDialog(null,"El número es: " +numero, "Resultados",JOptionPane.INFORMATION_MESSAGE)
//		System.out.println(cuadrado*cuadrado);
//	    cuadrado++;
//	    
//		}
//		
//		int cubo=0;
//		System.out.println("El cubo es: ");
//		while(cubo<=10) {
//			
//	   // JOptionPane.showInternalMessageDialog(null,"El número es: " +numero, "Resultados",JOptionPane.INFORMATION_MESSAGE)
//		System.out.println(cubo*cubo*cubo);
//	    cubo++;
//	    
//		}

		
//***********************Ciclo Do While***********************************************				
//		System.out.println("El número es: ");
//		int numero=0;
//		do {
//			
//			System.out.println(numero);
//		    numero++;
//		}while(numero<=10);
//		
//		
//		System.out.println("El cuadrado es: ");
//		int cuadrado=0;
//		do {
//			
//			System.out.println(cuadrado*cuadrado);
//		    cuadrado++;
//		}while(cuadrado<=10);
//		
//		
//		System.out.println("El cubo es: ");
//		int cubo=0;
//		do {
//			
//			System.out.println(cubo*cubo*cubo);
//		    cubo++;
//		}while(cubo<=10);
//		
		
//***********************Ciclo FOR***********************************************		

//int i;	
//System.out.println("El número es: ");
//for(i=0;i<=10;i++)
//{
//	System.out.println(i);
//}
//
//int j;	
//System.out.println("El cuadrado es: ");
//for(j=0;j<=10;j++)
//{
//	System.out.println(j*j); 
//}
// 
//int k;	
//System.out.println("El cubo es: ");
//for(k=0;k<=10;k++)
//{
//	System.out.println(k*k*k);
//}


//******************Case****************************
	
//días de la semana

//int dia;
//
//dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero [1-7]: "));
////
//		
//switch(dia){
//
//case 1:  JOptionPane.showInternalMessageDialog(null,"El día de la semana es: Lunes ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 2:  JOptionPane.showInternalMessageDialog(null,"El día de la semana es: Martes ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 3:  JOptionPane.showInternalMessageDialog(null,"El día de la semana es: Miércoles ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 4:  JOptionPane.showInternalMessageDialog(null,"El día de la semana es: Jueves ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 5:  JOptionPane.showInternalMessageDialog(null,"El día de la semana es: Viernes ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 6:  JOptionPane.showInternalMessageDialog(null,"El día de la semana es: Sábado ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 7:  JOptionPane.showInternalMessageDialog(null,"El día de la semana es: Domingo ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//default: JOptionPane.showInternalMessageDialog(null,"El día de la semana no es válido ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//
//
//}		
		
// Meses del año	

//int mes;
//
//mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero [1-12]: "));
////
//		
//switch(mes){
//
//case 1:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Enero ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 2:  JOptionPane.showInternalMessageDialog(null,"El mes del año es:: Febrero ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 3:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Marzo ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 4:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Abril ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 5:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Mayo ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 6:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Junio ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 7:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Julio ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 8:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Agosto ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 9:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Septiembre ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 10:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Octubre ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 11:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Noviembre ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//case 12:  JOptionPane.showInternalMessageDialog(null,"El mes del año es: Diciembre ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//break;
//
//default: JOptionPane.showInternalMessageDialog(null,"El mes del año no es válido ", "Resultado",JOptionPane.INFORMATION_MESSAGE);
//
//
//}	

//***********************************Arreglos o Vectores************************************************************************
		
//int [] arreglo = new int [10];
//int [] arreglo = {1,2,3,4,5,6,7,8,9,10};
//int i;
//
///*for(k=0;k<=arreglo.length;k++)*/
//
//for ( i = 0; i <= arreglo.length-1; i++)
//	
//{
//	
//	System.out.println("El valor del arreglo en la posición: "+i+ " es: "+arreglo[i]);
//	JOptionPane.showInternalMessageDialog(null,"El valor del arreglo en la posición: "+i+ " es: "+arreglo[i], "Resultado",JOptionPane.INFORMATION_MESSAGE);
//	
//	
//}		


int [] array = {1,3,4,6,6,3,1,8,9,3};

Arrays.sort(array);

System.out.println("Arreglo ordenado: "); 

for (int i=0; i<(array.length);i++)
{
		System.out.println(array[i]); 
}

//int aux;

//System.out.println("Los valores del arreglo sin ordenar son: ");

//for (int i=0; i <(array.length-1); i++) {
//	for (int j=0; j <(array.length-1); j++) {
//		
//		if(array[j]>array[j+1])
//		{
//			aux=array[j];
//			array[j]=array[j+1];
//			array[j+1]=aux;
//			
//		}
//	}		
//			                                                                                      
//}
//
//System.out.println("Arreglo ordenado: "); 
//
//for (int i=0; i<(array.length);i++)
//{
//		System.out.println(array[i]); 
//}
//
//
//System.out.println("Arreglo sin elementos duplicados: "); 
//
//for (int i=0; i<(array.length);i++)
//{
//		System.out.println(array[i]); 
//		if(array[i]!=array[i+1])
//		{
//			System.out.println(array[i+1]);	
//		}
//		else
//			System.out.println("Elemento duplicado"); 
//}





//int [] array2=new int [array.length]; 
//
//for (int a=0; a<(array.length);a++)
//{
//	if(array[a]!=array[a+1])
//	{
//		array2[a]=array[a];
//	}
//}
//
//for (int b=0; b<(array.length);b++)
//	System.out.println(array2[b]); 


//}
//int longitud;
//
//longitud = array.length;
//
//System.out.println(longitud);
//
//
//int aux;
//for (int  i = 0; i < longitud-1; i++)
//{
//	for (int  j = 0; j < longitud-1; j++)
//	{
//		
//		if(array[j]>array[j+1])
//		{
//			aux = array[j];
//			array[j]=array[j+1];
//			array[j+1]=aux;
//		}
//		
//	}
//	
//	System.out.println(array[i]);
//	//if(array[i]array[+1])
//}
//
//
//System.out.println(array.length);
//
//		
//	}
	
	
	}
}

