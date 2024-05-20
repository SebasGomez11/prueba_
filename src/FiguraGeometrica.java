public class FiguraGeometrica {
    // Propiedades privadas
    private String nombre;
    private String color;

    // Métodos públicos para manipular las propiedades
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public String obtenerColor() {
        return color;

    }

    // En la clase Rectangulo
    public void establecerLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double obtenerLongitud() {
        return longitud;
    }

    // En la clase Circulo
    public void establecerRadio(double radio) {
        this.radio = radio;
    }

    public double obtenerRadio() {
        return radio;
    }

}
