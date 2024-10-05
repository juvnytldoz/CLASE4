import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Gimnasio gimnasio = new Gimnasio();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- Sistema Gestion Alumnos ---");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar alumno");
            System.out.println("3. Actualizar alumno");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                gimnasio.agregarAlumno(scanner);
                break;

                case 2:
                gimnasio.mostrarListaAlumnos();
                break;

                case 3:
                gimnasio.actualizarDatosAlumno(scanner);
                break;

                case 4:
                gimnasio.eliminarAlumnoId(scanner);
                break;

                case 5:
                scanner.close();
                return;

                default:
                System.out.println("Opcion invalidaaaa");
            }
        } while (opcion != 5);
    }
}
