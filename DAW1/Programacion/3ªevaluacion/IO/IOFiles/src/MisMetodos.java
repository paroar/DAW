import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MisMetodos {

	public static void a�adirEmpleado() {
		Scanner scanner = new Scanner(System.in);
		ObjectOutputStream oos;
		ObjectInputStream ois;
		try {
			File file = new File("C:\\Empleados");
			file.mkdir();
			System.out.println("Nombre: Apellido: Edad: Salario: Id:");
			String nombre = scanner.nextLine();
			String apellido = scanner.nextLine();
			int edad = scanner.nextInt();
			double salario = scanner.nextDouble();
			int id = scanner.nextInt();
			oos = new ObjectOutputStream(new FileOutputStream("C:\\Empleados\\" + id + ".ddr"));
			Empleado empleado = new Empleado(nombre, apellido, edad, salario, id);
			oos.writeUnshared(empleado);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {

		} catch (Exception e) {

		}
	}
	
	public static void buscarEmpleado(int id) {
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("C:\\Empleados\\" + id + ".ddr"));
			System.out.println(ois.readObject());
		} catch (FileNotFoundException e) {
			System.out.println("Esa id no existe en nuestros archivos");
		} catch (Exception e) {

		}
	}

	public static void mostrarEmpleados() {
		File file = new File("C:\\Empleados");
		String[] arrayFiles = file.list();
		ObjectInputStream ois;
		try {
			for (String i : arrayFiles) {
				ois = new ObjectInputStream(new FileInputStream("C:\\Empleados\\" + i));
				Object aux = ois.readObject();
				System.out.println(aux);
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} catch (Exception e) {

		}
	}

	public static void eliminarEmpleado(int id) {
		File file = new File("C:\\Empleados\\" + id + ".ddr");
		if(file.exists()) {
			file.delete();
		}else {
			System.out.println("Esa id no se encuentra en nuestros archivos");
		}
	}
	
	public static void eliminarBaseDatos() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Desea borrar la base de datos? s/n");
		if(scanner.nextLine().charAt(0)=='s') {
			File file = new File("C:\\Empleados");
			String[] arrayFiles = file.list();
			File empleado;
			for (String i : arrayFiles) {
				empleado = new File("C:\\Empleados\\" + i);
				empleado.delete();
			}
			file.delete();
		}
		System.out.println("***Base de datos borrada***");
	}

}
