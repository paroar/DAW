
public class Invertir {

	public static int numeroDigitosInverso(int num) {
		int contador = 0;
		int numero = num;
		while(numero > 0) {
			numero /= 10;
			contador++;
		}
		int[] numArrayInvertido = new int[contador];
		int i = 0;
		while(num > 0) {
			numArrayInvertido[i] = num % 10;
			num /= 10;
			i++;
		}
		int invertido = 0;
		contador--;
		i = 0;
		while(i < numArrayInvertido.length) {
			invertido += numArrayInvertido[i] * Math.pow(10, contador);
			contador --;
			i++;
		}
		return invertido;
	}
}
