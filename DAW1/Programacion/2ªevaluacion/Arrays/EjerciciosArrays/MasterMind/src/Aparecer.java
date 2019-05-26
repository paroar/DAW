
public class Aparecer {

	public static String aparecen(int[] a, int[] b) {
		String salida = "";
		int j = 0;
		while(j < 4) {
			int i = 0;
			outerloop:
			while(i < 4) {
				if(b[j] == a[i]) {
					salida += b[j]+" ";
					break outerloop;
				}
				i++;
			}
			j++;
		}
		return salida;
	}
}
