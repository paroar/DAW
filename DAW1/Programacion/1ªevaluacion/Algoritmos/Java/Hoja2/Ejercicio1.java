/*Realizar un algoritmo  que nos permita obtener el número de términos de la serie 
1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7 + ... + 1/n,necesarios para llegar conseguir 
un determinado valor x (igualarlo o superarlo).*/
package Hoja2;

import java.util.Scanner;

public class Ejercicio1{

	public static void main(String[] args) 
	{
		
		//variables
		double sum;
		double contador;
		double max;
		contador=1;
		sum=0;
		
		//input
		Scanner teclado=new Scanner(System.in);
		max=teclado.nextDouble();
		
		//output
		while (sum<max)
		{
			sum=sum+(1/contador);
			contador=contador+1;
		}
		contador=contador-1;
		System.out.println(contador);
		
		
	}


}
