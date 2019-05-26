
public class Tablero {

	public static Posici�n[][] leer(int tama�oTablero) {
		Posici�n[][] tablero = new Posici�n[tama�oTablero][tama�oTablero];
		for(int i = 0; i < tama�oTablero ; i++) {
			for (int j = 0; j < tama�oTablero; j++){
				tablero[i][j] = new Posici�n(i, j, tama�oTablero);
			} 
		}
		return tablero;
	}
	
	public static void mostrar(Posici�n[][] a, int tama�oTablero) {
		for(int i = 0; i < tama�oTablero; i++) {
			String salida = "";
			for(int j = 0; j < tama�oTablero; j++) {
				salida += a[i][j].getSalto() + " ";
			}
			System.out.println(salida);
		}
	}
	
	public static void actualizarTablero(Posici�n[][] a, int tama�oTablero) {
		for(int i = 0; i < tama�oTablero ; i++) {
			for(int j = 0; j < tama�oTablero ; j++) {
				a[i][j].actualizarPosiciones(a);
			}
		}
	}

	public static void esResoluble(int tama�oTablero) {
		if(tama�oTablero == 1 || tama�oTablero > 4) {
			System.out.println("Tiene soluci�n");
		}else {
			System.out.println("No tiene soluci�n");
		}
	}
}
