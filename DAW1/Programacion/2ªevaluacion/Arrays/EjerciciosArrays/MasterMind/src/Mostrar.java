
public class Mostrar{

	public static String mostrarArray(int[] a) {
		String salida = "";
		int i = 0;
		while(i < a.length) {
			salida += a[i];
			i++;
		}
		return salida;
	}
}
