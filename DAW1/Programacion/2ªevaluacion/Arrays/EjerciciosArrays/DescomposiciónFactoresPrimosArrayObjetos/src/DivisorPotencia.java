
public class DivisorPotencia {

	private int divisor;
	private int potencia;
	
	public DivisorPotencia(int divisor, int potencia) {
		this.divisor = divisor;
		this.potencia = potencia;
	}
	
	public int getDivisor() {
		return divisor;
	}

	public int getPotencia() {
		return potencia;
	}

	public static DivisorPotencia[] divisoresPrimos(int[] divisores, int n, int[] arrayFactores, int m) {
		int[] potencias = new int[n];
		int i = 0;
		while(i < n) {
			int j = 0;
			while(j < m) {
				if(divisores[i] == arrayFactores[j]) {
					potencias[i]++;
				}
				j++;
			}
			i++;
		}
		DivisorPotencia[] divisoresPrimos = new DivisorPotencia[n];
		for(i = 0; i < n; i++) {
			divisoresPrimos[i] = new DivisorPotencia(divisores[i], potencias[i]);
		}
		return divisoresPrimos;
	} 
}
