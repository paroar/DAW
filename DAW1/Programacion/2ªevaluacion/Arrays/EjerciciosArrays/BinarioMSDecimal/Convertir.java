package binarioMSDecimal;

public class Convertir {

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
}
