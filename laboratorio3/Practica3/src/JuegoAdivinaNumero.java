import java.util.Random;
import java.util.Scanner;
class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        reiniciaPartida();
        Random random = new Random();
        numeroAAdivinar = random.nextInt(11); 
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = sc.nextInt();
            if (!validaNumero(intento)) {
                System.out.println("Número inválido, debe estar entre 0 y 10");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número a adivinar es mayor");
                    } else {
                        System.out.println("El número a adivinar es menor");
                    }
                } else {
                    System.out.println("Has perdido, el número era:  " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}