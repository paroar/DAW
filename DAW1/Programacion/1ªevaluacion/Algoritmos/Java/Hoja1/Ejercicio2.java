/*Realizar un algoritmo que represente la obtenci�n de soluciones para la resoluci�n  de una ecuaci�n de 
segundo grado. Se tendr� en cuenta si no hay soluciones reales, si hay una soluci�n doble o si hay dos 
soluciones. Se visualizar�n los resultados por pantalla (valores o mensajes).*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio2
{
	
	public static void main(String[] args)
	{
		//variables
		double terminoIndependiente; 
		double coeficienteSegundoGrado; 
		double coeficientePrimerGrado;
		double discriminante;
		
		//input
		System.out.println("Coeficiente segundo grado: ");
		coeficienteSegundoGrado = (new Scanner(System.in)).nextDouble();
		System.out.println("Coeficiente primer grado: ");
		coeficientePrimerGrado = (new Scanner(System.in)).nextDouble();
		System.out.println("Termino independiente: ");
		terminoIndependiente = (new Scanner(System.in)).nextDouble();
		
		//output
		discriminante = coeficientePrimerGrado*coeficientePrimerGrado-4*coeficienteSegundoGrado*terminoIndependiente;
		if (discriminante>0)
		{
			System.out.println("La ecuaci�n tiene dos ra�ces reales distintas");
			System.out.println((-coeficientePrimerGrado+Math.sqrt(discriminante))/(2*coeficienteSegundoGrado));
			System.out.println((-coeficientePrimerGrado-Math.sqrt(discriminante))/(2*coeficienteSegundoGrado));
		}
		else
		{
			if (discriminante==0)
			{
				System.out.println("La ecuaci�n tiene una ra�z real");
				System.out.println(-coeficientePrimerGrado/2*coeficienteSegundoGrado);
			}
			else
			{
				System.out.println("La ecuaci�n no tiene soluciones reales");
			}
		}
	}

}