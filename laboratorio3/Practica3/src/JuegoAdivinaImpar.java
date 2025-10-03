class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (!super.validaNumero(numero)) {
            return false;
        }
        if (numero % 2 == 0) {
            System.out.println("El número debe ser IMPAR.");
            return false;
        }
        return true;
    }
}