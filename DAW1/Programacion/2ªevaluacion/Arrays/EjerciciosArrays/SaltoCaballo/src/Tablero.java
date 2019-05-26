
public class Tablero {

	public static Posición[][] leer(int tamañoTablero) {
		Posición[][] tablero = new Posición[tamañoTablero][tamañoTablero];
		for(int i = 0; i < tamañoTablero ; i++) {
			for (int j = 0; j < tamañoTablero; j++){
				tablero[i][j] = new Posición(i, j, tamañoTablero);
			} 
		}
		return tablero;
	}
	
	public static void mostrar(Posición[][] a, int tamañoTablero) {
		for(int i = 0; i < tamañoTablero; i++) {
			String salida = "";
			for(int j = 0; j < tamañoTablero; j++) {
				salida += a[i][j].getSalto() + " ";
			}
			System.out.println(salida);
		}
	}
	
	public static void actualizarTablero(Posición[][] a, int tamañoTablero) {
		for(int i = 0; i < tamañoTablero ; i++) {
			for(int j = 0; j < tamañoTablero ; j++) {
				a[i][j].actualizarPosiciones(a);
			}
		}
	}

	public static void esResoluble(int tamañoTablero) {
		if(tamañoTablero == 1 || tamañoTablero > 4) {
			System.out.println("Tiene solución");
		}else {
			System.out.println("No tiene solución");
		}
	}
}
