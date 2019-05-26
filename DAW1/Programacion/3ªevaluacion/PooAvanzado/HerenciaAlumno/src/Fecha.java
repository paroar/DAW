
public class Fecha implements Comparable{

	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha(int dia, int mes, int anyo) {
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Fecha f=(Fecha)o;
		return 0;
	}
}
