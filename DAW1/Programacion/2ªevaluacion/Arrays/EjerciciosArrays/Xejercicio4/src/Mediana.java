
public class Mediana {
	
	public static double obtenerMediana(double[] array) {
		int[] repetidos = new int[array.length];
		int n = 0;
		double rep = 0;
		int minDif = array.length;
		boolean contador= false;
		int i = 0;
		while(i < array.length) {
			int mayor = 0;
			int menor = 0;
			int j = 0;
			while(j < array.length) {
				if(array[i] > array[j]) {
					mayor++;
				}
				if(array[i] < array[j]) {
					menor++;
				}
				j++;
			}
			int dif = Math.abs(mayor-menor);
			repetidos[n] = dif;
			n++;
			if(dif == minDif) {
				contador = true;
			}else if(dif < minDif){
				minDif = dif;
				rep = array[i];
				contador = false;
			}
			i++;
		}
		if(contador) {
			double suma = 0;
			int veces = 0;
			i = 0;
			while(i < n) {
				if(repetidos[i] == minDif) {
					suma += array[i];
					veces++;
				}
				i++;
			}
			double media = suma/veces;
			return media;
		}else {
			return rep;
		}
	}
}
