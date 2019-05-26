import java.util.Scanner;

public class InputData {

  public static int leerEntero() {
    Scanner teclado = new Scanner(System.in);
    int entero = teclado.nextInt();
    return entero;
  }
  
  public static Array leerArrayEnteros(int tamaño, int n) {
    int[] array = new int[tamaño];
    Array arrayEnteros = new Array(array, n);
    return arrayEnteros;
  }
  
}
