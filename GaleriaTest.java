import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GaleriaTest {

    @Test
    void addPelicula() {
        Galeria lista = new Galeria();

        System.out.println("Longitud inicio " + lista.longitudLista());
        assertFalse(lista.longitudLista() > 0);

        lista.addPelicula(new Pelicula("Futurama: El juego de Bender", "Dwayne Carey-Hill", "Animación"));

        System.out.println("Longitud final " + lista.longitudLista());
        assertTrue(lista.longitudLista() > 0);
    }

    @Test
    void removePelicula() {
        Galeria lista = new Galeria();
        lista.addPelicula(new Pelicula("Futurama: El juego de Bender", "Dwayne Carey-Hill", "Animación"));

        System.out.println("Longitud inicio " + lista.longitudLista());
        assertTrue(lista.longitudLista() > 0);

        lista.removePelicula(0);

        System.out.println("Longitud final " + lista.longitudLista());
        assertFalse(lista.longitudLista() > 0);
    }

    @Test
    void longitudLista() {
        Galeria lista = new Galeria();

        System.out.println("Longitud inicio " + lista.longitudLista());
        assertEquals(lista.longitudLista(), 0);

        lista.addPelicula(new Pelicula("Futurama: El juego de Bender", "Dwayne Carey-Hill", "Animación"));

        System.out.println("Longitud final " + lista.longitudLista());
        assertEquals(lista.longitudLista(), 1);
    }
}