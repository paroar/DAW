
public class Fecha {

	private int dia;
	private int mes;
	private int año;
	
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public String toString() {
		return this.dia+"-" + this.mes + "-" + this.año;
	}
	
	public int compareTo(Fecha f) {
		if(this.año > f.año) {
			return 1;
		}else if(this.año < f.año) {
			return -1;
		}else if(this.mes > f.mes) {
			return 1;
		}else if(this.mes < f.mes) {
			return -1;
		}
		return 0;
	}
}
