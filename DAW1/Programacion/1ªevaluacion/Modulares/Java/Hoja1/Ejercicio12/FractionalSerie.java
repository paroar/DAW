
public class FractionalSerie {

	public static void main(String[] args) {
		
		double max;
		
		System.out.println("Introduce un número para obtener el número de "
				+ "términos necesarios para llegar a él o superarlo: ");
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
		
		System.out.println(counter+" es el número de términos necesarios para llegar a "+max);
		
	
	}

}
