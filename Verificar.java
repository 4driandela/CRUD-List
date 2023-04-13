import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class Verificar {
    /**
     * Verificar es la clase que contiene los métodos que arroja información para saber si se cumplen las condiciones que le indicamos.
     * verificarInt es un método estático que comprueba si el número que le aportamos está dentro del rango de valores que le definimos.
     *
     * @param minimo int que recoge el límite inferior del rango, este incluido.
     * @param maximo int que recoge el límite superior del rango, este incluido.
     * @param numero int que recoge el número a evaluar.
     * @return correcto Un valor booleano.
     *
     *
     * @author Adriandela

     */

    public static boolean verificarInt(int minimo, int maximo, int numero){
        boolean correcto = false;

        if(numero >= minimo && numero <= maximo){
            correcto = true;
        }else{
            correcto = false;
        }
        return correcto;
    }
    /**
     * Verificar es la clase que contiene los métodos que arroja información para saber si se cumplen las condiciones que le indicamos.
     * verificarListVacia es un método estático que comprueba si el ArrayList tiene contenido o está vacío.
     *
     * @param lista Objeto de la clase Galeria que alberga un ArrayList<Pelicula>.
     * @return vacio Un valor booleano.
     *
     * @author Adriandela

     */
    public static boolean verificarListVacia(Galeria lista) {
        int longitud = lista.longitudLista();
        boolean vacio = false;

        if (longitud <= 0) {
            vacio = true;
        }
        return vacio;
    }
}
