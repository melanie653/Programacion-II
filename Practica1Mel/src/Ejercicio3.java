import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = leer.nextDouble();
        }
        Estadistica est = new Estadistica(numeros);
        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviación estándar es " + est.desviacion());
    }
}
