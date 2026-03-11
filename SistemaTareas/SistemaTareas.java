package SistemaTareas;
import java.util.ArrayList;

// // Sistema de Gestión de Tareas
// Estructura basada en ArrayList
// Se analizó la complejidad temporal de cada método usando Big O


// Clase que gestiona todas las tareas del sistema
public class SistemaTareas {

    // Lista donde se almacenan las tareas
    private ArrayList<Tarea> tareas = new ArrayList<>();


    // Método para agregar una tarea
    // Complejidad: O(1)
    // Justificación: agregar al final de un ArrayList normalmente toma tiempo constante
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }


    // Método para listar todas las tareas
    // Complejidad: O(n)
    // Justificación: se recorre toda la lista para imprimir cada tarea
    public void listarTareas() {

        for (Tarea t : tareas) {
            System.out.println(t);
        }

    }


    // Método para buscar una tarea por su id
    // Complejidad: O(n)
    // Justificación: puede ser necesario recorrer todas las tareas
    public Tarea buscarPorId(int id) {

        for (Tarea t : tareas) {

            if (t.getId() == id) {
                return t;
            }

        }

        return null;
    }


    // Método para marcar una tarea como completada
    // Complejidad: O(n)
    // Justificación: primero hay que encontrar la tarea en la lista
    public void marcarCompletada(int id) {

        for (Tarea t : tareas) {

            if (t.getId() == id) {

                t.setCompletada(true);
                System.out.println("Tarea marcada como completada");
                return;

            }

        }

        System.out.println("No se encontró la tarea");

    }


    // Método para eliminar una tarea por id
    // Complejidad: O(n)
    // Justificación: se busca la tarea y luego se elimina del ArrayList
    public void eliminarTarea(int id) {

        for (int i = 0; i < tareas.size(); i++) {

            if (tareas.get(i).getId() == id) {

                tareas.remove(i);
                System.out.println("Tarea eliminada");
                return;

            }

        }

        System.out.println("No se encontró la tarea");

    }


    // Método para mostrar tareas pendientes
    // Complejidad: O(n)
    // Justificación: se revisa cada tarea para ver si está completada o no
    public void obtenerTareasPendientes() {

        for (Tarea t : tareas) {

            if (!t.isCompletada()) {
                System.out.println(t);
            }

        }

    }


    // Método para mostrar tareas según prioridad
    // Complejidad: O(n)
    // Justificación: se recorre la lista buscando coincidencias
    public void obtenerTareasPorPrioridad(int prioridad) {

        for (Tarea t : tareas) {

            if (t.getPrioridad() == prioridad) {
                System.out.println(t);
            }

        }

    }

}