
public class Prueba {

	public static void main(String[] args) {
		int tamañoTablero = InputData.leerEntero();	
		Posición[][] tablero = new Posición[tamañoTablero][tamañoTablero];
		for(int i = 0; i < tamañoTablero; i++) {
			for(int j = 0; j < tamañoTablero; j++) {
				tablero[i][j] = new Posición(tamañoTablero, i, j);
			}
		}
		int i = 0;
		int j = 0;
		int[] coordenadas = new int[2];
		boolean repetir = true;
		int salto = 1;
		while(salto < tamañoTablero*tamañoTablero+1 && repetir) {
			repetir = false;
			tablero[i][j].setDisponible(false);
			tablero[i][j].setSalto(salto);
			salto++;
			if(salto == tamañoTablero*tamañoTablero+1) {
				for(int b = 0; b < tamañoTablero; b++) {
					System.out.println("");
					for(int c = 0; c < tamañoTablero; c++) {
						System.out.print(tablero[b][c].getSalto()+" ");
					}
				}
				System.exit(1);
			}
			for(int k = 0; k < tamañoTablero; k++) {
				for(int l = 0; l < tamañoTablero; l++) {
					tablero[k][l].actualizarN(tablero, tamañoTablero);
				}
			}
			int menor = 9;
			if(i+1 < tamañoTablero && i+1 >= 0 && j+2 < tamañoTablero && j+2 >= 0 && tablero[i+1][j+2].isDisponible()) {
				if(tablero[i+1][j+2].getN() < menor) {
					menor = tablero[i+1][j+2].getN();
					coordenadas[0] = i+1;
					coordenadas[1] = j+2;
					repetir = true;
				}
			}
			if(i+2 < tamañoTablero && i+2 >= 0 && j+1 < tamañoTablero && j+1 >= 0 && tablero[i+2][j+1].isDisponible()) {
				if(tablero[i+2][j+1].getN() < menor) {
					menor = tablero[i+2][j+1].getN();
					coordenadas[0] = i+2;
					coordenadas[1] = j+1;
					repetir = true;
				}
			}
			if(i+2 < tamañoTablero && i+2 >= 0 && j-1 < tamañoTablero && j-1 >= 0 && tablero[i+2][j-1].isDisponible()) {
				if(tablero[i+2][j-1].getN() < menor) {
					menor = tablero[i+2][j-1].getN();
					coordenadas[0] = i+2;
					coordenadas[1] = j-1;
					repetir = true;
				}
			}
			if(i+1 < tamañoTablero && i+1 >= 0 && j-2 < tamañoTablero && j-2 >= 0 && tablero[i+1][j-2].isDisponible()) {
				if(tablero[i+1][j-2].getN() < menor) {
					menor = tablero[i+1][j-2].getN();
					coordenadas[0] = i+1;
					coordenadas[1] = j-2;
					repetir = true;
				}
			}
			if(i-1 < tamañoTablero && i-1 >= 0 && j-2 < tamañoTablero && j-2 >= 0 && tablero[i-1][j-2].isDisponible()) {
				if(tablero[i-1][j-2].getN() < menor) {
					menor = tablero[i-1][j-2].getN();
					coordenadas[0] = i-1;
					coordenadas[1] = j-2;
					repetir = true;
				}
			}
			if(i-2 < tamañoTablero && i-2 >= 0 && j-1 < tamañoTablero && j-1 >= 0 && tablero[i-2][j-1].isDisponible()) {
				if(tablero[i-1][j-1].getN() < menor) {
					menor = tablero[i-2][j-1].getN();
					coordenadas[0] = i-2;
					coordenadas[1] = j-1;
					repetir = true;
				}
			}
			if(i-2 < tamañoTablero && i-2 >= 0 && j+1 < tamañoTablero && j+1 >= 0 && tablero[i-2][j+1].isDisponible()) {
				if(tablero[i-2][j+1].getN() < menor) {
					menor = tablero[i-2][j+1].getN();
					coordenadas[0] = i-2;
					coordenadas[1] = j+1;
					repetir = true;
				}
			}
			if(i-1 < tamañoTablero && i-1 >= 0 && j+2 < tamañoTablero && j+2 >= 0 && tablero[i-1][j+2].isDisponible()) {
				if(tablero[i-1][j+2].getN() < menor) {
					menor = tablero[i-1][j+2].getN();
					coordenadas[0] = i-1;
					coordenadas[1] = j+2;
					repetir = true;
				}
			}
			i = coordenadas[0];
			j = coordenadas[1];
		}
		
		
		System.out.println("No se puede resolver");	
		for(int b = 0; b < tamañoTablero; b++) {
			System.out.println("");
			for(int c = 0; c < tamañoTablero; c++) {
				System.out.print(tablero[b][c].getSalto()+";");
			}
		}
		System.exit(1);
		
	}
	
	

}
