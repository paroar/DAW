
public class Number {

	public static void main(String[] args) {

		int radio;
		double area;
		
		System.out.println("Introduce el radio de un c�rculo para saber su �rea: ");
		radio=InputData.nextInt();
		
		area=Area.circle(radio);
		System.out.println(area);

	}

}
