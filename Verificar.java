import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class Verificar {

    public static boolean verificarInt(int minimo, int maximo, int numero){
        boolean correcto = false;

        if(numero >= minimo && numero <= maximo){
            correcto = true;
        }else{
            correcto = false;
        }
        return correcto;
    }
    public static boolean verificarListVacia(Galeria lista){
        int longitud = lista.longitudLista();
        boolean vacio = false;

        if(longitud <= 0){
            vacio = true;
        }
        return vacio;
    }

}
