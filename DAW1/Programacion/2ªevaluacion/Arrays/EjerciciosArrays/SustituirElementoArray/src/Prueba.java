
public class Prueba {
  
  public static void main(String[] args) {
    System.out.println("Introduce tamaño de array : ");
    int tamaño = InputData.leerEntero();
    System.out.println("Introduce cuantos elementos ocupados : ");
    int n = InputData.leerEntero();
    Array arrayEnteros = InputData.leerArrayEnteros(tamaño, n);
    arrayEnteros.llenarArrayEnteros();
    System.out.println(arrayEnteros.mostrarArray());
    System.out.println("Introduce elemento a sustituir : ");
    int elemento = InputData.leerEntero();
    System.out.println("Introduce nuevo elemento : ");
    int nuevoElemento = InputData.leerEntero();
    arrayEnteros.sustituirElementoArray(elemento, nuevoElemento);
    System.out.println(arrayEnteros.mostrarArray());
  }

}
