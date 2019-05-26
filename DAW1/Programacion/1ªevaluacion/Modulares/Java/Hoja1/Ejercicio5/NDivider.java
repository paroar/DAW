
public class NDivider {

	public static void main(String[] args) {
		
		int dividend;
		int divider;
		
		System.out.println("Introduce un número para obtener todos sus divisores: ");
		dividend=InputData.nextInt();
		
		boolean isDivisible;
		divider=1;
		while(divider<=dividend) 
		{
			isDivisible=Divider.isDivider(dividend, divider);
			
			if(isDivisible) 
			{
				System.out.println("El número "+divider+" es divisor de "+dividend);
			}
			
			divider=divider+1;
		}	

	}

}
