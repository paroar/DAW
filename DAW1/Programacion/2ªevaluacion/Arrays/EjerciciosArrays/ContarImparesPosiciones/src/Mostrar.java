
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
	
	public static String contenidoArrayImpares(int[] array) {
		String salida = "[";
		int i = 0;
		while(i < array[0]+1) {
			if(i == array[0]) {
				salida += array[i]+"]";
				return salida;
			}
			salida += array[i]+",";
			i++;
		}
		return salida;
	}
}
