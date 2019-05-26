
public class Coincidir {

	public static String coinciden(int[] a, int[] b) {
		String salida = "";
		int j = 0;
		while(j < 4) {
			if(a[j] == b[j]) {
				salida += b[j]+" ";
			}
			j++;
		}
		return salida;
	}
}
