package SistemaTareas;
// Clase que representa una tarea dentro del sistema
public class Tarea {

    // Atributos de la tarea
    private int id;
    private String descripcion;
    private int prioridad; // valores de 1 a 5
    private boolean completada;

    // Constructor para crear una nueva tarea
    public Tarea(int id, String descripcion, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false; // cuando se crea la tarea inicia como no completada
    }

    // Getters para acceder a los atributos
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    // Setter para cambiar el estado de completada
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Método para imprimir la información de la tarea
    @Override
    public String toString() {
        return "ID: " + id +
               " | Descripción: " + descripcion +
               " | Prioridad: " + prioridad +
               " | Completada: " + completada;
    }
}