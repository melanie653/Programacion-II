public class Main {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3);
        juego.juega();
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        juego2.juega();
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);
        juego3.juega();
    }
}
