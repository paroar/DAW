
public class CoronaCircular {

	public static void main(String[] args) {
		
		System.out.println("Introduce dos radios para calcular el �rea de una corona circular (introduce el mayor primero): ");
		double radioMayor;
		double radioMenor;

		radioMayor=InputData.nextDouble();
		radioMenor=InputData.nextDouble();
		
		double m;
		double n;
		
		m=Area.circle(radioMayor);
		n=Area.circle(radioMenor);
		
		double area;
		area=m-n;
		System.out.println("El �rea de la corona circular es "+area);
	}

}
