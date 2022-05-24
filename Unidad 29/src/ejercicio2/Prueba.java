package ejercicio2;

public class Prueba {
    public static void main(String[] ar) {
        Persona persona1=new Persona();
        persona1.cargarDatosPersonales();
        Empleado empleado1=new Empleado();
        empleado1.cargarDatosPersonales();
        empleado1.cargarSueldo();
        persona1.imprimirDatosPersonales();        
        empleado1.imprimirDatosPersonales();
        empleado1.imprimirSueldo();
    }
}