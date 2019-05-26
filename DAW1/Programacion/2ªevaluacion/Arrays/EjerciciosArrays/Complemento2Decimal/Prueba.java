

import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int[] complemento2 = InputData.leerArrayBinario();
		int decimal = Convertir.complemento2Decimal(complemento2);
		System.out.println(decimal);
	}

}
