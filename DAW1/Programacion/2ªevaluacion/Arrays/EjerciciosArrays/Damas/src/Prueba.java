
public class Prueba {

	public static void main(String[] args) {
		int tamañoTablero = InputData.leerEntero();	
		Posición[][] tablero = new Posición[tamañoTablero][tamañoTablero];
		for(int i = 0; i < tamañoTablero; i++) {
			for(int j = 0; j < tamañoTablero; j++) {
				tablero[i][j] = new Posición(true, i, j);
			}
		}
		if(tamañoTablero == 2 || tamañoTablero == 3) {
			System.out.println("No tiene solución");
			System.exit(1);
		}
		for(int n = 0; n <= tamañoTablero; n++) {
			if(tamañoTablero == 2+6*n && tamañoTablero % 4 == 0) {
				int salto = 1;		
				int i = 0;
				int j = 1;
				int contador = (tamañoTablero)/2;
				while(contador > 0) {
					tablero[i][j].setDisponible(false);
					tablero[i][j].setSalto(salto);
					i++;
					j += 2;
					contador--;
				}
				for(int k = 0; k < tamañoTablero; k++) {
					for(int l = 0; l < tamañoTablero; l++) {
						tablero[k][l].actualizarDisponibilidad(tablero, tamañoTablero);
					}
				}
				i = tamañoTablero/2;
				j = 0;
				contador = (tamañoTablero)/2;
				while(contador > 0) {	
					if(tablero[i][j].isDisponible()) {
						tablero[i][j].setDisponible(false);
						tablero[i][j].setSalto(salto);
						contador--;
						i++;
						j = 0;
						for(int k = 0; k < tamañoTablero; k++) {
							for(int l = 0; l < tamañoTablero; l++) {
								tablero[l][k].actualizarDisponibilidad(tablero, tamañoTablero);
							}
						}
					}else {
						j++;
					}
				}
				for(int b = 0; b < tamañoTablero; b++) {
					System.out.println("");
					for(int c = 0; c < tamañoTablero; c++) {
						System.out.print(tablero[b][c].getSalto()+" ");
					}

				}
				System.exit(1);
				
			}
			if(tamañoTablero == 2+6*n+1) {
				System.out.println("Este algoritmo no puede resolver ese tamaño de tablero");
				System.exit(1);
			}
		}
		
		int salto = 1;		
		int i = 0;
		int j = 1;
		int contador = (tamañoTablero)/2;
		while(contador > 0) {
			tablero[i][j].setDisponible(false);
			tablero[i][j].setSalto(salto);
			i++;
			j += 2;
			contador--;
		}
		i = tamañoTablero/2;
		j = 0;
		contador = (tamañoTablero)/2;
		while(contador > 0) {
			tablero[i][j].setDisponible(false);
			tablero[i][j].setSalto(salto);
			i++;
			j += 2;
			contador--;
		}
		if(tamañoTablero % 2 != 0) {
			tablero[tamañoTablero-1][tamañoTablero-1].setSalto(1);
		}
		for(int b = 0; b < tamañoTablero; b++) {
			System.out.println("");
			for(int c = 0; c < tamañoTablero; c++) {
				System.out.print(tablero[b][c].getSalto()+" ");
			}

		}

	}

}
