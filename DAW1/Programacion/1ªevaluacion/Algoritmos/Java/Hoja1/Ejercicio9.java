/*Realizar un algoritmo que represente la lectura de un n�mero entero hasta que 
este n�mero est� situado en un rango de 1 a 10. Se visualizar� s�lo este n�mero 
y no los que no hubieran cumplido esta condici�n.*/

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
		System.out.println("Introduzca un n�mero comprendido en [1,10]");
		
		//output
		do 
		{
			n=teclado.nextInt();
		} while (n>10 || n<1);
		System.out.println(n);
	}

}
