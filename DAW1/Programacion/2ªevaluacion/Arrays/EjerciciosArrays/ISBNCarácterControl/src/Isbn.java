
public class Isbn {

	public static String car�cterControl(int[] array, int n) {
		String car�cterControl;
		int suma = 0;
		int i = 0;
		while(i < n) {
			suma += array[i] * (i+1);
			i++;
		}
		int resto = suma % 11;
		switch(resto) {
		case 10: car�cterControl = "X";
					break;
		default: car�cterControl = ""+resto;		
		}
		return car�cterControl;
	}
}
