
public class Mensaje implements Facturable {

	private Fecha fecha;
	private double tarifa;
	
	public Mensaje() {

	}

	public Mensaje(double tarifa, int dia, int mes, int anyo) {
		this.fecha = new Fecha(dia, mes, anyo);
		this.tarifa = tarifa;
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

	@Override
	public double importe() {
		// TODO Auto-generated method stub
		return this.tarifa;
	}

	@Override
	public Fecha obtenerFecha() {
		// TODO Auto-generated method stub
		return this.fecha;
	}
	
	@Override
	public String toString() {
		return "Mensaje [fecha=" + fecha.toString() + ", tarifa=" + tarifa + "]";
	}

	@Override
	public int compareTo(Facturable f) {
		// TODO Auto-generated method stub
		int compare=0;
		if(this.obtenerFecha().getAnyo() > f.obtenerFecha().getAnyo()){
			return 1;
		}else if(this.obtenerFecha().getAnyo() < f.obtenerFecha().getAnyo()){
			return -1;
		}
		if(this.obtenerFecha().getAnyo() == f.obtenerFecha().getAnyo()) {
			if(this.obtenerFecha().getMes() > f.obtenerFecha().getMes()){
				return 1;
			}else if(this.obtenerFecha().getMes() < f.obtenerFecha().getMes()){
				return -1;
			}
			if(this.obtenerFecha().getMes() == f.obtenerFecha().getMes()) {
				if(this.obtenerFecha().getDia() > f.obtenerFecha().getDia()){
					return 1;
				}else if(this.obtenerFecha().getDia() < f.obtenerFecha().getDia()){
					return -1;
				}else {
					return 0;
				}
			}
		}
		return compare;
	}

}
