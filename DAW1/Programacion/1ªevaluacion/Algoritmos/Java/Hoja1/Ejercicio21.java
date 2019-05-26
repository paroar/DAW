/*Realizar un algoritmo que permita introducir por teclado las N notas de los alumnos 
de una clase y visualice el número de sobresalientes, notables, aprobados y suspensos que hay. */

package Hoja1;

import java.util.Scanner;

public class Ejercicio21
{

	public static void main(String[] args)
	{
		// variables
		int suspenso;
		int sobresaliente;
		int notable;
		int nota; 
		int n; 
		int contador;
		int aprobado;
		contador = 0;
		sobresaliente = 0;
		notable = 0;
		aprobado = 0;
		suspenso = 0;
		
		
	
		//input
		System.out.println("Introduce el número de alumnos: ");
		n = (new Scanner(System.in)).nextInt();
		
		
		//output
		while (contador<n)
		{
			System.out.println("Nota del alumno: ");
			nota = (new Scanner(System.in)).nextInt();
			if (nota>=9)
			{
				sobresaliente = sobresaliente+1;
			}
			else
			{
				if (nota>=7)
				{
					notable = notable+1;
				}
				else
				{
					if (nota<5)
					{
						suspenso = suspenso+1;
					}
					else
					{
						if (nota<7)
						{
							aprobado = aprobado+1;
						}
					}
				}
			}contador = contador+1;
		}
		System.out.println(sobresaliente+" sobresalientes, "+notable+" notables, "+aprobado+" aprobados y "+suspenso+" suspensos");
	}

}