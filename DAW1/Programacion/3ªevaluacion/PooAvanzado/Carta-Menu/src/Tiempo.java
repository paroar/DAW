
public class Tiempo implements Comparable<Tiempo>{
	
	private int hora;
	private int minuto;
	
	public Tiempo(){
		this.hora=0;
		this.minuto=0;
	}
	
	public Tiempo(int hora, int minuto){
		this.hora=hora;
		this.minuto=minuto;
	}
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public void suma (Tiempo t){
		this.minuto=this.minuto + t.getMinuto();
		while(this.minuto>59){
			this.minuto=this.minuto-60;
			this.hora=this.hora+1;
		}
		this.hora= this.hora+t.getHora();
	}
	
	public void division (int n){
		int minutos=this.hora*3600+this.minuto*60+this.minuto;
		minutos=minutos/n;		
	
		this.minuto=minutos%60;
		this.hora=minutos/60;
	}
	
	public int compareTo(Tiempo t){
		return 1;
	}
	
	public String toString(){
		String s="";
		s = "["+this.hora+":"+this.minuto+"]";
		return s; 
	
	}
}
