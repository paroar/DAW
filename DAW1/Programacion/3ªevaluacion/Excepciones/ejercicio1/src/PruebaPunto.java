
public class PruebaPunto {

	public static void main(String[] args) {
				
		Punto p1=new Punto(1,2);
		Punto p2=new Punto(5,2);
		Punto p3=null;

			try {
				double distancia = p1.distanciaOtroPunto(p3);
				System.out.println(distancia);	
			}catch(MiExcepcionPunteroNulo e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}		
	

}
