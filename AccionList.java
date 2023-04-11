public class AccionList {

    public static void añadirPelLista(Galeria lista){
        String titulo;
        String director;
        String genero;

        titulo = Herramientas.pedirString("¿Cuál es el título?");
        director = Herramientas.pedirString("¿Cuál es el director?");
        genero = Herramientas.pedirString("¿Cuál es el género?");

        lista.addPelicula(new Pelicula(titulo,director,genero));
    }
    public static int buscarNombre(Galeria lista, String texto){
        //Creado con while, ya que sólo puede haber una coincidencia de título
        boolean bucle = false;
        int posicion = 0;
        int longitudLista = lista.longitudLista();
        boolean encontrado = false;
        String titulo;

        titulo = Herramientas.convertirAMinus(Herramientas.pedirString(texto));


        do{
            if(Herramientas.convertirAMinus(lista.getCartelera().get(posicion).getNombre()).equals(titulo)){
                bucle = true;
                System.out.println(lista.getCartelera().get(posicion));
                encontrado = true;
            }else{
                bucle = false;
                posicion +=1;
            }
        }while(!bucle && posicion < longitudLista);

        if(!encontrado){
            System.out.println("Los sentimos, no hemos encontrado la palabra que buscabas");
            posicion = -1;
        }
        return posicion;
    }
    public static void buscarGenero(Galeria lista){
        //Creado con for, ya que para un género pueden haber varios registros
        int longitudLista = lista.longitudLista();
        String genero;
        boolean encontrado = false;

        genero = Herramientas.convertirAMinus(Herramientas.pedirString("Dime el género que buscas"));

        for(int i = 0; i < longitudLista; i++){
            if(Herramientas.convertirAMinus(lista.getCartelera().get(i).getGénero()).equals(genero)){
                System.out.println(lista.getCartelera().get(i));
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Los sentimos, no hemos encontrado la palabra que buscabas");
        }

    }
    public static void buscarDirector(Galeria lista){
        //Creado con for, ya que para un director pueden haber varios registros
        int longitudLista = lista.longitudLista();
        String director;
        boolean encontrado = false;

        director = Herramientas.convertirAMinus(Herramientas.pedirString("Dime el director que buscas"));

       for(int i = 0; i < longitudLista;i++){
           if(Herramientas.convertirAMinus(lista.getCartelera().get(i).getDirector()).equals(director)){
               System.out.println(lista.getCartelera().get(i));
               encontrado = true;
           }
       }
        if(!encontrado){
            System.out.println("Los sentimos, no hemos encontrado la palabra que buscabas");
        }
    }
    public static void modificarNombre(Galeria lista, int posicion, String texto){
        String newTitulo;
        newTitulo = Herramientas.pedirString(texto);
        lista.getCartelera().get(posicion).setNombre(newTitulo);
        System.out.println(lista.getCartelera().get(posicion));
    }

    public static void modificarDirector(Galeria lista, int posicion, String texto){
        String newTitulo;
        newTitulo = Herramientas.pedirString(texto);
        lista.getCartelera().get(posicion).setDirector(newTitulo);
        System.out.println(lista.getCartelera().get(posicion));
    }
    public static void modificarGenero(Galeria lista, int posicion, String texto){
        String newTitulo;
        newTitulo = Herramientas.pedirString(texto);
        lista.getCartelera().get(posicion).setGénero(newTitulo);
        System.out.println(lista.getCartelera().get(posicion));
    }
    public static void borrarPelicula(Galeria lista, int posicion){
        lista.removePelicula(posicion);
        System.out.println(lista.toString());
    }

}
