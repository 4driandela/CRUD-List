import java.time.LocalDate;
import java.util.Scanner;

public class Herramientas {

    public static int pedirInt(String texto){
        int numero;

        System.out.println(texto);
        Scanner lector = new Scanner(System.in);
        numero = lector.nextInt();
        lector.nextLine();

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

}
