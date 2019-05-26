
public class Prueba {

	public static void main(String[] args) {
		System.out.println("Introduce un entero : ");
		int num = InputData.leerEntero();
		int[] divisoresPrimos = new int[num];
		int n = Divisores.divisoresPrimos(divisoresPrimos, num);
		int[] descomposici�nFactoresPrimos = new int[num];
		int m = Divisores.descomposici�nFactoresPrimos(descomposici�nFactoresPrimos, num);
		System.out.println(Mostrar.contenidoArray(divisoresPrimos, n));
		System.out.println(Mostrar.contenidoArray(descomposici�nFactoresPrimos, m));
		
		DivisorPotencia[] divisorPotencia = DivisorPotencia.divisoresPrimos(divisoresPrimos, n, descomposici�nFactoresPrimos, m);
		for(int i = 0; i < n; i++) {
			System.out.println(divisorPotencia[i].getDivisor()+" "+divisorPotencia[i].getPotencia());
		}
		
	}
}
