
public class Divisor {

	public static void main(String[] args) {
		
		int dividend;
		int divider;
		
		System.out.println("Introduce dividendo y divisor: ");
		dividend=InputData.nextInt();
		divider=InputData.nextInt();
		
		boolean isDivisible;
		isDivisible=Divider.isDivider(dividend, divider);
		
		if(isDivisible) 
		{
			System.out.println("El n�mero "+divider+" es divisor de "+dividend);
		}else 
		{
			System.out.println("El n�mero "+divider+" no es divisor de "+dividend);
		}
	}

}
