import java.util.Arrays;

public class Prueba {
  
  public static void main(String[] args) {
    System.out.println("Introduce tamaño de array : ");
    int tamaño = InputData.leerEntero();
    System.out.println("Introduce cuantos elementos ocupados : ");
    int n = InputData.leerEntero();
    Array arrayEnteros = InputData.leerArrayEnteros(tamaño, n);
    arrayEnteros.llenarArrayEnteros();
    System.out.println(arrayEnteros.mostrarArray());
    Array posNegNul = arrayEnteros.contarPosNegNul();
    System.out.println(posNegNul.mostrarArray());
  }

}
