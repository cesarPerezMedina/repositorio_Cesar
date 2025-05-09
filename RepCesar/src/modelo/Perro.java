package modelo;
/**
 * Clase Perro que hereda de la clase Animal
 * @author Cesar
 * @version 1.0
 */
public class Perro extends Animal {

	/**
     * Constructor de la clase Perro
     * @param nombre del perro
     */
	public Perro(String nombre) {
		super(nombre);
	}

	/**
     * Devuelve la onomatopeya del perro
     * @return Onomatopeya del perro ("Guau")
     */
	@Override
	public String onomatopeya() {
		return "Guau";
	}
}
