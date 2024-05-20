public class Rectangulo extends FiguraGeometrica {
    private double longitud;
    private double ancho;

    // Constructor
    public Rectangulo(String nombre, String color, double longitud, double ancho) {
        establecerNombre(nombre);
        establecerColor(color);
        this.longitud = longitud;
        this.ancho = ancho;


    }


    // Métodos para calcular área y perímetro
    public double calcularArea() {
        return longitud * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }


}
