
public class Prueba {

	public static void main(String[] args) {
		System.out.println("Introduce tamaño de array : ");
		int tamaño = InputData.leerEntero();
		System.out.println("Introduce cuantos elementos ocupados : ");
		int n = InputData.leerEntero();
		System.out.println("Introduce "+n+" elementos : ");
		int[] array = InputData.leerArray(tamaño, n);
		System.out.println("Introduce elemento a borrar : ");
		int num = InputData.leerEntero();
		n = Borrar.borrarElementoArray(array, n, num);
		System.out.println(Mostrar.contenidoArray(array, n));
	}
}
