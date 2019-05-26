import java.util.Arrays;

public class Posici�n {
	private int coordenadaX;
	private int coordenadaY;
	private int tama�oTablero;
	private boolean disponible;
	private int[][] posiciones = new int[8][2];
	private int n;
	private int salto;
	
	public Posici�n(int coordenadaX, int coordenadaY, int tama�oTablero) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.tama�oTablero = tama�oTablero;
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

	public int getTama�oTablero() {
		return tama�oTablero;
	}

	public void setTama�oTablero(int tama�oTablero) {
		this.tama�oTablero = tama�oTablero;
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

	public void actualizarPosiciones(Posici�n[][] a) {
		this.n = 0;
		int[] x = {+1,+1,+2,+2,-1,-1,-2,-2};
		int[] y = {+2,-2,+1,-1,+2,-2,+1,-1};
		
		for(int i = 0; i < x.length ; i++) {
			if(this.coordenadaX + x[i] < this.tama�oTablero && 
				this.coordenadaX + x[i] >= 0 &&
				this.coordenadaY + y[i] < this.tama�oTablero &&
				this.coordenadaY + y[i] >= 0 &&
				a[this.coordenadaX + x[i]][this.coordenadaY + y[i]].isDisponible()) {
					this.posiciones[n][0] = this.coordenadaX + x[i];
					this.posiciones[n][1] = this.coordenadaY + y[i];
					n++;
			}
		}
	}
	
	public int[] menor(Posici�n[][] a) {
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
