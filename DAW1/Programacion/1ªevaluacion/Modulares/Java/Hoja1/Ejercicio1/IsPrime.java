
public class IsPrime {
	
	public static boolean isPrime(long n) {
	
		boolean prime;
		long c;
		
		if(n<=1)
		{
			prime=false;
		}else 
		{
			if(n<=3) 
			{
				prime=true;
			}else 
			{
				if(n%2==0) 
				{
					prime=false;
				}else 
				{
					if(n%3==0) 
					{
						prime=false;
					}else 
					{
						c=5;
						prime=true;
						while(c*c<=n) 
						{
							if(n%c==0) 
							{
								prime=false;
								break;
							}else 
							{
								c=c+2;
							}
						}
					}
				}
			}
		}
		return prime;
	}
	
	
	
}
