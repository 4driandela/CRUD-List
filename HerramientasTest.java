import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HerramientasTest {
    /*Para pedirInt y pedirString no pude realizar la prueba porque no deja escribir por consola o no he logrado
     * saber como hacerlo*/
    @Test
    void convertirAMinus() {
        String palabraMay = "HolA";
        String palabraMin;

        palabraMin = Herramientas.convertirAMinus(palabraMay);

        assertEquals(palabraMin, "hola");
        assertTrue(palabraMin != palabraMay);
    }
}