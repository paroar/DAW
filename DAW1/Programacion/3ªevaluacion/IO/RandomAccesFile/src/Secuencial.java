import java.io.IOException;
import java.io.RandomAccessFile;

public class Secuencial {

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
}
