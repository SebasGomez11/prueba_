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

    // En la clase Circulo
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
