package binarioMSDecimal;

import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int[] binario = InputData.leerArrayBinario();
		int decimal = Convertir.binarioMSDecimal(binario);
		System.out.println(Arrays.toString(binario)+"\n"
		+decimal);

	}

}
