
public class AmicableNumber {
	
	public static boolean areAmicable(int a, int b) {
		
		boolean areAmicable;
		areAmicable=true;
		
		int sumA;
		sumA=0;
		int divider;
		divider=1;
		while(divider<=a/2)
		{
			if(a%divider==0)
			{
				sumA=sumA+divider;
			}
			divider=divider+1;			
		}
		if(sumA==b) 
		{
			int sumB;
			sumB=0;
			divider=1;
			while(divider<=b/2)
			{
				if(b%divider==0)
				{
					sumB=sumB+divider;
				}
				divider=divider+1;
			}
			if(sumA==sumB && a!=b)
			{
				areAmicable=true;
			}
		}else 
		{
			areAmicable=false;
		}
		return areAmicable;
	}	
}
