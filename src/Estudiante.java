public class Estudiante extends Persona {
    // Propiedad adicional para el grado del estudiante
    private String grado;

    // Constructor para inicializar las propiedades heredadas y propias
    public Estudiante(String nombre, int edad, String fechaNacimiento, String grado) {
        establecerNombre(nombre);
        establecerEdad(edad);
        establecerFechaNacimiento(fechaNacimiento);
        this.grado = grado;
    }

    // Sobrescritura del método toString()
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + obtenerNombre() + '\'' +
                ", edad=" + obtenerEdad() +
                ", fechaNacimiento='" + obtenerFechaNacimiento() + '\'' +
                ", grado='" + grado + '\'' +
                '}';
    }

}

