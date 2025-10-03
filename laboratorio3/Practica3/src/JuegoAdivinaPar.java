class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    @Override
    public boolean validaNumero(int numero) {
        if (!super.validaNumero(numero)) {
            return false;
        }
        if (numero % 2 != 0) {
            System.out.println("El número debe ser PAR.");
            return false;
        }
        return true;
    }
}

