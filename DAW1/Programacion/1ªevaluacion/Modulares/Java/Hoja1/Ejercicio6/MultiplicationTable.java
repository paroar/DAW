
public class MultiplicationTable {

	public static void main(String[] args) {
		
		int m;
		
		System.out.println("Introduce un n�mero para obtener su tabla de multiplicar: ");
		m=InputData.nextInt();
		
		int producto;
		int n;
		n=1;
		while(n<=10) 
		{
			producto=Multiplication.table(m, n);
			System.out.println(n+" x "+m+" = "+producto);
			n=n+1;
		}
		
	}

}
