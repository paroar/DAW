package binarioMSDecimal;

import java.util.Scanner;

public class InputData {

	public static int leerEnteroBinario() {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		boolean valido = Validar.esValidoBinario(n);
		if(valido) {
			return n;
		}else {
			return leerEnteroBinario();
		}
	}
	
	public static int[] leerArrayBinario() {
		int[] binario = new int[8];
		int i = 0;
		while(i < binario.length) {
			binario[i] = InputData.leerEnteroBinario();
			i++;
		}
		return binario;
	}
}
