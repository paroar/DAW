
public class Fecha {

	private int dia;
	private int mes;
	private int a�o;
	
	public Fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}
	
	public String toString() {
		return this.dia+"-" + this.mes + "-" + this.a�o;
	}
	
	public int compareTo(Fecha f) {
		if(this.a�o > f.a�o) {
			return 1;
		}else if(this.a�o < f.a�o) {
			return -1;
		}else if(this.mes > f.mes) {
			return 1;
		}else if(this.mes < f.mes) {
			return -1;
		}
		return 0;
	}
}
