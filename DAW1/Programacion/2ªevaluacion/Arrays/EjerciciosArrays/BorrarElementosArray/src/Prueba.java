
public class Prueba {

	public static void main(String[] args) {
		System.out.println("Introduce tama�o de array : ");
		int tama�o = InputData.leerEntero();
		System.out.println("Introduce cuantos elementos ocupados : ");
		int n = InputData.leerEntero();
		System.out.println("Introduce "+n+" elementos : ");
		int[] array = InputData.leerArray(tama�o, n);
		System.out.println("Introduce elemento a borrar : ");
		int num = InputData.leerEntero();
		n = Borrar.borrarElementoArray(array, n, num);
		System.out.println(Mostrar.contenidoArray(array, n));
	}
}
