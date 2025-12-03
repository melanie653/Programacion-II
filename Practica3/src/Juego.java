class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        System.out.println("Nueva partida iniciada con " + numeroDeVidas + " vidas");
    }

    public void actualizaRecord() {
        record++;
        System.out.println("¡Nuevo record! Aciertos acumulados: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te queda: " + numeroDeVidas + " vidas");
        return numeroDeVidas > 0;
    }
}