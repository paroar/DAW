
public class PerfectNumber {
	
	public static boolean isPerfect(int n) {
		
		boolean isPerfect;
		int divider;
		int sum;
		
		sum=0;
		divider=1;
		while(divider<=n/2)
		{
			if(n%divider==0)
			{
				sum=sum+divider;
				divider=divider+1;
			}
		}
		
		if(sum==n)
		{
			isPerfect=true;
		}else
		{
			isPerfect=false;
		}
		return isPerfect;
	}	
}
