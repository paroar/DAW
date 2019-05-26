import java.util.Scanner;

public class InputData {
	
	public static int readInt(){  //*lee un entero
		Scanner teclado=new Scanner (System.in);
		int n;
		n=teclado.nextInt();
		return n;
	}

	public static double readDouble(){ //*lee un real 
		Scanner teclado=new Scanner (System.in);
		double n;
		n=teclado.nextDouble();
		return n;
	}
	
	public static boolean readBool(){ //*lee un booleano
		boolean b;
		int option;
		System.out.println("1:true-2:false");
		option=InputData.readInt();
		if (option==1) {
			b=true;
		}else {
			b=false;
		}
		return b;
	}
	
	public static String readString(){ // Lee una cadena
		String c;
		Scanner teclado=new Scanner (System.in);
		c=teclado.nextLine();
		return c;
	}

}
