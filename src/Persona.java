public class Persona {
    // Propiedades privadas
    private String nombre;
    private int edad;
    private String fechaNacimiento;

    // Métodos públicos para manipular las propiedades
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String obtenerFechaNacimiento() {
        return fechaNacimiento;
    }
}
