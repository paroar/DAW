
public class Array {

  private int[] array;
  private int n;
  
  public Array(int[] array, int n) {
    this.array = array;
    this.n = n;
  }
  
  public int[] getArray() {
    return array;
  }
  
  public void setElementoArray(int i, int elemento) {
    this.array[i] = elemento;
  } 
  
  public String mostrarArray() {
    String salida = "[";
    for(int i = 0; i < this.n; i++) {
      if(i < this.n - 1) {
        salida += this.array[i] + ",";
      } else {
        salida += this.array[i];
      }
    }
    salida += "]";
    return salida;
  }
  
  public void llenarArrayEnteros() {
    System.out.println("Introduce "+this.n+" enteros : ");
    for(int i = 0; i < this.n; i++) {
      array[i] = InputData.leerEntero();
    }
  }
  
  public Array sumaParesImpares() {
    int par = 0; int impar = 0;
    for(int i = 0; i < this.n; i++) {
      if(this.array[i] % 2 == 0) {
        par += this.array[i];
      } else {
        impar += this.array[i];
      }
    }
    Array contador = InputData.leerArrayEnteros(2, 2);
    contador.setElementoArray(0, par);
    contador.setElementoArray(1, impar);
    return contador;
  }
}
