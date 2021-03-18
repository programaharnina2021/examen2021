package modelo;

public class Alquiler extends Coche {
	private float plazoMeses;

	public Alquiler(String matricula, String datosCoche,float plazo) {
		super(matricula, datosCoche);
		this.plazoMeses=plazo;
	}

	@Override
	public float getValor() {
		return this.plazoMeses;
	}

}
