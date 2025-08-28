import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = leer.nextDouble();
        double b = leer.nextDouble();
        double c = leer.nextDouble();
        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);
        double d = eq.getDiscriminante();
        if (d > 0) {
            System.out.println("La ecuación tiene dos raíces: " + eq.getRaiz1() + " y " + eq.getRaiz2());
        } else if (d == 0) {
            System.out.println("La ecuación tiene una raíz: " + eq.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}
