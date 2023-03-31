public class Mensaje {

    public static void mostrarMenu(){
        System.out.println("1- Añadir una pelicula");
        System.out.println("2- Buscar una pelicula");
        System.out.println("3- Modificar una pelicula");
        System.out.println("4- Eliminar una pelicula");
        System.out.println("5- Mostrar lista");
        System.out.println("6- Exit");
        }
        public static void mostrarMenuBusqueda(){
        System.out.println("1- Buscar película por título");
        System.out.println("2- Buscar película por director");
        System.out.println("3- Buscar película por género");
        }
        public static void mostrarMenuModificar() {
            System.out.println("1- Modificar título");
            System.out.println("2- Modificar director");
            System.out.println("3- Modificar género");
            System.out.println("4- Modificar título, director y género");
        }
        public static void advertenciaListVacia(){
            System.out.println("Lo sentimos, no tenemos ningún dato guardado");
        }

}
