
public class Coche {
	
	private String modelo;
	private Color color;
	private boolean pinturaMetalizada;
	private String matricula;
	private TipoDeCoche tipoCoche;
	private int añoFabricacion;
	private TipoDeSeguro modalidadSeguro;
	
	public Coche(String modelo, Color color, boolean pinturaMetalizada,
			String matricula, TipoDeCoche tipoCoche, int añoFabricacion,
			TipoDeSeguro modalidadSeguro) {

		this.modelo = modelo;
		this.color = color;
		this.pinturaMetalizada = pinturaMetalizada;
		this.matricula = matricula;
		this.tipoCoche = tipoCoche;
		this.añoFabricacion = añoFabricacion;
		this.modalidadSeguro = modalidadSeguro;
	}
	
	public Coche() {
		/*System.out.println("Modelo: ");
		this.modelo = InputData.nextLine();
		System.out.println("Color: ");
		this.color = InputData.nextLine();
		System.out.println("Pintura Metalizada(True/False): ");
		this.pinturaMetalizada = InputData.nextBoolean();
		System.out.println("Matrícula: ");
		this.matricula = InputData.nextLine();
		System.out.println("Tipo de coche: ");
		this.tipoCoche = InputData.nextLine();
		System.out.println("Año de fabricación: ");
		this.añoFabricacion = InputData.nextInt();
		System.out.println("Modalidad de seguro: ");
		this.modalidadSeguro = InputData.nextLine();*/
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isPinturaMetalizada() {
		return pinturaMetalizada;
	}

	public void setPinturaMetalizada(boolean pinturaMetalizada) {
		this.pinturaMetalizada = pinturaMetalizada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoDeCoche getTipoCoche() {
		return tipoCoche;
	}

	public void setTipoCoche(TipoDeCoche tipoCoche) {
		this.tipoCoche = tipoCoche;
	}

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public TipoDeSeguro getModalidadSeguro() {
		return modalidadSeguro;
	}

	public void setModalidadSeguro(TipoDeSeguro modalidadSeguro) {
		this.modalidadSeguro = modalidadSeguro;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", color=" + color
				+ ", pinturaMetalizada=" + pinturaMetalizada + ", matricula="
				+ matricula + ", tipoCoche=" + tipoCoche + ", añoFabricacion="
				+ añoFabricacion + ", modalidadSeguro=" + modalidadSeguro + "]";
	}
	
	public String visualizar() {
		return toString();
	}
	
	public boolean equals(Object arg0) {
		Coche c=(Coche)arg0;
		
		if(
			this.modelo.equals(c.modelo)&&
			this.color.equals(c.color)&&
			this.pinturaMetalizada==c.pinturaMetalizada &&
			this.matricula.equals(c.matricula)&&
			this.tipoCoche.equals(c.tipoCoche)&&
			this.añoFabricacion==c.añoFabricacion &&
			this.modalidadSeguro.equals(c.modalidadSeguro)
			)
		{
			return true;
		}else
		{
			return false;
		}
	}

	public int compareTo(String arg0) {
		return matricula.compareTo(arg0);
	}
	
}
