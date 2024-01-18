import modelo.ListaTareas;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListasTareas {
    private Lector lector = new Lector();
    private final List<ListaTareas> listasTareas = new ArrayList<>();
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
        System.out.println("Ver tareas de lista.");
        int lista = Lector.leeOpcion();
        int indice = validacIndice();
        if (indice ==0){
            return;
        }
    }

    public void actualizarListaDeTareas(){
        System.out.println("Actualizar lista de tareas.");

        int indice = validacIndice();

        if (indice == 0) {
            return;
        }
    }

    private int validacIndice(){

        int indice = Lector.leeOpcion();

        if (!validaExistenciaLista()) {
            return indice;
        }

        System.out.println("Indique el índice de la lista de tareas.");


        if (indice > listasTareas.size() || indice < 0) {
            System.out.println("No existen listas de tareas en el índice seleccionado.");
            indice = 0;
        }

        return indice;

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
