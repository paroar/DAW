
public class Prueba {

	public static void main(String[] args) {
		System.out.println("Introduce tamaño array : ");
		int tamaño = InputData.leerEntero();
		System.out.println("Introduce cuantos elementos ocupados : ");
		int n = InputData.leerEntero();
		System.out.println("Introduce "+n+" elementos : ");
		int[] array = InputData.llenarArray(tamaño, n);
		System.out.println(Mostrar.contenidoArray(array, n));
		System.out.println(Isbn.carácterControl(array, n));
	}
}
