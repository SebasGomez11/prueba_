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
        if (edad >= 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
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

    // Método adicional para calcular la fecha de nacimiento a partir de la edad
    public void calcularFechaNacimiento() {
        int yearOfBirth = java.time.Year.now().getValue() - edad;
        this.fechaNacimiento = yearOfBirth + "-01-01";  // Suponiendo que la fecha de nacimiento es el 1 de enero
    }
}
