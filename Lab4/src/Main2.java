import java.util.Random;
public class Main2 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();
        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2);
            if (tipo == 0) {
                double lado = 1 + rand.nextInt(10);
                figuras[i] = new Cuadrado(lado, "Rojo");
            } else {
                double radio = 1 + rand.nextInt(10);
                figuras[i] = new Circulo(radio, "Azul");
            }
        }
        for (Figura f : figuras) {
            System.out.println(f.toString());
            if (f instanceof Coloreado) {
                System.out.println(((Coloreado) f).comoColorear());
            }
            
        }
    }
}
