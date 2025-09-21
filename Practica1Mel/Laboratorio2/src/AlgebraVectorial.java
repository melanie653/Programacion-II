class AlgebraVectorial {
    public boolean Perpendicular(Vector a, Vector b) {
        double lhs = a.suma(b).modulo();
        double rhs = a.resta(b).modulo();
        return Math.abs(lhs - rhs) < 1e-6;
    }
    public boolean Perpendicular(Vector a, Vector b, String metodo) {
        return Math.abs(a.resta(b).modulo() - b.resta(a).modulo()) < 1e-6;
    }
    public boolean Perpendicular(Vector a, Vector b, int metodo) {
        return Math.abs(a.productoPunto(b)) < 1e-6;
    }
    public boolean Perpendicular(Vector a, Vector b, double metodo) {
        double lhs = Math.pow(a.suma(b).modulo(), 2);
        double rhs = Math.pow(a.modulo(), 2) + Math.pow(b.modulo(), 2);
        return Math.abs(lhs - rhs) < 1e-6;
    }
    public boolean Paralela(Vector a, Vector b) {
        Vector cruz = a.productoCruz(b);
        return Math.abs(cruz.modulo()) < 1e-6;
    }
    public boolean Paralela(Vector a, Vector b, int metodo) {
        return a.productoCruz(b).modulo() == 0;
    }
    public Vector proyeccion(Vector a, Vector b) {
        double escalar = a.productoPunto(b) / Math.pow(b.modulo(), 2);
        return b.escalar(escalar);
    }
    public double componente(Vector a, Vector b) {
        return a.productoPunto(b) / b.modulo();
    }
}