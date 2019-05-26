
public class Mostrar {

	public static String contenidoArray(int[] array, int n) {
		String salida = "[";
		int i = 0;
		while(i < n) {
			if(i == n-1) {
				salida += array[i]+"]";
				return salida;
			}
			salida += array[i]+",";
			i++;
		}
		return salida;
	}
	
}
