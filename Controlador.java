
public class Controlador {
    public static void main(String[] args) {
        int eleccion;
        Galeria lista = new Galeria();

        do{
                eleccion = eleccionMenu(1, 6, Mensaje.mostrarMenu());


          switch(eleccion){
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
        }while(eleccion != 6);

    }

    private static int eleccionMenu(int minimo, int maximo, String texto){
        int eleccion;
        boolean numeroCorrecto = false;

        do {
            eleccion = Herramientas.pedirInt(texto);
            numeroCorrecto = Verificar.verificarInt(minimo,maximo,eleccion);

            if(!numeroCorrecto){
                System.out.println("Las opciones varían desde " + minimo + " hasta " + maximo + ", ambos incluidos.");
            }
        }while(!numeroCorrecto);
        return eleccion;
    }
    private static void buscarPelicula(Galeria lista) {
        int eleccion;
        String titulo;
        if(!Verificar.verificarListVacia(lista)) {
            eleccion = eleccionMenu(1, 3,Mensaje.mostrarMenuBusqueda() );

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
        }else{
            Mensaje.advertenciaListVacia();
        }
    }
    public static void modificarPosicion(Galeria lista) {
        int eleccion;
        int posicion;

        if(!Verificar.verificarListVacia(lista)) {
            eleccion = eleccionMenu(1, 4,Mensaje.mostrarMenuModificar());

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
        }else{
            Mensaje.advertenciaListVacia();
        }
    }
        public static void borrarPosicion (Galeria lista){
            int posicion;

            if(!Verificar.verificarListVacia(lista)) {
                posicion = AccionList.buscarNombre(lista, "¿Que película quieres borrar?");
                if (posicion != -1) {
                    AccionList.borrarPelicula(lista, posicion);
                }
            }else{
                Mensaje.advertenciaListVacia();
            }
    }
}


