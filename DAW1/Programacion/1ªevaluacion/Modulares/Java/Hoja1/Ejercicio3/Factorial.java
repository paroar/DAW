
public class Factorial {
	
	public static long factorial(long n) {
		
		long producto;
		producto=1;
		
		while(n>0) 
		{
			producto=producto*n;
			n=n-1;
		}
		return producto;
	}
	
	public static double serieDenominadorFactorial(int n) {
		
		int contador;
		double suma;
		double factorial;
		suma=0.0;
		
		contador=n-1;
		while(contador>-1) 
		{
			factorial=SerieDenominadorFactorial.factorial(contador);
			suma=suma+1/factorial;
			contador=contador-1;
		}
		return suma;
	}
	
}
