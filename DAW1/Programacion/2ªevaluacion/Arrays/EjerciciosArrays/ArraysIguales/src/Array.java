
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
  
  public int getN() {
    return this.n;
  }
  
  public int getElementoArray(int i) {
    return this.array[i];
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
  
  public boolean esIgualContenidoArrays(Array o) {
    Array a = (Array)o;
    boolean repetir = true;
    int j = 0;
    int i = 0;
    while(i < this.getN() && repetir) {
      j = 0;
      outerloop:
      while(j < a.getN()) {
        repetir = false;
        if(this.getElementoArray(i) != a.getElementoArray(j)) {
          j++;
        } else {
          repetir = true;
          break outerloop;
        }
      }
      i++;
    }
    if(i == this.getN()) {
      return true;
    } else {
      return false;
    }
  }
  
  public static boolean sonIgualesContenidoArrays(Array primero, Array segundo) {
    if(primero.esIgualContenidoArrays(segundo) &&
        segundo.esIgualContenidoArrays(primero)) {
      return true;
    } else {
      return false;
    }
  }
  
}
