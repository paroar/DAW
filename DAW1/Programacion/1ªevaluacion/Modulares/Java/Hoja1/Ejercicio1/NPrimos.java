
public class NPrimos {

	public static void main(String[] args) {
		
		long n;
		long contador;
		boolean number;
		
		System.out.println("Calcular los primos hasta el número: ");
		n=InputData.nextLong();
		
		number=true;
		contador=0;
		while(contador<=n) 
		{
			number=IsPrime.isPrime(contador);
			if(number) 
			{
				System.out.println("El número "+contador+" es primo");
			}
			contador=contador+1;
		}
		
	}

}
