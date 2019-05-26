
public class MostrarArray {

	public static String intArray(int[] a, int n) {
		String salida = "";
		int i = 0;
		while(i < n) {
			salida += a[i]+" ";
			i++;
		}
		return salida;
	}
}
