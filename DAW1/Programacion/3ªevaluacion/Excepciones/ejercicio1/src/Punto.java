
public class Punto {

	int ejeAbscisas;
	int ejeOrdenadas;
	
	
	public Punto(int ejeAbscisas, int ejeOrdenadas) {
		this.ejeAbscisas = ejeAbscisas;
		this.ejeOrdenadas = ejeOrdenadas;
	}
	
	public int getEjeAbscisas() {
		return ejeAbscisas;
	}

	public void setEjeAbscisas(int ejeAbscisas) {
		this.ejeAbscisas = ejeAbscisas;
	}

	public int getEjeOrdenadas() {
		return ejeOrdenadas;
	}

	public void setEjeOrdenadas(int ejeOrdenadas) {
		this.ejeOrdenadas = ejeOrdenadas;
	}

	public String toString() {
		return "(" + ejeAbscisas + "," + ejeOrdenadas + ")";
	}
	
	public double distanciaAlOrigen() {
		double distancia = Math.sqrt(Math.pow(this.ejeAbscisas, 2) + Math.pow(this.ejeOrdenadas, 2));
		return distancia;
	}
	
	public double distanciaOtroPunto(Object arg0) throws Exception{
		Punto t=(Punto)arg0;
		double distancia;
		if(t == null) {
			throw new MiExcepcionPunteroNulo("Puntero nulo");
		}
		distancia=Math.sqrt(Math.pow(Math.abs(this.ejeAbscisas-t.ejeAbscisas),2) +
				            Math.pow(Math.abs(this.ejeOrdenadas-t.ejeOrdenadas),2));
		return distancia;
	}

	public boolean equals(Object arg0) {
		Punto t=(Punto)arg0;
		if(this.ejeAbscisas==t.ejeAbscisas && this.ejeOrdenadas==t.ejeOrdenadas) 
		{
			return true;
		}
		return false;
	}
}
