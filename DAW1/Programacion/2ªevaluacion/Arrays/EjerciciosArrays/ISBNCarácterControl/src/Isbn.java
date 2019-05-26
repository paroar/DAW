
public class Isbn {

	public static String carácterControl(int[] array, int n) {
		String carácterControl;
		int suma = 0;
		int i = 0;
		while(i < n) {
			suma += array[i] * (i+1);
			i++;
		}
		int resto = suma % 11;
		switch(resto) {
		case 10: carácterControl = "X";
					break;
		default: carácterControl = ""+resto;		
		}
		return carácterControl;
	}
}
