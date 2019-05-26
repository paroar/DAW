import java.util.Arrays;

public class Posición {
	private int coordenadaX;
	private int coordenadaY;
	private int tamañoTablero;
	private boolean disponible;
	private int[][] posiciones = new int[8][2];
	private int n;
	private int salto;
	
	public Posición(int coordenadaX, int coordenadaY, int tamañoTablero) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.tamañoTablero = tamañoTablero;
		this.disponible = true;
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

	public int getTamañoTablero() {
		return tamañoTablero;
	}

	public void setTamañoTablero(int tamañoTablero) {
		this.tamañoTablero = tamañoTablero;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int[][] getPosiciones() {
		return posiciones;
	}

	public void setPosiciones(int[][] posiciones) {
		this.posiciones = posiciones;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getSalto() {
		return salto;
	}

	public void setSalto(int salto) {
		this.salto = salto;
	}

	public void actualizarPosiciones(Posición[][] a) {
		this.n = 0;
		int[] x = {+1,+1,+2,+2,-1,-1,-2,-2};
		int[] y = {+2,-2,+1,-1,+2,-2,+1,-1};
		
		for(int i = 0; i < x.length ; i++) {
			if(this.coordenadaX + x[i] < this.tamañoTablero && 
				this.coordenadaX + x[i] >= 0 &&
				this.coordenadaY + y[i] < this.tamañoTablero &&
				this.coordenadaY + y[i] >= 0 &&
				a[this.coordenadaX + x[i]][this.coordenadaY + y[i]].isDisponible()) {
					this.posiciones[n][0] = this.coordenadaX + x[i];
					this.posiciones[n][1] = this.coordenadaY + y[i];
					n++;
			}
		}
	}
	
	public int[] menor(Posición[][] a) {
		int[] coordenadas = new int[2];
		int menor = 9;
		for(int i = 0 ; i < this.posiciones.length ; i++) {
			if(a[this.posiciones[i][0]][this.posiciones[i][1]].getN() < menor &&
					a[this.posiciones[i][0]][this.posiciones[i][1]].isDisponible()) {
				menor = a[this.posiciones[i][0]][this.posiciones[i][1]].getN();
				coordenadas[0] = this.posiciones[i][0];
				coordenadas[1] = this.posiciones[i][1];
			}
		}
		return coordenadas;
	}
	

	
	

}
