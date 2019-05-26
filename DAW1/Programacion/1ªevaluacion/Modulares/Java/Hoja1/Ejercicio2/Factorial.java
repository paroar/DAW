
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
	
}
