/*Realizar un algoritmo que represente la lectura de un número entero hasta que 
este número esté situado en un rango de 1 a 10. Se visualizará sólo este número 
y no los que no hubieran cumplido esta condición.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio9 
{

	public static void main(String[] args) 
	{
		//variable
		int n;
		
		//input
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un número comprendido en [1,10]");
		
		//output
		do 
		{
			n=teclado.nextInt();
		} while (n>10 || n<1);
		System.out.println(n);
	}

}
