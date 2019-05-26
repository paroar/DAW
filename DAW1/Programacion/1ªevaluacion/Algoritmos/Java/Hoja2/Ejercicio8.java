/*Realizar un algoritmo  que calcule la división de a entre b mediante 
restas sucesivas, visualizando  el cociente y el resto*/

package Hoja2;

import java.util.Scanner;

public class Ejercicio8
{
	public static void main(String[] args)
	{
		//variables
		int divisor; 
		int cociente;
		int dividendo;
		int resto;
		cociente = 0;
		
		//input
		System.out.println("Introduce dividendo y divisor naturales*: ");
		dividendo = (new Scanner(System.in)).nextInt();
		divisor = (new Scanner(System.in)).nextInt();
		
		//output
		while (dividendo>=divisor)
		{
			cociente = cociente+1;
			dividendo = dividendo-divisor;
		}
		resto = dividendo;
		System.out.println("El cociente es: "+cociente+" y el resto: "+resto);
	}

}