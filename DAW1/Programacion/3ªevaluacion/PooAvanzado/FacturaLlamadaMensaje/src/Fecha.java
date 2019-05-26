
public class Fecha {

	private int anyo;
	private int mes;
	private int dia;
	
	public Fecha(int anyo, int mes, int dia) {
		this.anyo = anyo;
		this.mes = mes;
		this.dia = dia;
	}
	
	public int compareTo(Fecha f) {
		if(this.anyo > f.anyo) {
			return 1;
		}else if(this.anyo < f.anyo) {
			return -1;
		}
		if(this.mes > f.mes) {
			return 1;
		}else if(this.mes < f.mes) {
			return -1;
		}
		if(this.dia > f.dia) {
			return 1;
		}else if(this.dia < f.dia) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		String s = this.anyo + "/"
				 + this.mes + "/"
				 + this.dia;
		return s;
	}
}
