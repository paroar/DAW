
public class PruebaPunto {

	public static void main(String[] args) {
				
		Punto t=new Punto();
		Punto u=new Punto();

		String distancia;
		distancia=t.distanciaAlOrigen();
		System.out.println(distancia);
		distancia=u.distanciaAlOrigen();
		System.out.println(distancia);
		
		distancia=t.distanciaOtroPunto(u);
		System.out.println(distancia);
		
		distancia=t.iguales(u);
		System.out.println(distancia);
		
	}

}
