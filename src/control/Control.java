package control;

import modelo.GestionDatos;

public class Control {
	private GestionDatos gestion;

	public boolean darAltaCoche(String matricula, String datosCoche, String cantidad, boolean alquiler) {
		return gestion.darAltaCoche(matricula, datosCoche, Float.valueOf(cantidad), alquiler);
	}
	
}
