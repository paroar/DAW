import java.util.Arrays;

public class Prueba {
  
  public static void main(String[] args) {
    System.out.println("Introduce tama�o de array : ");
    int tama�o = InputData.leerEntero();
    System.out.println("Introduce cuantos elementos ocupados : ");
    int n = InputData.leerEntero();
    Array arrayEnteros = InputData.leerArrayEnteros(tama�o, n);
    arrayEnteros.llenarArrayEnteros();
    System.out.println(arrayEnteros.mostrarArray());
    Array sumaParesImpares = arrayEnteros.sumaParesImpares();
    System.out.println(sumaParesImpares.mostrarArray());
  }

}
