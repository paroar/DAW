
public class Hora implements Comparable{

	private int hora;
	private int minuto;
	
	public Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	@Override
	public int compareTo(Object o) {
		Hora h = (Hora)o;
		if(this.hora > h.hora) {
			return 1;
		}else if(this.hora < h.hora) {
			return -1;
		}else if(this.minuto > h.minuto) {
			return 1;
		}else if(this.minuto < h.minuto) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public String toString() {
		return this.hora+":"+this.minuto;
	}

}
