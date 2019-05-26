/*Realizar un algoritmo para introducir tres números por teclado A,B,C 
e intercambiar sus valores de forma que el resultado final sea que A<B<C.*/

package Hoja1;

import java.util.Scanner;

public class Ejercicio16 
{

	public static void main(String[] args) 
	{
		//variables
		int a;
		int b;
		int c;
		int m;
		
		//input
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca tres números: ");
		a=teclado.nextInt();
		b=teclado.nextInt();
		c=teclado.nextInt();
		
		//output
		if(a<b) 
		{
			if(b<c) 
			{
			}else
			{
				m=b;
				b=c;
				c=m;
				if(a<b)
				{
				}else 
				{
					m=a;
					a=b;
					b=m;
				}
			}
		}else 
		{
			m=a;
			a=b;
			b=m;
			if(b<c) 
			{
			}else
			{
				m=b;
				b=c;
				c=m;
				if(a<b) 
				{
				}else 
				{
					m=a;
					a=b;
					b=m;
				}
			}
		}
		System.out.print(a+"<"+b+"<"+c);

	}

}
