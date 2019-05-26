import java.util.Arrays;

public class Posici�n {
	private int coordenadaX;
	private int coordenadaY;
	private boolean disponible;
	private int salto;
	
	public Posici�n(boolean disponible, int coordenadaX, int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.disponible = disponible;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getSalto() {
		return salto;
	}

	public void setSalto(int salto) {
		this.salto = salto;
	}	
	   
    public void actualizarDisponibilidad(Posici�n[][] a, int tama�oTablero) {
        Posici�n[][] tablero = (Posici�n[][])a;
        for(int i = 0; i < tama�oTablero; i++) {
            for(int j = 0; j < tama�oTablero; j++) {
                if(tablero[i][j].getSalto() == 1) {
                    int  diagonalAscendente = i + j;
                    int diagonalDescendente = i - j;
                    for(int k = 0; k < tama�oTablero; k++) {
                        tablero[i][k].setDisponible(false);
                    }
                    for(int k = 0; k < tama�oTablero; k++) {
                        tablero[k][j].setDisponible(false);
                    }
                    for(int i2 = 0; i2 < tama�oTablero; i2++) {
                        for(int j2 = 0; j2 < tama�oTablero; j2++) {
                            if(i2 + j2 == diagonalAscendente || i2 - j2 == diagonalDescendente) {
                                tablero[i][j].setDisponible(false);
                            }
                        }
                    }
                }
            }
        }
    }

}
