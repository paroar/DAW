import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int tamañoTablero = InputData.leerEntero();
		Tablero.esResoluble(tamañoTablero);
		Posición[][] tablero = Tablero.leer(tamañoTablero);
		Tablero.actualizarTablero(tablero, tamañoTablero);
		
		int[] coordenadas = new int[2];
		int salto = 1;
		int x = 0; int y = 0;
		for(int k = 0 ; k < tamañoTablero*tamañoTablero ; k++) {
			tablero[x][y].setSalto(salto);
			tablero[x][y].setDisponible(false);
			Tablero.actualizarTablero(tablero, tamañoTablero);
			coordenadas = tablero[x][y].menor(tablero);
			x = coordenadas[0];
			y = coordenadas[1];
			salto++;
		}
		
		Tablero.mostrar(tablero, tamañoTablero);
		
	}

}
