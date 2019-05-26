
public class Tiempo implements Comparable<Tiempo>{

	private int hora;
	private int minuto;
	
	public Tiempo(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	@Override
	public String toString() {
		return hora + ":" + minuto;
	}

	@Override
	public int compareTo(Tiempo t) {
		if(this.hora > t.hora) {
			return 1;
		}else if(this.hora < t.hora) {
			return -1;
		}else if(this.minuto > t.minuto) {
			return 1;
		}else if(this.minuto < t.minuto) {
			return -1;
		}
		return 0;
	}

}
