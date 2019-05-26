

import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int num = InputData.leerEntero();
		int[] complemento2 = Convertir.decimalComplemento2(num);
		System.out.println(Arrays.toString(complemento2));
	}

}
