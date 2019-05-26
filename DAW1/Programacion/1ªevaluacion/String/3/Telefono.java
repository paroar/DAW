
public class Telefono {

	public static String numeroTelefono(String texto) {
		
		String c1="", c2="", c3="";

		c1=texto.substring(0, 2);
		c2=texto.substring(2, 3);
		c3=texto.substring(3);
		
		return "("+c1+")-"+c2+"-"+c3;
		
	}
}
