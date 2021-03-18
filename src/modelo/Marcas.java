package modelo;

public class Marcas {
	private static String marca[] = { "opel", "mercedes", "bmw", "volkswagen", "seat", "audi", "renault", "peugeot",
			"fiat" };

	public static boolean validaMarca(String brand) {
		boolean retorno = false;
		for (int i = 0; i < marca.length; i++) {
			if (marca[i].equalsIgnoreCase(brand))
				retorno = true;
		}
		return retorno;
	}
}
