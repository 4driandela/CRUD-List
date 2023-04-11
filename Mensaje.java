public class Mensaje {

    public static String mostrarMenu(){
        String texto = "1- Añadir una pelicula\n2- Buscar una pelicula\n3- Modificar una pelicula\n" +
                "4- Eliminar una pelicula\n5- Mostrar lista\n6- Exit\n¿Qué opción quieres realizar";

       return texto;
        }
        public static String mostrarMenuBusqueda(){
            String texto = "1- Buscar película por título\n2- Buscar película por director\n3- Buscar película por género\n¿Qué opción quieres realizar";

            return texto;

        }
        public static String mostrarMenuModificar() {
            String texto = "1- Modificar título\n2- Modificar director\n3- Modificar género\n4- Modificar título, director y género\n¿Qué opción quieres realizar";

            return texto;

        }
        public static void advertenciaListVacia(){
            System.out.println("Lo sentimos, no tenemos ningún dato guardado");
        }

}
