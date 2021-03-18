package modelo;

public interface Gestionable {

	
	/**
	 *Si los datos se validan, este metodo se encarga de obtener el número del 
	 *primer elemento libre del array de Coches. Necesita el campo de alquiler
	 *para saber si es alquiler o compra 
	 * @param nombre
	 * @param apellidos
	 * @param socio
	 * @return
	 */
	public boolean darAltaCoche(String matricula,String datosCoche,float cantidad,boolean alquiler);
	/**
	 * Ingresa el coche en el array de Coches de la aplicacion
	 * 
	 * @param miembro
	 *            que puede ser socio o agregado
	 * @return true si el miembro se ha podido insertar y false en caso
	 *         contrario
	 */
	public boolean ingresarCoche(Coche coche);

	/**
	 * nos da los datos de un coche concreto
	 * @param indice valor entre 0 y 9 que indica el orden del coche en el el array
	 * @return El coche si existe o null en caso contrario
	 */
	public Coche getCoche(int indice);
	
	/**
	 * Este metodo se encarga de unificar las llamadas a la clase Validacion
	 * es lo que se conoce como un método delegado
	 * @param nombre
	 * @param apellidos
	 * @param cantidad
	 * @return
	 */
	public boolean validarDatos(String matricula,String datosCoche);
}
