
public class NMultiplicationTable {

	public static void main(String[] args) {
		
		int max;
		
		System.out.println("Introduce el número de tablas de multiplicar a mostrar: ");
		max=InputData.nextInt();
		
		int m;
		int n;
		int producto;
		m=1;
		n=1;
		while(m<=max) 
		{
			while(n<=10) 
			{
				producto=Multiplication.table(n,m);
				System.out.println(n+" x "+m+" = "+producto);
				n=n+1;
			}
			System.out.println("------------");
			n=1;
			m=m+1;
		}
		
	}

}
