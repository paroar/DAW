
public class Tiempo implements Comparable{

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
	public int compareTo(Object arg0) {
		Tiempo t = (Tiempo)arg0;
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
