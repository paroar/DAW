package ejercicio3;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha[] f = new Fecha[30];
		for(int i = 0; i < f.length ; i++) {
			f[i] =  Fecha.validarFecha((int)(Math.random()*50),(int)(Math.random()*20),2000);
			System.out.println(f[i]);
		}
	}

}
