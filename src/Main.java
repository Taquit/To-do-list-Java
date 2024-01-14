import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        short opcionSelecionada;

        do{

            Menu.mostrarMenu();
            opcionSelecionada = Lector.leerOpcion();

            switch (opcionSelecionada){
                case 1:
                    ListasTareas.mostrarTareas();
                    break;
                case 2:
                    ListasTareas.agregarTareas();
                    break;
                case 3:
                    ListasTareas.completarTarea();
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicacion...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, seleciona una opcion valida.");
            }
        } while (opcionSelecionada !=4);


    }
}