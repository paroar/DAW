
public class Prueba {

	public static void main(String[] args) {
		System.out.println("Introduce tama�o array : ");
		int tama�o = InputData.leerEntero();
		System.out.println("Introduce cuantos elementos ocupados : ");
		int n = InputData.leerEntero();
		System.out.println("Introduce "+n+" elementos : ");
		int[] array = InputData.llenarArray(tama�o, n);
		System.out.println(Mostrar.contenidoArray(array, n));
		Reemplazar.repetidos(array, n);
		System.out.println(Mostrar.contenidoArray(array, n));
		
	}
}
