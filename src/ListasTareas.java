import modelo.ListaTareas;
import modelo.Tarea;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListasTareas {
    private Lector lector = new Lector();
    private final List<ListaTareas> listasTareas = new ArrayList<>();
    private Menu menu = new Menu();
    private ManejadorTareas tareas = new ManejadorTareas();

    private int validacIndice(){

        System.out.println("Se validara la existencia de la tarea...");

        int indice = Lector.leeOpcion();
        System.out.println("Indique el índice de la lista de tareas.");
        if (!validaExistenciaLista()) {
            return indice;
        }




        if (indice > listasTareas.size() || indice < 0) {
            System.out.println("No existen listas de tareas en el índice seleccionado.");
            indice = 0;
        }

        return indice;

    }
    public void crearNuevaListas(){
        System.out.println("Crear nueva lista de tareas.");
        System.out.println("Introduzca nueva tarea: ");
        String extra = Lector.lectorExtra();
        String nombre = Lector.leeCadena();
        ListaTareas lista = new ListaTareas(nombre);
        listasTareas.add(lista);
    }
    private boolean validaExistenciaLista(){
        if(listasTareas == null || listasTareas.isEmpty()){
            System.out.println("Aun no se ha creado ninguna lista de tareas.");
            return false;
        }
        return true;
    }
    public void verListaTareas(){

        System.out.println("Ver lista de tareas.");
        if(!validaExistenciaLista()){
            return;
        }
        for (int i = 0; i < listasTareas.size(); i++) {
            System.out.println((i + 1) + " - " + listasTareas.get(i).getNombre());
        }
    }
    public void verTareasDeLista(){
        System.out.println("------Ver tareas de lista.---------");
        int lista = Lector.leeOpcion();
        int indice = validacIndice();
        String extra = Lector.lectorExtra();
        if (indice ==0){
            return;
        }
    }

    public void actualizarListaDeTareas(){
        System.out.println("------Actualizar lista de tareas------.");

        int indice = validacIndice();

        if (indice == 0) {
            return;
        }

        ListaTareas listaActual = listasTareas.get((indice-1));
        menu.muestraOpcionesTarea();
        short opcionSelecionada = lector.leeOpcion();
        switch (opcionSelecionada){
            case 1:
                Tarea nuevaTarea = tareas.nuevaTarea();
                listaActual.agregaTarea(nuevaTarea);
                break;
            case 2:
                Tarea t1 = tareas.eliminaTarea(listaActual);
                if (t1 !=null){
                    System.out.println("Se elimino la tarea" + t1.getNombre());
                }
                else {
                    System.out.println("No se pudo eliminar tarea");
                }
                break;
            case 3:
                Tarea t2 = tareas.marcarTareaFinalzada(listaActual);
                if(t2 != null){
                    System.out.println("La tarea" + t2.getNombre() + " se completo el " + t2.getFechaRealizacion());

                }else {
                    System.out.println("No se puedo eliminar la tarea.");
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Opcioon desconocida");
        }
    }


    public void elimarListaDeTareas(){
        System.out.println("Preuba12");
        int indice = validacIndice();
        System.out.println("------Elimar lista de tareas.-------");
        int lista = Lector.leeOpcion();
        ListaTareas listaEliminada = listasTareas.remove((indice - 1));

        System.out.println("Se eliminó la lista de tareas: " + listaEliminada.getNombre());
    }
}
