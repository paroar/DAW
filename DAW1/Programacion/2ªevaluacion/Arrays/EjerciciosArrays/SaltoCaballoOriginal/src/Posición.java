import java.util.Arrays;

public class Posición {
	private int coordenadaX;
	private int coordenadaY;
	private boolean disponible;
	private int[][] posiciones = new int[8][2];
	private int n;
	private int salto;
	
	public Posición(int m, int coordenadaX, int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.disponible = true;
		if(this.coordenadaX+1 < m && this.coordenadaX+1 >= 0 && this.coordenadaY+2 < m && this.coordenadaY+2 >= 0) {
			this.posiciones[n][0] = this.coordenadaX+1;
			this.posiciones[n][1] = this.coordenadaY+2;
			n++;
		}
		if(this.coordenadaX+2 < m && this.coordenadaX+2 >= 0 && this.coordenadaY+1 < m && this.coordenadaY+1 >= 0) {
			this.posiciones[n][0] = this.coordenadaX+2;
			this.posiciones[n][1] = this.coordenadaY+1;
			n++;
		}
		if(this.coordenadaX+2 < m && this.coordenadaX+2 >= 0 && this.coordenadaY-1 < m && this.coordenadaY-1 >= 0) {
			this.posiciones[n][0] = this.coordenadaX+2;
			this.posiciones[n][1] = this.coordenadaY-1;
			n++;
		}
		if(this.coordenadaX+1 < m && this.coordenadaX+1 >= 0 && this.coordenadaY-2 < m && this.coordenadaY-2 >= 0) {
			this.posiciones[n][0] = this.coordenadaX+1;
			this.posiciones[n][1] = this.coordenadaY-2;
			n++;
		}
		if(this.coordenadaX-1 < m && this.coordenadaX-1 >= 0 && this.coordenadaY-2 < m && this.coordenadaY-2 >= 0) {
			this.posiciones[n][0] = this.coordenadaX-1;
			this.posiciones[n][1] = this.coordenadaY-2;
			n++;
		}
		if(this.coordenadaX-2 < m && this.coordenadaX-2 >= 0 && this.coordenadaY-1 < m && this.coordenadaY-1 >= 0) {
			this.posiciones[n][0] = this.coordenadaX-2;
			this.posiciones[n][1] = this.coordenadaY-1;
			n++;
		}
		if(this.coordenadaX-2 < m && this.coordenadaX-2 >= 0 && this.coordenadaY+1 < m && this.coordenadaY+1 >= 0) {
			this.posiciones[n][0] = this.coordenadaX-2;
			this.posiciones[n][1] = this.coordenadaY+1;
			n++;
		}
		if(this.coordenadaX-1 < m && this.coordenadaX-1 >= 0 && this.coordenadaY+2 < m && this.coordenadaY+2 >= 0) {
			this.posiciones[n][0] = this.coordenadaX-1;
			this.posiciones[n][1] = this.coordenadaY+2;
			n++;
		}
	}
	
	public void actualizarN(Posición[][] a, int m) {
		this.n = 0;
		Posición[][] p = (Posición[][])a;
		if(this.coordenadaX+1 < m && this.coordenadaX+1 >= 0 && this.coordenadaY+2 < m && this.coordenadaY+2 >= 0 && p[this.coordenadaX+1][this.coordenadaY+2].isDisponible()) {
			this.posiciones[n][0] = this.coordenadaX+1;
			this.posiciones[n][1] = this.coordenadaY+2;
			n++;
		}
		if(this.coordenadaX+2 < m && this.coordenadaX+2 >= 0 && this.coordenadaY+1 < m && this.coordenadaY+1 >= 0 && p[this.coordenadaX+2][this.coordenadaY+1].isDisponible()) {
			this.posiciones[n][0] = this.coordenadaX+2;
			this.posiciones[n][1] = this.coordenadaY+1;
			n++;
		}
		if(this.coordenadaX+2 < m && this.coordenadaX+2 >= 0 && this.coordenadaY-1 < m && this.coordenadaY-1 >= 0 && p[this.coordenadaX+2][this.coordenadaY-1].isDisponible()) {
			this.posiciones[n][0] = this.coordenadaX+2;
			this.posiciones[n][1] = this.coordenadaY-1;
			n++;
		}
		if(this.coordenadaX+1 < m && this.coordenadaX+1 >= 0 && this.coordenadaY-2 < m && this.coordenadaY-2 >= 0 && p[this.coordenadaX+1][this.coordenadaY-2].isDisponible()) {
			this.posiciones[n][0] = this.coordenadaX+1;
			this.posiciones[n][1] = this.coordenadaY-2;
			n++;
		}
		if(this.coordenadaX-1 < m && this.coordenadaX-1 >= 0 && this.coordenadaY-2 < m && this.coordenadaY-2 >= 0 && p[this.coordenadaX-1][this.coordenadaY-2].isDisponible()) {
			this.posiciones[n][0] = this.coordenadaX-1;
			this.posiciones[n][1] = this.coordenadaY-2;
			n++;
		}
		if(this.coordenadaX-2 < m && this.coordenadaX-2 >= 0 && this.coordenadaY-1 < m && this.coordenadaY-1 >= 0 && p[this.coordenadaX-2][this.coordenadaY-1].isDisponible()) {
			this.posiciones[n][0] = this.coordenadaX-2;
			this.posiciones[n][1] = this.coordenadaY-1;
			n++;
		}
		if(this.coordenadaX-2 < m && this.coordenadaX-2 >= 0 && this.coordenadaY+1 < m && this.coordenadaY+1 >= 0 && p[this.coordenadaX-2][this.coordenadaY+1].isDisponible()) {
			this.posiciones[n][0] = this.coordenadaX-2;
			this.posiciones[n][1] = this.coordenadaY+1;
			n++;
		}
		if(this.coordenadaX-1 < m && this.coordenadaX-1 >= 0 && this.coordenadaY+2 < m && this.coordenadaY+2 >= 0 && p[this.coordenadaX-1][this.coordenadaY+2].isDisponible()) {
			this.posiciones[n][0] = this.coordenadaX-1;
			this.posiciones[n][1] = this.coordenadaY+2;
			n++;
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[][] getPosiciones() {
		return posiciones;
	}

	public void setPosiciones(int[][] posiciones) {
		this.posiciones = posiciones;
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

	@Override
	public String toString() {
		return "Posición [coordenadaX=" + coordenadaX + ", coordenadaY="
				+ coordenadaY + ", disponible=" + disponible + ", posiciones="
				+ Arrays.toString(posiciones) + ", salto=" + salto + "]";
	}
	
	
	

}
