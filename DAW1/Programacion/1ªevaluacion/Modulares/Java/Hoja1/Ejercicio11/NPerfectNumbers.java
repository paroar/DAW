
public class NPerfectNumbers {

	public static void main(String[] args) {

		int max;
		
		System.out.println("Introduce un n�mero para calcular "
				+ "todos los n�meros perfectos hasta �l: ");
		max=InputData.nextInt();
		
		boolean isPerfect;
		int n;
		n=1;
		while(n<=max)
		{
			isPerfect=PerfectNumber.isPerfect(n);
			
			if(isPerfect)
			{
				System.out.println(n+" es un n�mero perfecto");
			}
			n=n+1;
		}
		

	}

}
