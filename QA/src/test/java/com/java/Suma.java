package com.java;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// crea objeto Scanner para obtener la entrada de la ventana de comandos
		 Scanner entrada = new Scanner(System.in);
		
		 int numero1; // primer n�mero a sumar
		 int numero2; // segundo n�mero a sumar
		 int suma; // suma de numero1 y numero2
		
		 System.out.print("Escriba el primer entero: "); // indicador
		 numero1 = entrada.nextInt(); // lee el primer n�mero del usuario
		
		 System.out.print("Escriba el segundo entero: "); // indicador
		 numero2 = entrada.nextInt(); // lee el segundo n�mero del usuario
		
		 suma = numero1 + numero2; // suma los n�meros, despu�s almacena el total en suma
		
		 System.out.print("La suma es: "+ suma); // muestra la suma

	}

}
