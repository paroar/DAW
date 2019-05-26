
public class Prueba {
  
  public static void main(String[] args) {
    System.out.println("Introduce tamaño de array : ");
    int tamaño = InputData.leerEntero();
    System.out.println("Introduce cuantos elementos ocupados : ");
    int n = InputData.leerEntero();
    Array arrayEnterosA = InputData.leerArrayEnteros(tamaño, n);
    arrayEnterosA.llenarArrayEnteros();
    System.out.println(arrayEnterosA.mostrarArray());
    
    System.out.println("Introduce tamaño de array : ");
    tamaño = InputData.leerEntero();
    System.out.println("Introduce cuantos elementos ocupados : ");
    n = InputData.leerEntero();
    Array arrayEnterosB = InputData.leerArrayEnteros(tamaño, n);
    arrayEnterosB.llenarArrayEnteros();
    System.out.println(arrayEnterosB.mostrarArray());
    
    boolean iguales = Array.sonIgualesContenidoArrays(arrayEnterosA, arrayEnterosB);
    System.out.println(iguales+"\n"
        +arrayEnterosA.mostrarArray()+"\n"
        +arrayEnterosB.mostrarArray());
  }

}
