/*Realizar un  algoritmo que represente la conversi�n de grados Cent�grados a Fahrenheit.    
( F = (9/5) * C + 32).*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio3 
{

	public static void main(String[] args) 
	{
		//variables
		int g;
		int f;
		
		//input grados
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca valor en grados cent�grados");
		g=teclado.nextInt();
		
		//output farenheit
		f=(9/5)*g+32;
		System.out.println(f+" Farenheit");
		

	}

}
