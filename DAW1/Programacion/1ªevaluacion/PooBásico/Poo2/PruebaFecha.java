
public class PruebaFecha {

	public static void main(String[] args) {
		
		Fecha t=new Fecha();
		Fecha u=new Fecha();
		t.validarFecha(t);
		u.validarFecha(u);	
		
		String compararFechas;
		compararFechas=t.compararDosFechas(u);
		System.out.println(compararFechas);
	}	
}
