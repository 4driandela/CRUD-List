import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VerificarTest {

    @org.junit.jupiter.api.Test
    void verificarInt() {
        int numero = 6;
        boolean resultado;

        resultado = Verificar.verificarInt(1, 6, numero);
        assertTrue(resultado);

        numero = 8;
        resultado = Verificar.verificarInt(1, 6, numero);
        assertFalse(resultado);
    }

    @org.junit.jupiter.api.Test
    void verificarListVacia() {
        boolean resultado;
        Galeria lista = new Galeria();

        resultado = Verificar.verificarListVacia(lista);
        assertTrue(resultado);

        lista.addPelicula(new Pelicula("Avatar", "James Cameron", "Aventura"));
        resultado = Verificar.verificarListVacia(lista);
        assertFalse(resultado);
    }
}