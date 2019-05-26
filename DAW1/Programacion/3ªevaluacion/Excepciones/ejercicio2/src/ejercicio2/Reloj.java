package ejercicio2;

public class Reloj {

	private int hora;
	private int minutos;
	private int segundos;
	private int formato;
	private String amPm;
	
	public Reloj(int hora, int minutos, int segundos, int formato) {
		try {
			this.hora = hora;
			this.minutos = minutos;
			this.segundos = segundos;
			this.formato = formato;
			this.validarHora(this);
			this.ponHora(this);
		}catch(Exception e) {
			System.out.print(e.getMessage() + " -> ");
		}
	}
	
	public void validarHora(Object o) throws Exception {
		Reloj r = (Reloj)o;
		if(this.hora > 24 || this.hora < 0 ) {
			throw new Exception("Hora no válida");
		}else if(this.minutos > 60 || this.minutos < 0 ) {
			throw new Exception("Minutos no válida");
		}else if(this.segundos > 60 || this.segundos < 0 ) {
			throw new Exception("Segundos no válida");
		}
	}
	
	public void ponHora(Object o) {
		Reloj r = (Reloj)o;
		if(this.formato == 12 && this.hora > 12) {
			this.hora = this.hora - 12;
			this.amPm = " pm";
		}else if(this.formato == 12 && this.hora < 13) {
			this.amPm = " am";
		}else {
			this.amPm = "";
		}
	}

	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hora + ":" + minutos + ":" + segundos + amPm;
	}
	
	
	
	
}
