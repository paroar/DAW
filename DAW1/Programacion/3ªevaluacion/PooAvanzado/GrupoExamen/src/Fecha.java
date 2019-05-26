
public class Fecha implements Comparable{

	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public int compareTo(Object arg0) {
		Fecha f = (Fecha)arg0;
		if(this.anyo > f.anyo) {
			return 1;
		}else if(this.anyo < f.anyo) {
			return -1;
		}else if(this.mes > f.mes) {
			return 1;
		}else if(this.mes < f.mes) {
			return -1;
		}if(this.dia > f.dia) {
			return 1;
		}else if(this.dia < f.dia) {
			return -1;
		}
		return 0;
	}
	
	
	
}
