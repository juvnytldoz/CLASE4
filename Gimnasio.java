import java.util.ArrayList;
import java.util.Scanner;

public class Gimnasio {
    
    private ArrayList<Alumno> listaAlumnos;

    public Gimnasio(){
        listaAlumnos = new ArrayList<>();
    }


    public void agregarAlumno(Scanner scanner){
        System.out.println("Ingrese el id del alumno: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese edad del alumno: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese membresia del alumno: ");
        String membresia = scanner.nextLine();
        

        if (membresia.equalsIgnoreCase("Mensual") || membresia.equalsIgnoreCase("Trimestral") || 
            membresia.equalsIgnoreCase("Anual")) {
            
            Alumno alumno = new Alumno(id, nombre, edad, membresia);
            listaAlumnos.add(alumno);
            System.out.println("El alumno '"+ nombre + "' fue agregado correctamente.");
        }else{
            System.out.println("Datos ingresados incorrectamente");
        }
    }


    public void mostrarListaAlumnos(){
        if(listaAlumnos.isEmpty()){
            System.out.println("No hay nada para mostrar");

        }else{
            for(Alumno alumno : listaAlumnos){
                alumno.mostrarInfo();
            }
        }
    }


    public void actualizarDatosAlumno(Scanner scanner){
        System.out.println("Ingresa el id del alumno para actualizar");
        int id = scanner.nextInt();
        scanner.nextLine();

        for(Alumno alumno : listaAlumnos){
            if(alumno.getId()==id){
                System.out.println("Ingrese el nombre del alumno: ");
                String nombre2 = scanner.nextLine();
                
                System.out.println("Ingrese edad del alumno: ");
                int edad2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese membresia del alumno: ");
                String membresia2 = scanner.nextLine(); 

                alumno.setNombre(nombre2);
                alumno.setEdad(edad2);
                alumno.setMembresia(membresia2);
                System.out.println("El alumno fue actualizado");
                return;
            }
        }System.out.println("El id no fue encontrado");
    }


    public void eliminarAlumnoId(Scanner scanner){
        System.out.println("Ingrese el id del alumno a eliminar");
        int id = scanner.nextInt();
        scanner.nextLine();

        Alumno alumnoEliminar = null;

        for(Alumno alumno : listaAlumnos){
            if(alumno.getId()==id){
                alumnoEliminar = alumno;
                break;
            }
        }

        if(alumnoEliminar!=null){
            listaAlumnos.remove(alumnoEliminar);
            System.out.println("El alumno fue eliminado correctamente");
        }else{
            System.out.println("El alumno no existe");
        }
    }

}
