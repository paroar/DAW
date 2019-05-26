import java.util.Arrays;

public class Convertir {

	public static Lista convertirEnLista(int num) {
		int n = String.valueOf(num).length();
		int[] array = new int[n];
		int i = 0;
		while(i < n) {
			array[i] = num % 10;
			num/=10;
			i++;
		}
		Ordenar.burbuja(array, n);
		Lista digitos = new Lista();
		i = 0;
		while(i < n) {
			if(array[i] != 0) {
				digitos.addEnd(array[i]);
			}
			i++;
		}
		return digitos;
	}
}
