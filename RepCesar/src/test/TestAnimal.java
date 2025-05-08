package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import modelo.Perro;
import modelo.Gato;
/**
 * Clase TestAnimal para comprobar que los métodos funcionen
 * @author Cesar
 * @version 1.0
 */
class TestAnimal {
	
	@Test
    public void testSonidoPerro() {
        Perro perro = new Perro("Toby1");
        assertEquals("Guau", perro.onomatopeya());
    }

    @Test
    public void testSonidoGato() {
        Gato gato = new Gato("Miau");
        assertEquals("Miau", gato.onomatopeya());
        }
}