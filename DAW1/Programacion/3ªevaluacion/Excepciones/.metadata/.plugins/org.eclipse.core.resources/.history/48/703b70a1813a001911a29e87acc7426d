
public class Punto {

	int ejeAbscisas;
	int ejeOrdenadas;
	
	
	//CONSTRUCTORES
	public Punto(int ejeAbscisas, int ejeOrdenadas) {
		this.ejeAbscisas = ejeAbscisas;
		this.ejeOrdenadas = ejeOrdenadas;
	}
	
	public Punto() {
		System.out.println("Introduce coordenadas de un punto: ");
		this.ejeAbscisas=InputData.nextInt();
		this.ejeOrdenadas=InputData.nextInt();
	}

	
	//GETTERS & SETTERS
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

	
	//TOSTRING & DISTANCIAS
	@Override
	public String toString() {
		return "(" + ejeAbscisas + "," + ejeOrdenadas + ")";
	}
	
	
	public String distanciaAlOrigen() {
		String res;
		double distancia;
		
		distancia=Math.sqrt(Math.pow(this.ejeAbscisas, 2)+Math.pow(this.ejeOrdenadas, 2));
		return "La distancia entre el eje de coordenadas y el punto "+this+" es de "+distancia;
	}
	
	public String distanciaOtroPunto(Object arg0) {
		Punto t=(Punto)arg0;
		String res;
		double distancia;
		
		distancia=Math.sqrt(Math.pow(Math.abs(this.ejeAbscisas-t.ejeAbscisas),2)
				+Math.pow(Math.abs(this.ejeOrdenadas-t.ejeOrdenadas),2));
		return "Los puntos "+this+" y "+t+" están a una distancia de "+distancia;
	}

	public String iguales(Object arg0) {
		Punto t=(Punto)arg0;
		if(this.ejeAbscisas==t.ejeAbscisas && this.ejeOrdenadas==t.ejeOrdenadas) 
		{
			return "Los puntos "+this+" y "+t+" son iguales";
		}else 
		{
			return "Los puntos "+this+" y "+t+" son distintos";
		}
		 
	}
}
