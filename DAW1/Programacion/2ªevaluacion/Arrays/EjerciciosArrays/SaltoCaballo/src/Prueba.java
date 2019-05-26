import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		int tama�oTablero = InputData.leerEntero();
		Tablero.esResoluble(tama�oTablero);
		Posici�n[][] tablero = Tablero.leer(tama�oTablero);
		Tablero.actualizarTablero(tablero, tama�oTablero);
		
		int[] coordenadas = new int[2];
		int salto = 1;
		int x = 0; int y = 0;
		for(int k = 0 ; k < tama�oTablero*tama�oTablero ; k++) {
			tablero[x][y].setSalto(salto);
			tablero[x][y].setDisponible(false);
			Tablero.actualizarTablero(tablero, tama�oTablero);
			coordenadas = tablero[x][y].menor(tablero);
			x = coordenadas[0];
			y = coordenadas[1];
			salto++;
		}
		
		Tablero.mostrar(tablero, tama�oTablero);
		
	}

}
