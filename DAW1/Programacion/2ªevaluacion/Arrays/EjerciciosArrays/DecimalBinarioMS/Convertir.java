package decimalBinarioMS;

public class Convertir {

	public static int[] decimalBinarioMS(int num) {
		int tam = 8;
		int[] binario = new int[tam];
		if(num >= Math.pow(2, tam-1) || num <= -1*Math.pow(2, tam-1)) {
			System.out.println("No cabe en esta arquitectura");
			System.exit(1);
		}
		if(num >= 0) {
			binario[0] = 0;
		}else {
			binario[0] = 1;
			num *= -1;
		}
		
		int i = binario.length-1;
		while(i > 0) {
			binario[i] = num % 2;
			num /= 2;
			i--;
		}
		return binario;
	}
}
