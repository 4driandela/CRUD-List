/**
 * Clase en la que se realiza la gestión del programa, los métodos empleados se conforman de la utilización de los
 * métodos de otras clases para realizar las funciones del programa.
 */
public class Controlador {
    public static void main(String[] args) {
        int eleccion;
        Galeria lista = new Galeria();

        do {
            eleccion = eleccionMenu(1, 6, Mensaje.mostrarMenu());

            switch (eleccion) {
                case 1:
                    //Añade pelicula al ArrayList
                    AccionList.añadirPelLista(lista);
                    break;
                case 2:
                    //Busqueda
                    buscarPelicula(lista);
                    break;
                case 3:
                    //Modificación
                    modificarPosicion(lista);
                    break;
                case 4:
                    //Borrar
                    borrarPosicion(lista);
                    break;
                case 5:
                    //Vista general
                    lista.mostrarArrayList();

                    break;
            }
        } while (eleccion != 6);

    }

    /**
     * eleccionMenu es un método estático que nos pide un número por teclado y nos garantiza que esté dentro de los
     * que queremos para nuestro programa, avisándonos si este se encuentre fuera de los límites y repitiénose hasta
     * que el número sea correcto.
     *
     * @param minimo int que marca el límite inferior para el rango del número de elección.
     * @param maximo int que marca el límite superior para el rango del número de elección.
     * @param texto  String que recoge el texto que se mostrará por pantalla.
     * @return eleccion: Devuelve que un int cuando supera las condiciones que le definimos.
     * @author Adriandela
     */

    private static int eleccionMenu(int minimo, int maximo, String texto) {
        int eleccion;
        boolean numeroCorrecto = false;

        do {
            eleccion = Herramientas.pedirInt(texto);
            numeroCorrecto = Verificar.verificarInt(minimo, maximo, eleccion);

            if (!numeroCorrecto) {
                System.out.println("Las opciones varían desde " + minimo + " hasta " + maximo + ", ambos incluidos.");
            }
        } while (!numeroCorrecto);
        return eleccion;
    }

    /**
     * buscarPelicula es un método estático que nos pide un número para la elección de las opciones y una palabra con
     * la que hacer la busqueda, imprime por pantalla un mensaje con el resultado de la busqueda.
     * Previamente deben haber datos guardados para poder funcionar.
     *
     * @param lista Objeto de la clase Galeria que alberga un ArrayList<Pelicula>.
     * @author Adriandela
     */
    private static void buscarPelicula(Galeria lista) {
        int eleccion;
        String titulo;
        if (!Verificar.verificarListVacia(lista)) {
            eleccion = eleccionMenu(1, 3, Mensaje.mostrarMenuBusqueda());

            switch (eleccion) {
                case 1:
                    AccionList.buscarNombre(lista, "Dime el título que buscas");
                    break;
                case 2:
                    AccionList.buscarDirector(lista);
                    break;
                case 3:
                    AccionList.buscarGenero(lista);
                    break;
            }
        } else {
            Mensaje.advertenciaListVacia();
        }
    }

    /**
     * modificarPosicion es un método estático que nos pide un número para la elección de su menú, el String para
     * realizar la busqueda dentro de la lista y el/los nuevo/s String para modificar la información en esa posición.
     * Previamente deben haber datos guardados para poder funcionar.
     *
     * @param lista Objeto de la clase Galeria que alberga un ArrayList<Pelicula>.
     * @author Adriandela
     */
    public static void modificarPosicion(Galeria lista) {
        int eleccion;
        int posicion;

        if (!Verificar.verificarListVacia(lista)) {
            eleccion = eleccionMenu(1, 4, Mensaje.mostrarMenuModificar());

            switch (eleccion) {
                case 1:
                    posicion = AccionList.buscarNombre(lista, "Dime la película que buscas");
                    if (posicion != -1) {
                        AccionList.modificarNombre(lista, posicion, "Cuál es el nuevo valor para el título");
                    }
                    break;
                case 2:
                    posicion = AccionList.buscarNombre(lista, "Dime la película que buscas");
                    if (posicion != -1) {
                        AccionList.modificarDirector(lista, posicion, "Cuál es el nuevo valor para el director");
                    }
                    break;
                case 3:
                    posicion = AccionList.buscarNombre(lista, "Dime la película que buscas");
                    if (posicion != -1) {
                        AccionList.modificarGenero(lista, posicion, "Cuál es el nuevo valor para el género");
                    }
                    break;
                case 4:
                    posicion = AccionList.buscarNombre(lista, "Dime la película que buscas");
                    if (posicion != -1) {
                        AccionList.modificarNombre(lista, posicion, "Cuál es el nuevo valor para el título");
                        AccionList.modificarDirector(lista, posicion, "Cuál es el nuevo valor para el director");
                        AccionList.modificarGenero(lista, posicion, "Cuál es el nuevo valor para el género");
                    }
                    break;
            }
        } else {
            Mensaje.advertenciaListVacia();
        }
    }

    /**
     * borrarPosicion es un método estático que encuentra la posición que coincide con el valor de búsqueda y la elimina
     * de la lista. Previamente deben haber datos guardados para poder funcionar.
     *
     * @param lista Objeto de la clase Galeria que alberga un ArrayList<Pelicula>.
     * @author Adriandela
     */
    public static void borrarPosicion(Galeria lista) {
        int posicion;

        if (!Verificar.verificarListVacia(lista)) {
            posicion = AccionList.buscarNombre(lista, "¿Que película quieres borrar?");
            if (posicion != -1) {
                AccionList.borrarPelicula(lista, posicion);
            }
        } else {
            Mensaje.advertenciaListVacia();
        }
    }
}


