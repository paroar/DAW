
public class Divider {
	
	public static boolean isDivider(int dividend, int divider) {
		
		boolean divisible;
		
		if(dividend%divider==0) 
		{
			divisible=true;
		}else 
		{
			divisible=false;
		}
		
		return divisible;
	}

	public static boolean comunDivider(int firstDividend, int secondDividend, int divider) {
		
		boolean isDivider;
		boolean first;
		boolean second;
		
		first=Divider.isDivider(firstDividend, divider);
		second=Divider.isDivider(secondDividend, divider);
		
		if(first && second) 
		{
			isDivider=true;
		}else 
		{
			isDivider=false;
		}
		
		return isDivider;
	}
}
