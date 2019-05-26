
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

}
