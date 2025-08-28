import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = leer.nextDouble();
        double b = leer.nextDouble();
        double c = leer.nextDouble();
        double d = leer.nextDouble();
        double e = leer.nextDouble();
        double f = leer.nextDouble();
        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);
        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX() + ", y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
    }
}
