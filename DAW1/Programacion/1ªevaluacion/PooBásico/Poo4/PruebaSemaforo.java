
public class PruebaSemaforo {

	public static void main(String[] args) {
		
		Semaforo t= new Semaforo();
		Semaforo u= new Semaforo();
		Semaforo v= new Semaforo();

		int contador;
		contador=0;
		while(contador<2)
		{

			t.cambiarSemaforo();
			u.cambiarSemaforo();
			v.cambiarSemaforo();
			contador=contador+1;
		}
	
		String res;
		res=Semaforo.compararSemaforos(t, u, v);
		System.out.println(res);
		System.out.println(t);
		System.out.println(u);
		System.out.println(v);
	}

}
