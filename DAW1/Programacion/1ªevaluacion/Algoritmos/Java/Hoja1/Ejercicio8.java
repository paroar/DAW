/*Realizar un algoritmo que resuelva el ejercicio de la calificación 
de un alumno, empleando una sentencia de selección múltiple.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio8 
{

	public static void main(String[] args) 
	{
		//variable
		int nota;
		
		//input
		Scanner teclado=new Scanner(System.in);
		nota=teclado.nextInt();
		
		//output
		switch (nota) 
		{
		
		case 10:
			System.out.print("Sobresaliente");
			break;
		case 9:
			System.out.print("Sobresaliente");
			break;
		case 8:
			System.out.print("Notable");
			break;
		case 7:
			System.out.print("Notable");
			break;
		case 4:
			System.out.print("Insuficiente");
			break;
		case 3:
			System.out.print("Insuficiente");
			break;
		case 2:
			System.out.print("Muy deficiente");
			break;
		case 1:
			System.out.print("Muy deficiente");
			break;
		case 0:
			System.out.print("Muy deficiente");
			break;
		default:
			System.out.print("Suficiente");

		}

	}

}
