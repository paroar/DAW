
public class Llamada implements Facturable {

	private Fecha fecha;
	private String tfnoDestino;
	private double tarifa;
	private int duracion;
	
	public Llamada() {

	}
	
	public Llamada(String tfnoDestino, double tarifa, int duracion, int dia, int mes, int anyo) {
		this.fecha = new Fecha(dia, mes, anyo);
		this.tfnoDestino = tfnoDestino;
		this.tarifa = tarifa;
		this.duracion = duracion;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public String getTfnoDestino() {
		return tfnoDestino;
	}

	public void setTfnoDestino(String tfnoDestino) {
		this.tfnoDestino = tfnoDestino;
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

	@Override
	public double importe() {
		// TODO Auto-generated method stub
		return this.tarifa*this.duracion;
	}

	@Override
	public Fecha obtenerFecha() {
		// TODO Auto-generated method stub
		return this.fecha;
	}

	@Override
	public String toString() {
		return "Llamada [fecha=" + fecha.toString() + ", tfnoDestino=" + tfnoDestino + ", tarifa=" + tarifa + ", duracion="
				+ duracion + "]";
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
