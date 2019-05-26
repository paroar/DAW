import java.io.Serializable;
 
public class Empleado implements Comparable,Serializable{

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    private int nempleado;
    
    public Empleado(){
        this.nombre="";
        this.apellido="";
        this.edad=0;
        this.salario=0;
        this.nempleado=0;
    }
     
    public Empleado(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=0;
        this.salario=0;
        this.nempleado=0;
    }
     
    public Empleado (String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=0;
        this.nempleado=0;
    }

    public Empleado(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
        this.nempleado=0;
    }

    public Empleado(String nombre, String apellido, int edad, double salario, int nempleado){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
        this.nempleado=nempleado;
    }
    

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    public int getEdad() {
        return edad;
    }
 
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public double getSalario() {
        return salario;
    }
     
    public  void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNempleado() {
        return nempleado;
    }
 
    public void setNempleado(int nempleado) {
        this.nempleado = nempleado;
    }
     
    public boolean plus (double sueldoPlus){
        boolean aumento=false;
        if (edad>40){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }
     
    public boolean equals (Empleado a){
        if(a.getNombre().equals(nombre) && a.getApellido().equals(apellido)){
            return true;
        }else{
            return false;
        }
    }
     
    public int compareTo(Object arg){
            Empleado a =(Empleado)arg;
            int estado=-1;
            if(this.edad==a.getEdad()){
                estado=0;
            }else if(this.edad>a.getEdad()){
                estado=1;
            }
            return estado;
         
    }
     
    public String toString (){
        String mensaje="El empleado con id "+nempleado+" se llama "+nombre+" "+apellido+" con "+edad+" a�os " +
                "y un salario de "+salario;
        return mensaje;
    }
 
}