
public class Prime {

	public static boolean isPrime(int n) {
		
		boolean isPrime;
		
		if(n<=1)
		{
			isPrime=false;
		}else
		{
			if(n<=3)
			{
				isPrime=true;
			}else
			{
				if(n%2==0)
				{
					isPrime=false;
				}else
				{
					if(n%3==0)
					{
						isPrime=false;
					}else
					{
						isPrime=true;
						int c;
						c=5;
						while(c*c<=n)
						{
							if(n%c==0)
							{
								isPrime=false;
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
		return isPrime;
	}
}
