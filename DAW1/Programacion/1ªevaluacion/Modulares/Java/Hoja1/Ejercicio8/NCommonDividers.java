
public class NCommonDividers {

	public static void main(String[] args) {
		
		int firstDividend;
		int secondDividend;
		
		System.out.println("Introduzca dos n�meros para obtener sus divisores comunes (el mayor primero): ");
		firstDividend=InputData.nextInt();
		secondDividend=InputData.nextInt();
		
		boolean commonDividers;
		int divider;
		divider=1;
		while(divider<=secondDividend) 
		{
			commonDividers=Divider.comunDivider(firstDividend, secondDividend, divider);
			
			if(commonDividers)
			{
				System.out.println(divider+" es divisor com�n de "+firstDividend+" y "+secondDividend);
			}
			
			divider=divider+1;
		}
		
	}

}
