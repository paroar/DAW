import java.io.*;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf1 = new RandomAccessFile("D:\\Nuevo documento de texto.txt","rw");
			RandomAccessFile newRaf = new RandomAccessFile("D:\\Nuevo documento de texto2.txt","rw");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		AccesoAleatorio.cambiarNombre();
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("D:\\accesoAleatorio.ddr","rw");
		}catch(IOException e){
			System.out.println(e);
		}
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		char sex;
		int option;
		while(true) {
			System.out.println("\n--------------------\n"
					+"Elige una opci�n:\n"
					+"1. Escribir persona\n"
					+"2. Copiar archivo\n"
					+"3. Buscar persona\n"
					+"4. Mostrar archivo\n"
					+"5. Salir\n");
			option = scanner.nextInt();
			switch(option) {
				case 1: 
						System.out.println("1. Escribir persona\n");
						System.out.println("Name:");
						name = scanner.next();
						System.out.println("Age:");
						age = scanner.nextInt();
						System.out.println("Sex:");
						sex = scanner.next().charAt(0);
						AccesoAleatorio.escribir(raf,name,age,sex);
						break;
				case 2: 
						System.out.println("2. Copiando\n");
						AccesoAleatorio.cambiarNombre();
						break;
				case 3: 
						System.out.println("3. Buscar persona\n");
						System.out.println("Name:");
						name = scanner.next();
						AccesoAleatorio.buscar(raf,name);
						break;
				case 4: 
						System.out.println("4. Mostrar archivo\n");
						AccesoAleatorio.mostrar(raf);
						break;
				case 5: System.exit(1);
				default:
			}
		}
		
		
		
	}

}
