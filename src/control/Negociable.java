package control;

public interface Negociable {
	/**
	 * Obtiene la cantidad de plazo o amortizacion dependiendo de si es un Alquiler
	 * o una Compra
	 * 
	 * @param numero
	 * @return
	 */
	public float getValor(int numero);

	/**
	 * Nos dice si un coche es de tipo alquier o de tipo compra
	 * 
	 * @param numero
	 * @return
	 */
	public boolean isAlquiler(int numero);

	/**
	 * Este metodo retona, separados en dos String, por un lado el nombre y por otro
	 * los apellidos del miembro con el numero de orden en el array indicado por el
	 * parametro
	 * 
	 * @param numero
	 * @return
	 */
	public String[] obtenDatosCoche(int numero);

	/**
	 * Se le pasa el numero de coche al que debemos preguntar si aprueba o no la
	 * accion y l cantidad que aporta
	 * 
	 * @param numero
	 * @param cantidad
	 * @return
	 */
	public boolean aprobarContrato(int numero, float cantidad);

}
