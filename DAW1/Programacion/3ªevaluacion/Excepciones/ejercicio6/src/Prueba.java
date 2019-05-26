import java.util.Arrays;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		int[] impar = new int[5];
		int n = 0;
		int tam = 6;
		int[] par = new int[tam];
		int m = 0;
		try {
			while(true) {
				random = (int)(Math.random()*10);
				System.out.println(random);
				if(random % 2 != 0) {
					impar[n] = random;
					n++;
				}else {
					par[m] = random;
					m++;
				}
				if(n == 5) {
					throw new Exception("Array impar lleno");
				}else if(m == tam) {
					throw new Exception("Array par lleno");
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Mostrar.array(impar,n));
		System.out.println(Mostrar.array(par,m));
	}

}
