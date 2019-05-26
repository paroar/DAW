import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		Punto[] p = new Punto[3];
		for(int i = 0; i < 3 ; i++) {
			p[i] = new PuntoNombre(InputData.leerEntero(), InputData.leerEntero(), InputData.leerTexto());
		}
		
		System.out.println(Arrays.toString(p));
		
		PuntoNombre[] pn = new PuntoNombre[3];
		for(int i = 0; i < 3 ; i++) {
			//pn[i] = new Punto();
		}
		
		System.out.println(Arrays.toString(pn));
		
	}

}
