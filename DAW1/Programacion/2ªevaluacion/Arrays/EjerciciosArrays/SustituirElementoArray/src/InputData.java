import java.util.Scanner;

public class InputData {

  public static int leerEntero() {
    Scanner teclado = new Scanner(System.in);
    int entero = teclado.nextInt();
    return entero;
  }
  
  public static Array leerArrayEnteros(int tama�o, int n) {
    int[] array = new int[tama�o];
    Array arrayEnteros = new Array(array, n);
    return arrayEnteros;
  }
}
