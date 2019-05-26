package ejercicio3;

public class Fecha {

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

	public int getMes() {
		return mes;
	}

	public int getAnyo() {
		return anyo;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anyo;
	}
	
	public static Fecha validarFecha(int dia, int mes, int anyo) {
		try {
			if(mes > 12 || mes < 1) {
				throw new Exception("Mes no v�lido");
			}else if(dia > 31 || dia < 1) {
				throw new Exception("D�a no v�lido");
			}else if(dia > 28 && mes == 2) {
				throw new Exception("D�a no v�lido");
			}else if(dia > 30 && mes == 4 || mes == 6 ||  mes == 9 ||  mes == 11) {
				throw new Exception("D�a no v�lido");
			}	
		}catch(Exception e) {
			System.out.print(e.getMessage() + " -> ");
		}finally {
			return new Fecha(dia, mes, anyo);
		}
		
	}
		
	
}
