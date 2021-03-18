package modelo;

import java.util.ArrayList;

public class GestionDatos implements Validable, Gestionable {

	private int longMax = 10;
	private ArrayList<Coche> coches = new ArrayList<>();

	@Override
	public boolean validarMatricula(String matricula) {
		if (matricula.length() == 7) {
			boolean resultado = true;
			for (int i = 0; i < 4 && resultado; i++) {
				resultado = Character.isDigit(matricula.charAt(i));
			}
			if (resultado) {
				resultado = Character.isSpaceChar(matricula.charAt(4));
			}
			for (int i = 5; i < matricula.length() && resultado; i++) {
				resultado = Character.isLetter(matricula.charAt(i));
			}
			return resultado;
		}
		return false;
	}

	@Override
	public boolean validarDatosCoche(String datosCoche) {
		boolean resultado = true;
		String[] split = datosCoche.split(" ");
		resultado = Marcas.validaMarca(split[0]);
		if (resultado) {
			resultado = split[2].equals("diesel") || split[2].equals("gasolina");
		}
		if (resultado) {
			resultado = Character.isDigit(split[3].charAt(0)) && Character.isDigit(split[3].charAt(2))
					&& split[3].charAt(1) == '.';
		}
		return resultado;
	}

	@Override
	public boolean darAltaCoche(String matricula, String datosCoche, float cantidad, boolean alquiler) {
		Coche coche;
		if (validarDatos(matricula, datosCoche)) {
			if (alquiler) {
				coche = new Alquiler(matricula, datosCoche, cantidad);
			} else {
				coche = new Compra(matricula, datosCoche, cantidad);
			}
			this.ingresarCoche(coche);
			return true;
		}
		return false;
	}

	@Override
	public boolean ingresarCoche(Coche coche) {
		if (this.coches.size() < this.longMax) {
			return this.coches.add(coche);
		}
		return false;
	}

	@Override
	public Coche getCoche(int indice) {
		if (this.coches.size() < this.longMax && this.coches.size() <= indice) {
			return this.coches.get(indice);
		}
		return null;
	}

	@Override
	public boolean validarDatos(String matricula, String datosCoche) {
		return validarMatricula(matricula) && validarDatosCoche(datosCoche);
	}

}
