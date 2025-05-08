package modelo;
/**
 * Clase Gato que hereda de la clase Animal
 * @author Cesar
 * @version 1.0
 */
public class Gato extends Animal {
	
	public Gato(String nombre) {
		super(nombre);
	}

	@Override
	public String onomatopeya() {
		return "Miau";
	}
}
