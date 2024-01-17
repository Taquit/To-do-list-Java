package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private String nombre;
    private final LocalDate fechaCreacion;
    private final List<Tarea> tareas = new ArrayList<>();

    public ListaTareas (String nombre){
        this.nombre = nombre;
    }
    {
        fechaCreacion = LocalDate.now();
    }
    public void agregaTarea(Tarea tarea){
        tareas.add(tarea);
    }
    public Tarea eliminarTarea(int indice){
        if(indice > tareas.size()){
            System.out.println("La tarea indicada no se encuentra en la lista.");
            return null;
        }
        return tareas.remove(indice);
    }
    public List<Tarea> getTareas(){
        return tareas;
    }
    public int numeroTareas(){
        return tareas.size();
    }
    public void  muestraTareas(){
        for(int i = 0 ; i < tareas.size(); i++){
            System.out.println((i+1) + " - " + tareas.get(i).getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
