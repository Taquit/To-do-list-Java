package modelo;
import java.util.Objects;

import java.time.LocalDate;

public class Tarea {
    private String nombre;
    private final LocalDate fechaCreacion;
    private LocalDate fechaExpiracion;
    private boolean realizada;
    private  LocalDate fechaRealizacion;

    public Tarea(String nombreTarea) {
        this.nombre = getNombre();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public String getNombre(){
        return nombre;
    }
    {
        fechaCreacion = LocalDate.now();
    }
   //Para terminar con Tarea, sobrescribe sus
   // métodos equals y hashCode, de forma que sólo se use el nombre.
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public void setFechaRealizacion(LocalDate LocalDate){
        this.fechaRealizacion=fechaRealizacion;
    }

    public LocalDate getFechaRealizacion(){
        return fechaRealizacion;
    }
    public void setRealizada(boolean realizada){
        this.realizada = realizada;
    }

}
