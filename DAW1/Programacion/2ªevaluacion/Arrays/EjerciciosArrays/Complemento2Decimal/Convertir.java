import java.util.Arrays;

public class Convertir {

	public static int[] decimalBinarioMS(int num) {
		int tam = 8;
		int[] binario = new int[tam];
		if(num >= Math.pow(2, tam-1) || num < -1*Math.pow(2, tam-1)) {
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
	
	public static int binarioMSDecimal(int [] binario) {
		int decimal = 0;
		int exponente = 0;
		int i = binario.length-1;
		while(i > 0) {
			decimal += binario[i] * Math.pow(2, exponente);
			exponente++;
			i--;
		}
		if(binario[0] == 1) {
			decimal *= -1;
		}
		return decimal;
	}
	
	public static void complemento1(int[] binario) {
		if(binario[0] == 1) {
			int i = 1;
			while(i < binario.length) {
				if(binario[i] == 1) {
					binario[i] = 0;
				}else {
					binario[i] = 1;
				}
				i++;
			}
		}
	}
	
	public static void complemento2(int[] complemento1) {
		if(complemento1[0] == 1) {
			complemento1[complemento1.length-1] += 1;
			int i = complemento1.length-1;
			while(i > 0) {
				if(complemento1[i] == 2) {
					complemento1[i] = 0;
					complemento1[i-1] += 1;
				}
				i--;
			}
		}
		if(complemento1[0] == 2) {
			complemento1[0] = 1;
		}
	}
	
	public static int[] decimalComplemento2(int num) {
		int[] complemento2 = Convertir.decimalBinarioMS(num);
		Convertir.complemento1(complemento2);
		Convertir.complemento2(complemento2);
		return complemento2;
	}
	
	public static int complemento2Decimal(int[] complemento2) {
		int[] exception = {1,0,0,0,0,0,0,0};
		if(Arrays.equals(complemento2, exception)) {
			return -128;
		}
		Convertir.complemento1(complemento2);
		Convertir.complemento2(complemento2);
		int decimal = Convertir.binarioMSDecimal(complemento2);
		return decimal;
	}
}
