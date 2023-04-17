/**
 * Clase que recoge los métodos directos que permiten añadir, buscar, modificar y borrar en la lista.
 *
 * @author Adriandela
 */
public class AccionList {
    /**
     * añadirPelLista es un método estático que permite añadir objetos de la clase Pelicula a la lista de la clase Galeria.
     *
     * @param lista Objeto de la clase Galeria que contiene un ArrayList<Pelicula>.
     * @author Adriandela
     */
    public static void añadirPelLista(Galeria lista, String titulo, String director, String genero ) {

        lista.addPelicula(new Pelicula(titulo, director, genero));
    }

    /**
     * buscarNombre es un método estático que recorre el ArrayList en busca de coincidencias con el String título.
     *
     * @param lista Objeto de la clase Galeria que contiene un ArrayList<Pelicula>.
     * @return posicion: Int que hace referencia a la posición en la lista que coincide que con nuestra búsqueda.
     * @author Adriandela
     */
    public static int buscarNombre(Galeria lista,String titulo) {
        //Creado con while, ya que sólo puede haber una coincidencia de título
        boolean bucle = false;
        int posicion = 0;
        int longitudLista = lista.longitudLista();
        boolean encontrado = false;


        titulo = Herramientas.convertirAMinus(titulo);

        do {
            if (Herramientas.convertirAMinus(lista.getCartelera().get(posicion).getNombre()).equals(titulo)) {
                bucle = true;
                System.out.println(lista.getCartelera().get(posicion));
                encontrado = true;
            } else {
                bucle = false;
                posicion += 1;
            }
        } while (!bucle && posicion < longitudLista);

        if (!encontrado) {
            System.out.println("Los sentimos, no hemos encontrado la palabra que buscabas");
            posicion = -1;
        }
        return posicion;
    }

    /**
     * buscarGenero es un método estático que recorre el ArrayList en busca de coincidencias con el String genero.
     *
     * @param lista Objeto de la clase Galeria que contiene un ArrayList<Pelicula>.
     * @author Adriandela
     */
    public static boolean buscarGenero(Galeria lista, String genero) {
        //Creado con for, ya que para un género pueden haber varios registros
        int longitudLista = lista.longitudLista();
        boolean encontrado = false;

        genero = Herramientas.convertirAMinus(genero);

        for (int i = 0; i < longitudLista; i++) {
            if (Herramientas.convertirAMinus(lista.getCartelera().get(i).getGénero()).equals(genero)) {
                System.out.println(lista.getCartelera().get(i));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Los sentimos, no hemos encontrado la palabra que buscabas");
        }
        return encontrado;

    }

    /**
     * buscarDirector es un método estático que recorre el ArrayList en busca de coincidencias con el String director.
     *
     * @param lista Objeto de la clase Galeria que contiene un ArrayList<Pelicula>.
     * @author Adriandela
     */
    public static boolean buscarDirector(Galeria lista, String director) {
        //Creado con for, ya que para un director pueden haber varios registros
        int longitudLista = lista.longitudLista();
        boolean encontrado = false;

        director = Herramientas.convertirAMinus(director);

        for (int i = 0; i < longitudLista; i++) {
            if (Herramientas.convertirAMinus(lista.getCartelera().get(i).getDirector()).equals(director)) {
                System.out.println(lista.getCartelera().get(i));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Los sentimos, no hemos encontrado la palabra que buscabas");
        }
        return encontrado;
    }

    /**
     * modificarNombre es un método estático que permite modificar el título en una posición en concreto de la lista, gracias a
     * la referencia previa de la posición que nos da el método buscarNombre.
     *
     * @param lista    Objeto de la clase Galeria que contiene un ArrayList<Pelicula>.
     * @param posicion Int que recoge la posición en la lista que se va a modificar.
     * @author Adriandela
     */
    public static void modificarNombre(Galeria lista, int posicion, String newTitulo) {

        lista.getCartelera().get(posicion).setNombre(newTitulo);
        System.out.println(lista.getCartelera().get(posicion));
    }

    /**
     * modificarDirector es un método estático que permite modificar el director en una posición en concreto de la lista, gracias a
     * la referencia previa de la posición que nos da el método buscarNombre.
     *
     * @param lista    Objeto de la clase Galeria que contiene un ArrayList<Pelicula>.
     * @param posicion Int que recoge la posición en la lista que se va a modificar.
     * @author Adriandela
     */
    public static void modificarDirector(Galeria lista, int posicion, String newDirector) {

        lista.getCartelera().get(posicion).setDirector(newDirector);
        System.out.println(lista.getCartelera().get(posicion));
    }

    /**
     * modificarGenero es un método estático que permite modificar el género en una posición en concreto de la lista, gracias a
     * la referencia previa de la posición que nos da el método buscarNombre.
     *
     * @param lista    Objeto de la clase Galeria que contiene un ArrayList<Pelicula>.
     * @param posicion Int que recoge la posición en la lista que se va a modificar.
     * @author Adriandela
     */
    public static void modificarGenero(Galeria lista, int posicion, String newGenero) {

        lista.getCartelera().get(posicion).setGénero(newGenero);
        System.out.println(lista.getCartelera().get(posicion));
    }

    /**
     * borrarPelicula es un método estático que borra el objeto de la clase Pelicula en la posición de la lista que
     * queremos que se elimine.
     *
     * @param lista    Objeto de la clase Galeria que contiene un ArrayList<Pelicula>.
     * @param posicion Int que recoge la posición en la lista que se va a borrar.
     * @author Adriandela
     */
    public static void borrarPelicula(Galeria lista, int posicion) {
        lista.removePelicula(posicion);
        System.out.println(lista.toString());
    }

}
