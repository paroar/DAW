import java.util.Arrays;
public class Prueba {

	public static void main(String[] args) {
		
		String cadena1 = InputData.leerCadena();
		String cadena2 = InputData.leerCadena();
		
		String[] caracteresCadena1 = Separar.separarCaracteres(cadena1);
		String[] caracteresCadena2 = Separar.separarCaracteres(cadena2);
		String[] mezclaCadenas = Mezclar.mezclarCadenas(caracteresCadena1, caracteresCadena2);
		
		String mezcla = Arrays.toString(mezclaCadenas);
		System.out.println(mezcla);
		
	
	}

}
