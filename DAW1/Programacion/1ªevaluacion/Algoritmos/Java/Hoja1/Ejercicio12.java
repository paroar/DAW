/*Realizar un algoritmo que visualice la tabla de multiplicar del número 3.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio12 
{

	public static void main(String[] args) 
	{
		//variable
		int n;
		int c;
		int multiplicacion;
		c=0;
		
		//input
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca valor: ");
		n=teclado.nextInt();
		
		//output
		while(c<11)
		{
			multiplicacion=n*c;
			System.out.println(n+"x"+c+" = "+ multiplicacion);
			c=c+1;
		}
		

	}

}
