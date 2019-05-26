
public class Llamada implements Facturable{

	private Fecha fecha;
	private double tarifa;
	private int duracion;
	
	public Llamada() {
		this.fecha=new Fecha();
	}
	
	public Llamada(Fecha fecha, double tarifa, int duracion) {
		this.fecha=fecha;
		this.tarifa=tarifa;
		this.duracion=duracion;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String toString() {
		String s="LL:";
		s = s+ this.fecha.toString()+"__"+this.tarifa;
		return s;
	}

	@Override
	public double importe() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String visualizar() {
		// TODO Auto-generated method stub
		return null;
	}
}


