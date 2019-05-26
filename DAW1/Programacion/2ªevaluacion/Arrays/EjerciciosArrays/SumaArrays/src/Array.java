
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
  
  public static Array suma(Array a, Array b) {
    if(a.getN() < b.getN()) {
      Array c = InputData.leerArrayEnteros(b.getN(), b.getN());
      for(int i = 0; i < c.getN(); i++) {
        c.setElementoArray(i, a.getElementoArray(i)+b.getElementoArray(i));
      }
      return c;
    } else {
      Array c = InputData.leerArrayEnteros(a.getN(), a.getN());
      for(int i = 0; i < c.getN(); i++) {
        c.setElementoArray(i, a.getElementoArray(i)+b.getElementoArray(i));
      }
      return c;
    }
  }
  
}
