
public class Fecha implements Comparable{
	
   private int dia;
   private int mes;
   private int año;
   
   public Fecha(){
	   
   }
   
   public Fecha(int dia, int mes, int año){
	   this.dia=dia;
	   this.mes=mes;
	   this.año=año;
   }
   
   @Override
   public String toString(){
	   String s="FECHA";
	   s=s +this.dia+"/"+this.mes+"/"+this.año;
	   return s;
   }
   
   @Override
   public int compareTo(Object o) {	
	   Fecha f=(Fecha)o;
	   if (this.año>f.año)return 1;
	   else if(this.año< f.año) return -1;
	   else if (this.mes > f.mes) return 1;
	   else if (this.mes < f.mes) return -1;
	   else 	return 0;
   }
   
}
