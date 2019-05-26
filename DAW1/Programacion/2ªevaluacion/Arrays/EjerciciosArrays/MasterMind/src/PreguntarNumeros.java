
public class PreguntarNumeros {

	public static void cuatroDigitos(int[] a) {
		int i = 0;
		while(i<4) {
			int num = InputData.leerEntero();
			boolean valido = Validar.validarEntero(num);
			if(valido) {
				a[i] = num;
				i++;
			}
		}
	} 
}
