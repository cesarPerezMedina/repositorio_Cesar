package modelo;
/**
 * Clase Perro que hereda de la clase Animal
 * @author Cesar
 * @version 1.0
 */
public class Perro extends Animal {

	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public String onomatopeya() {
		return "Guau";
	}
}
