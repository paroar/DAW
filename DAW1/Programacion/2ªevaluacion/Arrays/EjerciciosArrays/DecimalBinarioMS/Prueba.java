package decimalBinarioMS;

import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int num = InputData.leerEntero();
		int[] binario = Convertir.decimalBinarioMS(num);
		System.out.println(Arrays.toString(binario));
	}

}
