
public class Prueba {

	public static void main(String[] args) {
		int tama�oTablero = InputData.leerEntero();	
		Posici�n[][] tablero = new Posici�n[tama�oTablero][tama�oTablero];
		for(int i = 0; i < tama�oTablero; i++) {
			for(int j = 0; j < tama�oTablero; j++) {
				tablero[i][j] = new Posici�n(true, i, j);
			}
		}
		if(tama�oTablero == 2 || tama�oTablero == 3) {
			System.out.println("No tiene soluci�n");
			System.exit(1);
		}
		for(int n = 0; n <= tama�oTablero; n++) {
			if(tama�oTablero == 2+6*n && tama�oTablero % 4 == 0) {
				int salto = 1;		
				int i = 0;
				int j = 1;
				int contador = (tama�oTablero)/2;
				while(contador > 0) {
					tablero[i][j].setDisponible(false);
					tablero[i][j].setSalto(salto);
					i++;
					j += 2;
					contador--;
				}
				for(int k = 0; k < tama�oTablero; k++) {
					for(int l = 0; l < tama�oTablero; l++) {
						tablero[k][l].actualizarDisponibilidad(tablero, tama�oTablero);
					}
				}
				i = tama�oTablero/2;
				j = 0;
				contador = (tama�oTablero)/2;
				while(contador > 0) {	
					if(tablero[i][j].isDisponible()) {
						tablero[i][j].setDisponible(false);
						tablero[i][j].setSalto(salto);
						contador--;
						i++;
						j = 0;
						for(int k = 0; k < tama�oTablero; k++) {
							for(int l = 0; l < tama�oTablero; l++) {
								tablero[l][k].actualizarDisponibilidad(tablero, tama�oTablero);
							}
						}
					}else {
						j++;
					}
				}
				for(int b = 0; b < tama�oTablero; b++) {
					System.out.println("");
					for(int c = 0; c < tama�oTablero; c++) {
						System.out.print(tablero[b][c].getSalto()+" ");
					}

				}
				System.exit(1);
				
			}
			if(tama�oTablero == 2+6*n+1) {
				System.out.println("Este algoritmo no puede resolver ese tama�o de tablero");
				System.exit(1);
			}
		}
		
		int salto = 1;		
		int i = 0;
		int j = 1;
		int contador = (tama�oTablero)/2;
		while(contador > 0) {
			tablero[i][j].setDisponible(false);
			tablero[i][j].setSalto(salto);
			i++;
			j += 2;
			contador--;
		}
		i = tama�oTablero/2;
		j = 0;
		contador = (tama�oTablero)/2;
		while(contador > 0) {
			tablero[i][j].setDisponible(false);
			tablero[i][j].setSalto(salto);
			i++;
			j += 2;
			contador--;
		}
		if(tama�oTablero % 2 != 0) {
			tablero[tama�oTablero-1][tama�oTablero-1].setSalto(1);
		}
		for(int b = 0; b < tama�oTablero; b++) {
			System.out.println("");
			for(int c = 0; c < tama�oTablero; c++) {
				System.out.print(tablero[b][c].getSalto()+" ");
			}

		}

	}

}
