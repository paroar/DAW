
public class Fecha implements Comparable{
	
   private int dia;
   private int mes;
   private int a�o;
   
   public Fecha(){
	   
   }
   
   public Fecha(int dia, int mes, int a�o){
	   this.dia=dia;
	   this.mes=mes;
	   this.a�o=a�o;
   }
   
   @Override
   public String toString(){
	   String s="FECHA";
	   s=s +this.dia+"/"+this.mes+"/"+this.a�o;
	   return s;
   }
   
   @Override
   public int compareTo(Object o) {	
	   Fecha f=(Fecha)o;
	   if (this.a�o>f.a�o)return 1;
	   else if(this.a�o< f.a�o) return -1;
	   else if (this.mes > f.mes) return 1;
	   else if (this.mes < f.mes) return -1;
	   else 	return 0;
   }
   
}
