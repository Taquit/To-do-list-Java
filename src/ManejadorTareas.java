import modelo.ListaTareas;
import modelo.Tarea;

import java.sql.SQLSyntaxErrorException;
import java.time.LocalDate;

public class ManejadorTareas {
    private final Lector lector = new Lector();
    public Tarea nuevaTarea(){
        System.out.println("-----Nueva Tarea----");
        System.out.println("Nombre: ");
        String nombreTarea = lector.leeCadena();
        String extra = lector.lectorExtra();
        Tarea tarea = new Tarea(nombreTarea);
        return tarea;
    }
    public Tarea eliminaTarea (ListaTareas listaTareas){
        System.out.println("----Eliminar tarea-----");
        System.out.println("Indica el indice a eliminar");
        short indice = lector.leeOpcion();
        if (indice > listaTareas.numeroTareas()) {
            System.out.println("La tarea indicada no existe.");
            return null;
        }
        return  listaTareas.eliminarTarea(indice-1);
    }
    public Tarea marcarTareaFinalzada (ListaTareas listaTareas){
        System.out.println("----Finalizar tarea-----");
        System.out.println("Indica el indice de la tarea ");
        short indice = lector.leeOpcion();
        if (indice > listaTareas.numeroTareas()) {
            System.out.println("La tarea indicada no existe.");
            return null;
        }
        Tarea tarea = listaTareas.getTareas().get(indice-1);
        tarea.setFechaRealizacion(LocalDate.now());
        tarea.setRealizada(true);
        return tarea;
    }
}
