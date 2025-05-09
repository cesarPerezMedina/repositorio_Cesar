package modelo;
/**
 * Clase Animal que heredarán las clases Perro y Gato
 * @author Cesar
 * @version 1.0
 */
public class Animal {

	private String nombre;
	
	/**
     * Constructor de la clase Animal
     * @param nombre del animal
     */
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
     * Obtiene el nombre del animal
     * @return Nombre del animal
     */
	public String getNombre() {
		return nombre;
	}

	/**
     * Establece el nombre del animal
     * @param nombre del animal
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + "]";
	}
	
	/**
     * Devuelve la onomatopeya del animal
     * @return Onomatopeya del animal
     */
	public String onomatopeya() {
		return "Onomatopeya desconocida";
	}
}
