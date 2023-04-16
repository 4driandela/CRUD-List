import java.util.Scanner;

/**
 * Herramientas contiene métodos útiles que pueden aprovechar el resto de clases.
 *
 * @author Adriandela
 */
public class Herramientas {
    //#

    /**
     * pedirInt es un método estático que recoge por teclado un número y lo devuelve ese número entero.
     *
     * @param texto String que recoge la frase que mostrará por pantalla el método.
     * @return numero: Int que devuelve el número introducido por teclado.
     * @author Adriandela
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
     * pedirString es un método estático que recoge por teclado una cadena de texto(String) y la devuelve posteriormente.
     *
     * @param texto String que recoge la frase que mostrará por pantalla el método
     * @return palabra: String que recoge la palabra introducida por teclado.
     * @author Adriandela
     */
    public static String pedirString(String texto) {
        String palabra;

        System.out.println(texto);
        Scanner lector = new Scanner(System.in);
        palabra = lector.nextLine();

        return palabra;
    }

    /**
     * convertirAMinus es un método estático que convierte a minúsculas todas las letras que contiene la cadena y la devuelve posteriormente.
     *
     * @param palabra String que contiene la palabra a convertir a minúsculas
     * @return minus: String convertido a minúsculas.
     * @author Adriandela
     */
    public static String convertirAMinus(String palabra) {
        String minus;

        minus = palabra.toLowerCase();

        return minus;
    }

}
