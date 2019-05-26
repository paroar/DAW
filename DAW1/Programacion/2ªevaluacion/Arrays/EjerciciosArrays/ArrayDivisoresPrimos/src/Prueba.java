
public class Prueba {

	public static void main(String[] args) {
		System.out.println("Introduce un entero : ");
		int num = InputData.leerEntero();
		int[] array = new int[num];
		int n = Divisores.arrayPrimos(array, num);
		System.out.println(Mostrar.contenidoArray(array, n));
		
	}
}
