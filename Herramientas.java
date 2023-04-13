import java.time.LocalDate;
import java.util.Scanner;

public class Herramientas {
    //#

    /**
     * Herramientas contiene métodos útiles que pueden aprovechar el resto de clases.
     * pedirInt es un método estático que recoge por teclado un número y lo devuelve ese número entero.
     *
     * @author Adriandela
     *
     * @param texto  String que recoge la frase que mostrará por pantalla el método

     *
     */
    public static int pedirInt(String texto) {
        int numero = 0;
        try {
            System.out.println(texto);
            Scanner lector = new Scanner(System.in);
            numero = lector.nextInt();
            lector.nextLine();
            return numero;
        } catch (java.util.InputMismatchException e) {
            System.out.println("Hemos tenido un error con la elección, por favor vuelva a introducir el número #001");
        } catch (Exception e) {
            System.out.println("Hemos tenido un error con la elección, por favor vuelva a introducir el número #002");
        }
        return numero;
    }
    /**
     * Herramientas es una clase que contiene métodos útiles que pueden aprovechar el resto de clases.
     * pedirString es un método estático que recoge por teclado una cadena de texto(String) y la devuelve posteriormente
     *
     * @author Adriandela
     *
     * @param texto  String que recoge la frase que mostrará por pantalla el método

     *
     */
    public static String pedirString(String texto){
        //Con texto
        String palabra;

        System.out.println(texto);
        Scanner lector = new Scanner(System.in);
        palabra = lector.nextLine();

        return palabra;
    }
    /**
     * Herramientas es una clase que contiene métodos útiles que pueden aprovechar el resto de clases.
     * convertirAMinus es un método estático que convierte a minúsculas todas las letras que contiene la cadena y la devuelve posteriormente.
     *
     * @author Adriandela
     *
     * @param palabra  String que contiene la palabra a convertir a minúsculas

     */
    public static String convertirAMinus(String palabra){
        String minus;

        minus = palabra.toLowerCase();

        return minus;
    }

}
