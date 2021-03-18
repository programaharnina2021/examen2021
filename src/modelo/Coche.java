package modelo;

public abstract class Coche {
	private String matricula;
	private String datosCoche;
		
	 
	
	public Coche(String matricula, String datosCoche) {
		super();
		this.matricula = matricula;
		this.datosCoche = datosCoche.replace(" ", ";");
	}

	public abstract float getValor();



	public String getMatricula() {
		return matricula;
	}



	public String getDatosCoche() {
		return datosCoche;
	}
		
}
