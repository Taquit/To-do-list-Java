import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas lista = new ListasTareas();
        byte opcionSelecionada = 0;

        do{

            Menu.muestaOpciones();
            opcionSelecionada = (byte) Lector.leeOpcion();

            switch (opcionSelecionada){
                case 1:
                    lista.crearNuevaListas();
                    break;
                case 2:
                    lista.verListaTareas();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actualizarListaDeTareas();
                    break;
                case 5:
                    lista.elimarListaDeTareas();
                    break;
                case 6:
                    System.out.println("Saliedno de la aplicacion.");
                    break;
                default:
                    System.out.println("Opción desconocida.");
            }
        } while (opcionSelecionada !=6);


    }
}