import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccionListTest {

    @Test
    void añadirPelLista() {
        String titulo = "Avatar";
        String director = "James Cameron";
        String genero = "Aventura";

        Galeria lista = new Galeria();
        assertFalse(lista.longitudLista() > 0);

        AccionList.añadirPelLista(lista, titulo, director, genero);
        lista.longitudLista();

        assertTrue(lista.longitudLista() > 0);
    }

    @Test
    void buscarNombre() {
        Galeria lista = new Galeria();
        int resultado;
        int posEsperada;

        AccionList.añadirPelLista(lista, "Avatar", "James Cameron", "Aventura");
        AccionList.añadirPelLista(lista, "Capitan Fantástico", "Matt Ross", "Comedia");

        posEsperada = 1;
        resultado = AccionList.buscarNombre(lista, "Capitan Fantástico");
        assertEquals(resultado, posEsperada);
        posEsperada = -1;
        resultado = AccionList.buscarNombre(lista, "SinCoincidencia");
        assertEquals(resultado, posEsperada);
    }

    @Test
    void buscarGenero() {
        Galeria lista = new Galeria();

        AccionList.añadirPelLista(lista, "Avatar", "James Cameron", "Aventura");
        AccionList.añadirPelLista(lista, "Capitan Fantástico", "Matt Ross", "Comedia");


        assertTrue(AccionList.buscarGenero(lista, "Aventura"));
        assertFalse(AccionList.buscarGenero(lista, "SinCoincidencia"));

    }

    @Test
    void buscarDirector() {
        Galeria lista = new Galeria();

        AccionList.añadirPelLista(lista, "Avatar", "James Cameron", "Aventura");
        AccionList.añadirPelLista(lista, "Capitan Fantástico", "Matt Ross", "Comedia");


        assertTrue(AccionList.buscarDirector(lista, "Matt Ross"));
        assertFalse(AccionList.buscarDirector(lista, "SinCoincidencia"));
    }

    @Test
    void modificarNombre() {
        Galeria lista = new Galeria();

        AccionList.añadirPelLista(lista, "Avatar", "James Cameron", "Aventura");
        AccionList.añadirPelLista(lista, "Capitan Fantástico", "Matt Ross", "Comedia");

        assertTrue(lista.getCartelera().get(0).getNombre() == "Avatar");

        AccionList.modificarNombre(lista, 0, "Avatar 2");

        assertFalse(lista.getCartelera().get(0).getNombre() == "Avatar");
        assertTrue(lista.getCartelera().get(0).getNombre() == "Avatar 2");
    }

    @Test
    void modificarDirector() {
        Galeria lista = new Galeria();

        AccionList.añadirPelLista(lista, "Avatar", "James Cameron", "Aventura");
        AccionList.añadirPelLista(lista, "Capitan Fantástico", "Matt Ross", "Comedia");

        assertTrue(lista.getCartelera().get(1).getDirector() == "Matt Ross");

        AccionList.modificarDirector(lista, 1, "Pepe & Lola");

        assertFalse(lista.getCartelera().get(1).getDirector() == "Matt Ross");
        assertTrue(lista.getCartelera().get(1).getDirector() == "Pepe & Lola");
    }

    @Test
    void modificarGenero() {
        Galeria lista = new Galeria();

        AccionList.añadirPelLista(lista, "Avatar", "James Cameron", "Aventura");
        AccionList.añadirPelLista(lista, "Capitan Fantástico", "Matt Ross", "Comedia");

        assertTrue(lista.getCartelera().get(1).getGénero() == "Comedia");

        AccionList.modificarGenero(lista, 1, "Drama");

        assertFalse(lista.getCartelera().get(1).getGénero() == "Comedia");
        assertTrue(lista.getCartelera().get(1).getGénero() == "Drama");
    }

    @Test
    void borrarPelicula() {
        Galeria lista = new Galeria();
        int posicionBusquedaInicio;
        int posicionBusquedaFinal;

        AccionList.añadirPelLista(lista, "Avatar", "James Cameron", "Aventura");
        AccionList.añadirPelLista(lista, "Capitan Fantástico", "Matt Ross", "Comedia");

        posicionBusquedaInicio = AccionList.buscarNombre(lista, "Avatar");

        AccionList.borrarPelicula(lista, AccionList.buscarNombre(lista, "Avatar"));

        posicionBusquedaFinal = AccionList.buscarNombre(lista, "Avatar");

        System.out.println("posicionBusquedaFinal " + posicionBusquedaFinal);
        System.out.println("posicionBusquedaInicio " + posicionBusquedaInicio);

        assertFalse(posicionBusquedaInicio == posicionBusquedaFinal);
        assertTrue(posicionBusquedaFinal == -1);

    }
}