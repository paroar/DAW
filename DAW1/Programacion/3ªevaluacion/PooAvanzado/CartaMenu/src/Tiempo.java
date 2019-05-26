
public class Tiempo implements Comparable {
	private int hora;
	private int min;
	
	public Tiempo() {
		
	}
	
	public Tiempo(int hora, int min) {
		this.hora = hora;
		this.validarMinutos(min);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.validarMinutos(min);
	}
	
	public void suma(Tiempo t) { //Crear
		this.hora += t.hora;
		this.min += t.min;
		this.validarMinutos(this.min);
	}

	@Override
	public int compareTo(Object o) {
		Tiempo t = (Tiempo)o;
		
		if (this.hora < t.hora)
			return -1;
		else if (this.hora > t.hora)
			return 1;
		else {
			if (this.min < t.min)
				return -1;
			else if (this.min > t.min)
				return 1;
			else
				return 0;
		}
	}

	@Override
	public String toString() {
		return this.hora + ":" + this.min;
	}
	
	public void validarMinutos(int min) {
		this.hora += min / 60;
		this.min = min % 60;
	}

}
