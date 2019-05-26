
public class Mezclar {

	public static String[] mezclarCadenas(String[] texto1, String[] texto2) {
		String[] mezclaCadenas = new String[texto1.length+texto2.length];
		
		int j = 0;
		int k = 0;
		int i = 0;
		while(i<mezclaCadenas.length) {
			if(j<texto1.length) {
				mezclaCadenas[i] = texto1[j];
				i++;
				j++;
			}

			if(k<texto2.length) {
				mezclaCadenas[i] = texto2[k];
				i++;
				k++;
			}
		}
		return mezclaCadenas; 
	}
}
