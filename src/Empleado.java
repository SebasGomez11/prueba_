public class Empleado implements Trabajador {
    @Override
    public void realizarTarea() {
        System.out.println("Realizando tarea laboral");
        // Usando una clase anónima
        Trabajador trabajadorAnonimo = new Trabajador() {
            @Override
            public void realizarTarea() {
                System.out.println("Realizando tarea temporal");
            }
        };

// Usando una lambda
        Trabajador trabajadorLambda = () -> System.out.println("Realizando tarea temporal");
    }
}