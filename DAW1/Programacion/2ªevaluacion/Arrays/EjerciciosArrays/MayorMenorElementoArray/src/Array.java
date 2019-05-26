
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
  
  public int menorElementoArray() {
    int menor = this.array[0];
    for(int i = 0; i < this.n; i++) {
      if(menor > this.array[i]) {
        menor = this.array[i];
      }
    }
    return menor;    
  }
  
  public int mayorElementoArray() {
    int mayor = this.array[0];
    for(int i = 0; i < this.n; i++) {
      if(mayor < this.array[i]) {
        mayor = this.array[i];
      }
    }
    return mayor;    
  }
  
  public Array mayorMenorElementoArray() {
    int mayor = mayorElementoArray();
    int menor = menorElementoArray();
    Array mayorMenor = InputData.leerArrayEnteros(2, 2);
    mayorMenor.setElementoArray(0, mayor);
    mayorMenor.setElementoArray(1, menor);
    return mayorMenor;
  }
}
