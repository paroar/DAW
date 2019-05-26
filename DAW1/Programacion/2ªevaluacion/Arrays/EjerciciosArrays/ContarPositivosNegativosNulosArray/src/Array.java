
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
  
  public Array contarPosNegNul() {
    int pos = 0; int neg = 0; int nul = 0;
    for(int i = 0; i < this.n; i++) {
      if(this.array[i] > 0) {
        pos++;
      } else if(this.array[i] < 0) {
        neg++;
      } else {
        nul++;
      }
    }
    Array contador = InputData.leerArrayEnteros(3, 3);
    contador.setElementoArray(0, pos);
    contador.setElementoArray(1, neg);
    contador.setElementoArray(2, nul);
    return contador;
  }
}
