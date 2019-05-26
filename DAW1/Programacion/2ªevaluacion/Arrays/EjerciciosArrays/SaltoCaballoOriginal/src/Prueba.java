
public class Prueba {

	public static void main(String[] args) {
		int tama�oTablero = InputData.leerEntero();	
		Posici�n[][] tablero = new Posici�n[tama�oTablero][tama�oTablero];
		for(int i = 0; i < tama�oTablero; i++) {
			for(int j = 0; j < tama�oTablero; j++) {
				tablero[i][j] = new Posici�n(tama�oTablero, i, j);
			}
		}
		int i = 0;
		int j = 0;
		int[] coordenadas = new int[2];
		boolean repetir = true;
		int salto = 1;
		while(salto < tama�oTablero*tama�oTablero+1 && repetir) {
			repetir = false;
			tablero[i][j].setDisponible(false);
			tablero[i][j].setSalto(salto);
			salto++;
			if(salto == tama�oTablero*tama�oTablero+1) {
				for(int b = 0; b < tama�oTablero; b++) {
					System.out.println("");
					for(int c = 0; c < tama�oTablero; c++) {
						System.out.print(tablero[b][c].getSalto()+" ");
					}
				}
				System.exit(1);
			}
			for(int k = 0; k < tama�oTablero; k++) {
				for(int l = 0; l < tama�oTablero; l++) {
					tablero[k][l].actualizarN(tablero, tama�oTablero);
				}
			}
			int menor = 9;
			if(i+1 < tama�oTablero && i+1 >= 0 && j+2 < tama�oTablero && j+2 >= 0 && tablero[i+1][j+2].isDisponible()) {
				if(tablero[i+1][j+2].getN() < menor) {
					menor = tablero[i+1][j+2].getN();
					coordenadas[0] = i+1;
					coordenadas[1] = j+2;
					repetir = true;
				}
			}
			if(i+2 < tama�oTablero && i+2 >= 0 && j+1 < tama�oTablero && j+1 >= 0 && tablero[i+2][j+1].isDisponible()) {
				if(tablero[i+2][j+1].getN() < menor) {
					menor = tablero[i+2][j+1].getN();
					coordenadas[0] = i+2;
					coordenadas[1] = j+1;
					repetir = true;
				}
			}
			if(i+2 < tama�oTablero && i+2 >= 0 && j-1 < tama�oTablero && j-1 >= 0 && tablero[i+2][j-1].isDisponible()) {
				if(tablero[i+2][j-1].getN() < menor) {
					menor = tablero[i+2][j-1].getN();
					coordenadas[0] = i+2;
					coordenadas[1] = j-1;
					repetir = true;
				}
			}
			if(i+1 < tama�oTablero && i+1 >= 0 && j-2 < tama�oTablero && j-2 >= 0 && tablero[i+1][j-2].isDisponible()) {
				if(tablero[i+1][j-2].getN() < menor) {
					menor = tablero[i+1][j-2].getN();
					coordenadas[0] = i+1;
					coordenadas[1] = j-2;
					repetir = true;
				}
			}
			if(i-1 < tama�oTablero && i-1 >= 0 && j-2 < tama�oTablero && j-2 >= 0 && tablero[i-1][j-2].isDisponible()) {
				if(tablero[i-1][j-2].getN() < menor) {
					menor = tablero[i-1][j-2].getN();
					coordenadas[0] = i-1;
					coordenadas[1] = j-2;
					repetir = true;
				}
			}
			if(i-2 < tama�oTablero && i-2 >= 0 && j-1 < tama�oTablero && j-1 >= 0 && tablero[i-2][j-1].isDisponible()) {
				if(tablero[i-1][j-1].getN() < menor) {
					menor = tablero[i-2][j-1].getN();
					coordenadas[0] = i-2;
					coordenadas[1] = j-1;
					repetir = true;
				}
			}
			if(i-2 < tama�oTablero && i-2 >= 0 && j+1 < tama�oTablero && j+1 >= 0 && tablero[i-2][j+1].isDisponible()) {
				if(tablero[i-2][j+1].getN() < menor) {
					menor = tablero[i-2][j+1].getN();
					coordenadas[0] = i-2;
					coordenadas[1] = j+1;
					repetir = true;
				}
			}
			if(i-1 < tama�oTablero && i-1 >= 0 && j+2 < tama�oTablero && j+2 >= 0 && tablero[i-1][j+2].isDisponible()) {
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
		for(int b = 0; b < tama�oTablero; b++) {
			System.out.println("");
			for(int c = 0; c < tama�oTablero; c++) {
				System.out.print(tablero[b][c].getSalto()+";");
			}
		}
		System.exit(1);
		
	}
	
	

}
