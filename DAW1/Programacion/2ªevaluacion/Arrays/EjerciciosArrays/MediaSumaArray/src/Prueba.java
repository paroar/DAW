
public class Prueba {
  
  public static void main(String[] args) {
    System.out.println("Introduce tamaño de array : ");
    int tamaño = InputData.leerEntero();
    System.out.println("Introduce cuantos elementos ocupados : ");
    int n = InputData.leerEntero();
    Array arrayEnteros = InputData.leerArrayEnteros(tamaño, n);
    arrayEnteros.llenarArrayEnteros();
    System.out.println(arrayEnteros.mostrarArray());
    float media = arrayEnteros.mediaArray();
    System.out.println("La media del array es : "+media);
  }

}
