package SistemaTareas;
// Clase principal para probar el sistema

public class Main {

    public static void main(String[] args) {

        // Crear el sistema
        SistemaTareas sistema = new SistemaTareas();

        // Crear algunas tareas de prueba
        Tarea t1 = new Tarea(1, "Hacer tarea de programación", 3);
        Tarea t2 = new Tarea(2, "Estudiar para parcial", 5);
        Tarea t3 = new Tarea(3, "Ir al gimnasio", 2);
        Tarea t4 = new Tarea(4, "Comprar comida", 4);


        // Agregar tareas al sistema
        sistema.agregarTarea(t1);
        sistema.agregarTarea(t2);
        sistema.agregarTarea(t3);
        sistema.agregarTarea(t4);


        System.out.println("----- LISTA DE TAREAS -----");
        sistema.listarTareas();


        System.out.println("\n----- BUSCAR TAREA ID 2 -----");
        System.out.println(sistema.buscarPorId(2));


        System.out.println("\n----- MARCAR COMPLETADA ID 1 -----");
        sistema.marcarCompletada(1);


        System.out.println("\n----- TAREAS PENDIENTES -----");
        sistema.obtenerTareasPendientes();


        System.out.println("\n----- TAREAS PRIORIDAD 5 -----");
        sistema.obtenerTareasPorPrioridad(5);


        System.out.println("\n----- ELIMINAR TAREA ID 3 -----");
        sistema.eliminarTarea(3);


        System.out.println("\n----- LISTA FINAL -----");
        sistema.listarTareas();

    }
}