/*Realizar un algoritmo que muestre por pantalla la hora, minuto y segundo 
en cada instante (segundo) de un  día, empezando por 0:0:0 y terminando en 59:59:23*/

package Hoja2;

public class Ejercicio12
{
	public static void main(String[] args)
	{
		//variables
		int segundos;
		int minutos;
		int horas;
		horas = 0;
		minutos = 0;
		segundos = 0;
		
		//output
		while (segundos<60)
		{
			if (segundos<59)
			{
				segundos = segundos+1;
			}
			else
			{
				segundos = 0;
				if (minutos<59)
				{
					minutos = minutos+1;
				}
				else
				{
					minutos = 0;
					if (horas<23)
					{
						horas = horas+1;
					}
					else
					{
						System.exit(1);
					}
				}
			}
			System.out.println(horas+":"+minutos+":"+segundos);
		}
	}

}