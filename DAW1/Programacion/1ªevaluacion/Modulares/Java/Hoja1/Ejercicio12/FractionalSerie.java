
public class FractionalSerie {

	public static void main(String[] args) {
		
		double max;
		
		System.out.println("Introduce un n�mero para obtener el n�mero de "
				+ "t�rminos necesarios para llegar a �l o superarlo: ");
		max=InputData.nextDouble();
		
		
		double counter;
		counter=1;
		double sum;
		sum=0;
		while(sum<max)
		{
			sum=sum+1/counter;
			counter=counter+1;
		}
		
		System.out.println(counter+" es el n�mero de t�rminos necesarios para llegar a "+max);
		
	
	}

}
