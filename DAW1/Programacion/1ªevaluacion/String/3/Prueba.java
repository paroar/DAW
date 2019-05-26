
public class Prueba {

	public static void main(String[] args) {
		
		String cadena = InputData.leerCadena();
		String telefono = Telefono.numeroTelefono(cadena);

		System.out.println(telefono);
	}

}
