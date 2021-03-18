package modelo;

public class Compra extends Coche {
	private float amortizacion;
	
	public Compra(String matricula, String datosCoche, float amortizacion) {
		super(matricula, datosCoche);
		this.amortizacion = amortizacion;
	}

	@Override
	public float getValor() {
		return this.amortizacion;
	}

}
