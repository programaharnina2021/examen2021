package modelo;

public interface Validable {
	/**
	 * una matricula debe comenzar por cuatro numeros, un espacio y tres letras
	 * @param matricula
	 * @return true si la matricula es valida o false en caso contrario
	 */
	public boolean validarMatricula(String matricula);
	/**
	 * La primera palabra debe estar dentro de las marcas proporcionadas, la segunda
	 * debe ser una palabra, vale cualquiera. la tercera palabra debe ser gasolina o diesel
	 * finalmente debe haber una palabra que especifica la cilindrada y que
	 * tenga un número seguido de un punto y otro número:
	 * 1.0 ó 3.2. En total debe haber cuatro palabras
	 *
	 * @param datosCoche
	 * @return
	 */
	public boolean validarDatosCoche(String datosCoche);
	
	
}
