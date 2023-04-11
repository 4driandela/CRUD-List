import java.time.LocalDate;
import java.util.Scanner;

public class Herramientas {
    //#

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
    public static String pedirString(String texto){
        //Con texto
        String palabra;

        System.out.println(texto);
        Scanner lector = new Scanner(System.in);
        palabra = lector.nextLine();

        return palabra;
    }
    public static String pedirString(){
        //Sin texto
        String palabra;

        Scanner lector = new Scanner(System.in);
        palabra = lector.nextLine();

        return palabra;
    }
    public static String convertirAMinus(String palabra){
        String minus;

        minus = palabra.toLowerCase();

        return minus;
    }

}
