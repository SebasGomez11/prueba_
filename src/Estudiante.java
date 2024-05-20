public class Estudiante extends Persona {
    // Propiedad adicional para el grado del estudiante
    private String grado;

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
