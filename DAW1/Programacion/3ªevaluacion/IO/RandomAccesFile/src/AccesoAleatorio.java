import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class AccesoAleatorio {

	public static void escribir(RandomAccessFile raf, String name, int age, char sex) {
		try {
			raf.seek(raf.length());
			raf.writeUTF(name);
			raf.writeInt(age);
			raf.writeChar(sex);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	//TODO
	public static void copiar(RandomAccessFile raf) {
		try {
			RandomAccessFile newRaf = new RandomAccessFile("D:\\accesoAleatorio2.ddr","rw");
			String name;
			int age;
			char sex;
			raf.seek(0);
			while(raf.getFilePointer() < raf.length()) {
				name = raf.readUTF();
				age = raf.readInt();
				sex = raf.readChar();
				newRaf.writeUTF(name);
				newRaf.writeInt(age);
				newRaf.writeChar(sex);
			}
			File file = new File("accesoAleatorio.ddr");
			file.delete();
			//File newFile = new File("accesoAleatorio2.ddr");
			//newFile.renameTo(file);
		}catch(IOException e){
			System.out.println(e);
		}
	}
	
	//TODO
	public static void cambiarNombre() {
		File file = new File("D:\\Nuevo documento de texto.txt");
		file.renameTo(new File("D:\\Nuevo documento de texto cambiado.txt"));
		File newFile = new File("D:\\Nuevo documento de texto.txt");
		file.delete();
		newFile.renameTo(file);
	}
	
	public static void buscar(RandomAccessFile raf, String inputName) {
		try {
			boolean contains = false;
			String name;
			int age;
			char sex;
			raf.seek(0);
			while(raf.getFilePointer() < raf.length()) {
				name = raf.readUTF();
				if(name.equals(inputName)) {
					contains = true;
					age = raf.readInt();
					sex = raf.readChar();
					System.out.println(name +"\n"+ age +"\n"+ sex +"\n");
				}else {
					raf.skipBytes(6);
				}
			}
			if(!contains) {
				System.out.println("No hay nadie llamado " + inputName +"\n");
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}

	public static void mostrar(RandomAccessFile raf) {
		try {
			String name;
			int age;
			char sex;
			raf.seek(0);
			while(raf.getFilePointer() < raf.length()) {
				name = raf.readUTF();
				age = raf.readInt();
				sex = raf.readChar();
				System.out.println(name +"\n"+ age +"\n"+ sex +"\n");
			}	
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
