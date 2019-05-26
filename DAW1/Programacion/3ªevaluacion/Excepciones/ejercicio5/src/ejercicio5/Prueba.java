package ejercicio5;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		for(int i = 0; i < 9 ; i++) {
			random = (int)(Math.random()*10);
			try {
				if(random % 2 == 0) {
					throw new ParException();
				}else {
					throw new ImparException();
				}
			}catch(ParException e) {
				System.out.print(random + " ");
				System.out.println(e.getMessage());
			}catch(ImparException e) {
				System.out.print(random + " ");
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}	
			
		}

		
	}

}
