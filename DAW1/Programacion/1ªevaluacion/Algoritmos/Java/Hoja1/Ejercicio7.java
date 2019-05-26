/*Realizar un algoritmo que permita asignar a tres variables 
HH, MM y SS, la hora, minuto y segundo en un determinado instante y 
obtenga la hora correspondiente al segundo siguiente.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio7 
{

	public static void main(String[] args) 
	{
		//variables
		int hh;
		int mm;
		int ss;
		
		//input
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca las horas");
		hh=teclado.nextInt();
		System.out.println("Introduzca los minutos");
		mm=teclado.nextInt();
		System.out.println("Introduzca los segundos");
		ss=teclado.nextInt();
		
		//output
		ss=ss+1;
		if (ss>=60) 
		{
			ss=00;
			mm=mm+1;
			if (mm>=60) 
			{
				mm=00;
				hh=hh+1;
				if (hh>=24) 
				{
					hh=00;
					mm=00;
					ss=00;
				}
			}
		}
		System.out.println(hh+":"+mm+":"+ss);
	}

}
