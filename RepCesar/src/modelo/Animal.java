package modelo;
/**
 * Clase Animal que heredarán las clases Perro y Gato
 * @author Cesar
 * @version 1.0
 */
public class Animal {

	private String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + "]";
	}
	
	public String onomatopeya() {
		return "Onomatopeya desconocida";
	}
}
