package modelo;

/**
 * Clase Principal para probar los animales
 * @author Cesar
 * @version 1.0
 */
public class Principal {
	
	/**
     * Constructor por defecto de la clase Principal.
     */
    public Principal() {
        // Constructor vacío
    }
	
	/**
     * Método principal que crea objetos de las clases Perro y Gato 
     * y muestra sus nombres y onomatopeyas por consola
     * @param args Argumentos de la línea de comandos (no utilizados)
     */
	public static void main(String[] args) {
		
		Perro p1= new Perro("Toby");
		Gato g1= new Gato("Miau");
		
		System.out.println(p1.getNombre() + " hace: " + p1.onomatopeya());
        System.out.println(g1.getNombre() + " hace: " + g1.onomatopeya());
	}
}
