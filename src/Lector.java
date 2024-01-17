import java.util.Scanner;


public class Lector {
    private static final Scanner scanner = new Scanner(System.in);

    public static short leeOpcion(){
        System.out.println("Opción: ");
        return scanner.nextByte();
    }
    public  static String leeCadena(){

        System.out.println("Cadena: ");
        return scanner.nextLine();

    }


}
