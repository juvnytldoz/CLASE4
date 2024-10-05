public class Alumno {

    private String nombre, membresia;
    private int id, edad;

    public Alumno (int id, String nombre, int edad, String membresia){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.membresia = membresia;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getMembresia() {
        return membresia;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public void mostrarInfo() {
        System.out.println("| Id alumno: " + id + " | Nombre alumno: " + nombre + " | Edad: " + edad + " | Membresia: " + membresia+" |");
    }
}