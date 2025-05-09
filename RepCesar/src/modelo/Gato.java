package modelo;
/**
 * Clase Gato que hereda de la clase Animal
 * @author Cesar
 * @version 1.0
 */
public class Gato extends Animal {
	
	/**
     * Constructor de la clase Gato
     * @param nombre del gato
     */
	public Gato(String nombre) {
		super(nombre);
	}

	/**
     * Devuelve la onomatopeya del gato
     * @return Onomatopeya del gato ("Miau")
     */
	@Override
	public String onomatopeya() {
		return "Miau";
	}
}
